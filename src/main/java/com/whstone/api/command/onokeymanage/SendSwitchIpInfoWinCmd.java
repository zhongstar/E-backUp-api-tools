package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/8.
 */
public class SendSwitchIpInfoWinCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchIpInfo";


    private Integer switchId;

    private Integer state;

    private String message;

    private String proIp;

    private String proLoginName;

    private String proLoginPass;

    private String backupIp;

    private String tempIP;

    private String defaultGateway;

    @Override
    public String toString() {
        return "SendSwitchIpInfoWinCmd{" +
                "switchId=" + switchId +
                ", state=" + state +
                ", message='" + message + '\'' +
                ", proIp='" + proIp + '\'' +
                ", proLoginName='" + proLoginName + '\'' +
                ", proLoginPass='" + proLoginPass + '\'' +
                ", backupIp='" + backupIp + '\'' +
                ", tempIP='" + tempIP + '\'' +
                ", defaultGateway='" + defaultGateway + '\'' +
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

    public String getProIp() {
        return proIp;
    }

    public void setProIp(String proIp) {
        this.proIp = proIp;
        params.put(ApiConstants.PRODUCTION_IP, proIp);
    }

    public String getProLoginName() {
        return proLoginName;
    }

    public void setProLoginName(String proLoginName) {
        this.proLoginName = proLoginName;
        params.put(ApiConstants.PRO_LOGINNAME, proLoginName);
    }

    public String getProLoginPass() {
        return proLoginPass;
    }

    public void setProLoginPass(String proLoginPass) {
        this.proLoginPass = proLoginPass;
        params.put(ApiConstants.PRO_LOGINPASS, proLoginPass);
    }

    public String getBackupIp() {
        return backupIp;
    }

    public void setBackupIp(String backupIp) {
        this.backupIp = backupIp;
        params.put(ApiConstants.BACKUP_IP, backupIp);
    }

    public String getTempIP() {
        return tempIP;
    }

    public void setTempIP(String tempIP) {
        this.tempIP = tempIP;
        params.put(ApiConstants.TEMP_IP, tempIP);
    }

    public String getDefaultGateway() {
        return defaultGateway;
    }

    public void setDefaultGateway(String defaultGateway) {
        this.defaultGateway = defaultGateway;
        params.put(ApiConstants.DEFAULT_GATEWAY, defaultGateway);
    }

    public SendSwitchIpInfoWinCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORASWITCHIPINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
