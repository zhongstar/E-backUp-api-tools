package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by zhongkf on 2018/10/19.
 */
public class SendSwiStandInsResCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwiStandInsRes";

    private Integer switchId;

    private Integer status;

    private String message;

    private Integer dgStandRole;

    @Override
    public String toString() {
        return "SendSwiStandInsResCmd{" +
                "switchId=" + switchId +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", dgStandRole=" + dgStandRole +
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

    public Integer getDgStandRole() {
        return dgStandRole;
    }

    public void setDgStandRole(Integer dgStandRole) {
        this.dgStandRole = dgStandRole;
        params.put(ApiConstants.DG_STAND_ROLE, dgStandRole);
    }

    public SendSwiStandInsResCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWISTANDINSRESRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
