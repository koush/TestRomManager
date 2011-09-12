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
        bindService(i, new ServiceConnection() {
            @Override
            public void onServiceDisconnected(ComponentName name) {
            }

            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                mService = IROMManagerAPIService.Stub.asInterface(service);
            }
        }, Service.BIND_AUTO_CREATE);
        
        setContentView(R.layout.main);

        Button backup = (Button)findViewById(R.id.backup);
        backup.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mService == null) {
                    // a proper ROM Manager version is not installed or is broken...
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

        Button zip = (Button)findViewById(R.id.installzip);
        zip.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mService == null) {
                    // a proper ROM Manager version is not installed or is broken...
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
