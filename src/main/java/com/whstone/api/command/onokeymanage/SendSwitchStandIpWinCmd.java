package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by zhongkf on 2018/10/10
 */
public class SendSwitchStandIpWinCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchStandIpWin";

    private Integer switchId;

    private String sourceIp;

    private String targetIp;

    public SendSwitchStandIpWinCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWITCHSTANDIPWINRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        params.put(ApiConstants.SOURCEIP, sourceIp);
    }

    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
        params.put(ApiConstants.TARGETIP, targetIp);
    }

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}