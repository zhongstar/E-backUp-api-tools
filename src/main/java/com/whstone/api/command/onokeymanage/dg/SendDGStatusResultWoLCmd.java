package com.whstone.api.command.onokeymanage.dg;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/8.
 */
public class SendDGStatusResultWoLCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendDGStatusResult";

    private Integer initId;

    private Integer status;

    private String message;

    private String priUniqueName;

    private String standUniqueName;

    private Integer priStatus;

    private Integer standStatus;


    @Override
    public String toString() {
        return "SendDGStatusResultWoLCmd{" +
                "initId=" + initId +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", priUniqueName='" + priUniqueName + '\'' +
                ", standUniqueName='" + standUniqueName + '\'' +
                ", priStatus=" + priStatus +
                ", standStatus=" + standStatus +
                '}';
    }

    public Integer getPriStatus() {
        return priStatus;
    }

    public void setPriStatus(Integer priStatus) {
        this.priStatus = priStatus;
        params.put(ApiConstants.PRI_STATUS, priStatus);

    }

    public Integer getStandStatus() {
        return standStatus;
    }

    public void setStandStatus(Integer standStatus) {
        this.standStatus = standStatus;
        params.put(ApiConstants.STAND_STATUS, standStatus);
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

    public SendDGStatusResultWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDDGSTATUSRESRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public String getResult() {

        return responseJSONObject.getString("result");

    }
}

