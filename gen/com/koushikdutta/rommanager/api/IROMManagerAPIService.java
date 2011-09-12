/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/koush/Documents/workspace/TestRomManager/src/com/koushikdutta/rommanager/api/IROMManagerAPIService.aidl
 */
package com.koushikdutta.rommanager.api;
public interface IROMManagerAPIService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.koushikdutta.rommanager.api.IROMManagerAPIService
{
private static final java.lang.String DESCRIPTOR = "com.koushikdutta.rommanager.api.IROMManagerAPIService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.koushikdutta.rommanager.api.IROMManagerAPIService interface,
 * generating a proxy if needed.
 */
public static com.koushikdutta.rommanager.api.IROMManagerAPIService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.koushikdutta.rommanager.api.IROMManagerAPIService))) {
return ((com.koushikdutta.rommanager.api.IROMManagerAPIService)iin);
}
return new com.koushikdutta.rommanager.api.IROMManagerAPIService.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_isPremium:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isPremium();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_installZip:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.installZip(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createClockworkRecoveryScriptBuilder:
{
data.enforceInterface(DESCRIPTOR);
com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder _result = this.createClockworkRecoveryScriptBuilder();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.koushikdutta.rommanager.api.IROMManagerAPIService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public boolean isPremium() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isPremium, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void installZip(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_installZip, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// will return null if not premium

public com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder createClockworkRecoveryScriptBuilder() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_createClockworkRecoveryScriptBuilder, _data, _reply, 0);
_reply.readException();
_result = com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isPremium = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_installZip = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_createClockworkRecoveryScriptBuilder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public boolean isPremium() throws android.os.RemoteException;
public void installZip(java.lang.String path) throws android.os.RemoteException;
// will return null if not premium

public com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder createClockworkRecoveryScriptBuilder() throws android.os.RemoteException;
}
