package com.whstone.api.command.onokeymanage.switchIp;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by xzli on 2019/05/21.
 */
public class SendSwitchScanIPInEbackupCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchScanIPInEbackup";

    private Integer switchId;

    private String ebackupHostIp;

    private String scanIp;

    private Integer switchFlag;

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }

    public String getEbackupHostIp() {
        return ebackupHostIp;
    }

    public void setEbackupHostIp(String ebackupHostIp) {
        this.ebackupHostIp = ebackupHostIp;
        params.put(ApiConstants.STAND_IP, ebackupHostIp);
    }

    public String getScanIp() {
        return scanIp;
    }

    public void setScanIp(String scanIp) {
        this.scanIp = scanIp;
        params.put(ApiConstants.TARGET_IP, scanIp);
    }

    public Integer getSwitchFlag() {
        return switchFlag;
    }

    public void setSwitchFlag(Integer switchFlag) {
        this.switchFlag = switchFlag;
        params.put(ApiConstants.SWITCH_FLAG, switchFlag);
    }

    public SendSwitchScanIPInEbackupCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWITCHSCANIPINEBACKUPRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }

    @Override
    public String toString() {
        return "SendSwitchScanIPInEbackupCmd{" +
                "switchId=" + switchId +
                ", ebackupHostIp='" + ebackupHostIp + '\'' +
                ", scanIp='" + scanIp + '\'' +
                ", switchFlag=" + switchFlag +
                '}';
    }
}
