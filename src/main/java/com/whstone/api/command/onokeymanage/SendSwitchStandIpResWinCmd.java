package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by zhongkf on 2018/10/10
 */
public class SendSwitchStandIpResWinCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchStandIpResWin";

    private Integer switchId;

    private String message;

    private Integer status;

    public SendSwitchStandIpResWinCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWITCHSTANDIPRESWINRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        params.put(ApiConstants.MESSAGE, message);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        params.put(ApiConstants.STATUS, status);
    }

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}