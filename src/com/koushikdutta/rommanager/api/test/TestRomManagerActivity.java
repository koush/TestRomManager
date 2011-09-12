package com.koushikdutta.rommanager.api.test;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder;
import com.koushikdutta.rommanager.api.IROMManagerAPIService;

public class TestRomManagerActivity extends Activity {
    IROMManagerAPIService mService;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // connect to rom manager. this should ideally be done only when necessary.
        Intent i = new Intent("com.koushikdutta.rommanager.api.BIND");
        try {
            bindService(i, new ServiceConnection() {
                @Override
                public void onServiceDisconnected(ComponentName name) {
                }

                @Override
                public void onServiceConnected(ComponentName name, IBinder service) {
                    mService = IROMManagerAPIService.Stub.asInterface(service);
                }
            }, Service.BIND_AUTO_CREATE);
        }
        catch (Exception ex) {
            // connecting to rom manager failed, is it installed and 4.5.0.0+?
            ex.printStackTrace();
        }

        setContentView(R.layout.main);

        // perform a nandroid backup.
        // you could also modify this to install a zip before/after the backup easily. Try it!
        // createClockworkRecoveryScriptBuilder requires ROM Manager premium.
        Button backup = (Button)findViewById(R.id.backup);
        backup.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mService == null) {
                    // no rom manager connection available
                    return;
                }
                try {
                    IClockworkRecoveryScriptBuilder builder = mService.createClockworkRecoveryScriptBuilder();
                    builder.backup();
                    builder.runScript();
                }
                catch (Exception ex) {
                    // do some error handling here
                    ex.printStackTrace();
                }
            }
        });

        // install a single zip. You could use this to do an OTA update.
        Button zip = (Button)findViewById(R.id.installzip);
        zip.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mService == null) {
                    // connecting to rom manager failed, is it installed and 4.5.0.0+?
                    return;
                }
                try {
                    mService.installZip("/sdcard/update.zip");
                }
                catch (Exception ex) {
                    // do some error handling here
                    ex.printStackTrace();
                }
            }
        });
    }
}
