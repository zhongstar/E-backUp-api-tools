package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

public class SendChangeIpInfoWinCmd extends BaseCmd {


    private static final String COMMAND_NAME = "SendChangeIpInfo";

    private Integer switchId;

    //原始IP
    private String originalIp;

    //目标IP
    private String targetIp;


    @Override
    public String toString() {
        return "SendChangeIpInfoWinCmd{" +
                "switchId=" + switchId +
                ", originalIp='" + originalIp + '\'' +
                ", targetIp='" + targetIp + '\'' +
                '}';
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }


    public String getOriginalIp() {
        return originalIp;
    }

    public void setOriginalIp(String originalIp) {
        this.originalIp = originalIp;
        params.put(ApiConstants.ORIGINAL_IP, originalIp);
    }

    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
        params.put(ApiConstants.TARGET_IP, targetIp);
    }

    public SendChangeIpInfoWinCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDCHANGEIPINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

//    public String getResult() {
//
//        return responseJSONObject.getString("result");
//
//    }
}
