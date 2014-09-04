/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class block_finished_alert extends peer_alert {
  private long swigCPtr;

  protected block_finished_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.block_finished_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(block_finished_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_block_finished_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String message() {
    return libtorrent_jni.block_finished_alert_message(swigCPtr, this);
  }

  public void setBlock_index(int value) {
    libtorrent_jni.block_finished_alert_block_index_set(swigCPtr, this, value);
  }

  public int getBlock_index() {
    return libtorrent_jni.block_finished_alert_block_index_get(swigCPtr, this);
  }

  public void setPiece_index(int value) {
    libtorrent_jni.block_finished_alert_piece_index_set(swigCPtr, this, value);
  }

  public int getPiece_index() {
    return libtorrent_jni.block_finished_alert_piece_index_get(swigCPtr, this);
  }

}