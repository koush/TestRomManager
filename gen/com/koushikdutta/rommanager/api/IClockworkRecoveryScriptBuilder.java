/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/koush/Documents/workspace/TestRomManager/src/com/koushikdutta/rommanager/api/IClockworkRecoveryScriptBuilder.aidl
 */
package com.koushikdutta.rommanager.api;
public interface IClockworkRecoveryScriptBuilder extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder
{
private static final java.lang.String DESCRIPTOR = "com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder interface,
 * generating a proxy if needed.
 */
public static com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder))) {
return ((com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder)iin);
}
return new com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder.Stub.Proxy(obj);
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
case TRANSACTION_backupWithPath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.backupWithPath(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_backup:
{
data.enforceInterface(DESCRIPTOR);
this.backup();
reply.writeNoException();
return true;
}
case TRANSACTION_restore:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _arg3;
_arg3 = (0!=data.readInt());
boolean _arg4;
_arg4 = (0!=data.readInt());
boolean _arg5;
_arg5 = (0!=data.readInt());
this.restore(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
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
case TRANSACTION_print:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.print(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_runProgram:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<java.lang.String> _arg1;
_arg1 = data.createStringArrayList();
this.runProgram(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_format:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.format(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_mount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.mount(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_umount:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.umount(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_runScript:
{
data.enforceInterface(DESCRIPTOR);
this.runScript();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder
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
public void backupWithPath(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_backupWithPath, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void backup() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_backup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void restore(java.lang.String path, boolean boot, boolean system, boolean data, boolean cache, boolean sdext) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
_data.writeInt(((boot)?(1):(0)));
_data.writeInt(((system)?(1):(0)));
_data.writeInt(((data)?(1):(0)));
_data.writeInt(((cache)?(1):(0)));
_data.writeInt(((sdext)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_restore, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
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
public void print(java.lang.String string) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(string);
mRemote.transact(Stub.TRANSACTION_print, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void runProgram(java.lang.String program, java.util.List<java.lang.String> args) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(program);
_data.writeStringList(args);
mRemote.transact(Stub.TRANSACTION_runProgram, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void format(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_format, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void mount(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_mount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void umount(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_umount, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void runScript() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_runScript, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_backupWithPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_backup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_restore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_installZip = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_print = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_runProgram = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_format = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_mount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_umount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_runScript = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public void backupWithPath(java.lang.String path) throws android.os.RemoteException;
public void backup() throws android.os.RemoteException;
public void restore(java.lang.String path, boolean boot, boolean system, boolean data, boolean cache, boolean sdext) throws android.os.RemoteException;
public void installZip(java.lang.String path) throws android.os.RemoteException;
public void print(java.lang.String string) throws android.os.RemoteException;
public void runProgram(java.lang.String program, java.util.List<java.lang.String> args) throws android.os.RemoteException;
public void format(java.lang.String path) throws android.os.RemoteException;
public void mount(java.lang.String path) throws android.os.RemoteException;
public void umount(java.lang.String path) throws android.os.RemoteException;
public void runScript() throws android.os.RemoteException;
}
