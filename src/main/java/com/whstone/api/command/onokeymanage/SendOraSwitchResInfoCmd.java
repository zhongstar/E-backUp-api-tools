package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/8.
 */
public class SendOraSwitchResInfoCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOraSwitchResInfo";

    private Integer switchId;

    private Integer status;

    private String message;

    private String dgPriName;


    private String dgStandName;

    @Override
    public String toString() {
        return "SendOraSwitchResInfoCmd{" +
                "switchId=" + switchId +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", dgPriName='" + dgPriName + '\'' +
                ", dgStandName='" + dgStandName + '\'' +
                '}';
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
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

    public String getDgPriName() {
        return dgPriName;
    }

    public void setDgPriName(String dgPriName) {
        this.dgPriName = dgPriName;
        params.put(ApiConstants.DG_PRI_NAME, dgPriName);
    }

    public String getDgStandName() {
        return dgStandName;
    }

    public void setDgStandName(String dgStandName) {
        this.dgStandName = dgStandName;
        params.put(ApiConstants.DG_STAND_NAME, dgStandName);
    }

    public SendOraSwitchResInfoCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORASWITCHINFORESRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
