package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/7.
 */
public class SendObserverInfoResCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendObserverRes";

    private Integer initId;

    private Integer status;

    private String message;

    private String priUniqueName;

    private String standUniqueName;

    @Override
    public String toString() {
        return "SendObserverInfoResCmd{" +
                "initId=" + initId +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", priUniqueName='" + priUniqueName + '\'' +
                ", standUniqueName='" + standUniqueName + '\'' +
                '}';
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        params.put(ApiConstants.STATUS, status);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        params.put(ApiConstants.MESSAGE, message);
    }


    public String getPriUniqueName() {
        return priUniqueName;
    }

    public void setPriUniqueName(String priUniqueName) {
        this.priUniqueName = priUniqueName;
        params.put(ApiConstants.PRI_UNIQUE_NAME, priUniqueName);
    }

    public String getStandUniqueName() {
        return standUniqueName;
    }

    public void setStandUniqueName(String standUniqueName) {
        this.standUniqueName = standUniqueName;
        params.put(ApiConstants.STAND_UNIQUE_NAME, standUniqueName);
    }

    public SendObserverInfoResCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDOBSERVERRESRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
