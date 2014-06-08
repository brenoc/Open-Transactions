/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_otapi_WRAP_H_
#define SWIG_otapi_WRAP_H_

class SwigDirector_OTNameLookup : public OTNameLookup, public Swig::Director {

public:
    SwigDirector_OTNameLookup();
    virtual ~SwigDirector_OTNameLookup();
    virtual std::string GetNymName(std::string const &str_id, std::string const *p_server_id = NULL) const;
    virtual std::string GetAcctName(std::string const &str_id, std::string const *p_nym_id = NULL, std::string const *p_server_id = NULL, std::string const *p_asset_id = NULL) const;
    virtual std::string GetAddressName(std::string const &str_address) const;

    typedef char * (* SWIG_Callback0_t)(void *dobj, char *, void *);
    typedef char * (* SWIG_Callback1_t)(void *dobj, char *);
    typedef char * (* SWIG_Callback2_t)(void *dobj, char *, void *, void *, void *);
    typedef char * (* SWIG_Callback3_t)(void *dobj, char *, void *, void *);
    typedef char * (* SWIG_Callback4_t)(void *dobj, char *, void *);
    typedef char * (* SWIG_Callback5_t)(void *dobj, char *);
    typedef char * (* SWIG_Callback6_t)(void *dobj, char *);
    void swig_connect_director(void* dobj, SWIG_Callback0_t callbackGetNymName__SWIG_0, SWIG_Callback1_t callbackGetNymName__SWIG_1, SWIG_Callback2_t callbackGetAcctName__SWIG_0, SWIG_Callback3_t callbackGetAcctName__SWIG_1, SWIG_Callback4_t callbackGetAcctName__SWIG_2, SWIG_Callback5_t callbackGetAcctName__SWIG_3, SWIG_Callback6_t callbackGetAddressName);

private:
    void swig_init_callbacks();
    void *d_object;
    SWIG_Callback0_t swig_callback_GetNymName__SWIG_0;
    SWIG_Callback1_t swig_callback_GetNymName__SWIG_1;
    SWIG_Callback2_t swig_callback_GetAcctName__SWIG_0;
    SWIG_Callback3_t swig_callback_GetAcctName__SWIG_1;
    SWIG_Callback4_t swig_callback_GetAcctName__SWIG_2;
    SWIG_Callback5_t swig_callback_GetAcctName__SWIG_3;
    SWIG_Callback6_t swig_callback_GetAddressName;
};


#endif
