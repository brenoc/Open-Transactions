/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

public class OTLookupCaller {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OTLookupCaller(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OTLookupCaller obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_OTLookupCaller(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OTLookupCaller() {
    this(otapiJNI.new_OTLookupCaller(), true);
  }

  public OTNameLookup getCallback() {
    long cPtr = otapiJNI.OTLookupCaller_getCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new OTNameLookup(cPtr, false);
  }

  public void delCallback() {
    otapiJNI.OTLookupCaller_delCallback(swigCPtr, this);
  }

  public void setCallback(OTNameLookup cb) {
    otapiJNI.OTLookupCaller_setCallback(swigCPtr, this, OTNameLookup.getCPtr(cb), cb);
  }

  public boolean isCallbackSet() {
    return otapiJNI.OTLookupCaller_isCallbackSet(swigCPtr, this);
  }

  public String GetNymName(String str_id, SWIGTYPE_p_std__string p_server_id) {
    return otapiJNI.OTLookupCaller_GetNymName__SWIG_0(swigCPtr, this, str_id, SWIGTYPE_p_std__string.getCPtr(p_server_id));
  }

  public String GetNymName(String str_id) {
    return otapiJNI.OTLookupCaller_GetNymName__SWIG_1(swigCPtr, this, str_id);
  }

  public String GetAcctName(String str_id, SWIGTYPE_p_std__string p_nym_id, SWIGTYPE_p_std__string p_server_id, SWIGTYPE_p_std__string p_asset_id) {
    return otapiJNI.OTLookupCaller_GetAcctName__SWIG_0(swigCPtr, this, str_id, SWIGTYPE_p_std__string.getCPtr(p_nym_id), SWIGTYPE_p_std__string.getCPtr(p_server_id), SWIGTYPE_p_std__string.getCPtr(p_asset_id));
  }

  public String GetAcctName(String str_id, SWIGTYPE_p_std__string p_nym_id, SWIGTYPE_p_std__string p_server_id) {
    return otapiJNI.OTLookupCaller_GetAcctName__SWIG_1(swigCPtr, this, str_id, SWIGTYPE_p_std__string.getCPtr(p_nym_id), SWIGTYPE_p_std__string.getCPtr(p_server_id));
  }

  public String GetAcctName(String str_id, SWIGTYPE_p_std__string p_nym_id) {
    return otapiJNI.OTLookupCaller_GetAcctName__SWIG_2(swigCPtr, this, str_id, SWIGTYPE_p_std__string.getCPtr(p_nym_id));
  }

  public String GetAcctName(String str_id) {
    return otapiJNI.OTLookupCaller_GetAcctName__SWIG_3(swigCPtr, this, str_id);
  }

  public String GetAddressName(String str_address) {
    return otapiJNI.OTLookupCaller_GetAddressName(swigCPtr, this, str_address);
  }

}
