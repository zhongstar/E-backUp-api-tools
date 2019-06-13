package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/8.
 */
public class SendSwitchIpInfoResWinCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchIpInfoResult";


    private Integer switchId;

    private Integer state;

    private String message;


    @Override
    public String toString() {
        return "SendSwitchIpInfoResWinCmd{" +
                "switchId=" + switchId +
                ", state=" + state +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        params.put(ApiConstants.STATE, state);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        params.put(ApiConstants.MESSAGE, message);
    }


    public SendSwitchIpInfoResWinCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORASWITCHIPINFORESRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
