package com.whstone.api.response;


import com.whstone.api.exception.ExceptionProxyObject;

import java.util.List;

public class ExceptionResponse {

    /**
     * List of uuids associated with this error
     */
    private List<ExceptionProxyObject> uuidList;

    /**
     * numeric code associated with this error
     */
    private Integer errorcode;

    /**
     * cloudstack exception error code associated with this error
     */
    private Integer cserrorcode;

    /**
     * the text associated with this error
     */
    private String errortext = "Command failed due to Internal Server Error";

    public List<ExceptionProxyObject> getUuidList() {
        return uuidList;
    }

    public void setUuidList(List<ExceptionProxyObject> uuidList) {
        this.uuidList = uuidList;
    }

    public Integer getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(Integer errorcode) {
        this.errorcode = errorcode;
    }

    public Integer getCserrorcode() {
        return cserrorcode;
    }

    public void setCserrorcode(Integer cserrorcode) {
        this.cserrorcode = cserrorcode;
    }

    public String getErrortext() {
        return errortext;
    }

    public void setErrortext(String errortext) {
        this.errortext = errortext;
    }

    @Override
    public String toString() {
        return ("Error Code: " + errorcode + " Error text: " + errortext);
    }
}
