package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/7.
 */
public class SendOraSwitchInfoCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOraSwitchInfo";

    private Integer switchId;

    private String tnsName;

    private String dbUniqueName;

    private String dbPass;

    private String tmpPort;

    private String priHostnames;

    private String priDbname;


    @Override
    public String toString() {
        return "SendOraSwitchInfoCmd{" +
                "switchId=" + switchId +
                ", tnsName='" + tnsName + '\'' +
                ", dbUniqueName='" + dbUniqueName + '\'' +
                ", dbPass='" + dbPass + '\'' +
                ", tmpPort='" + tmpPort + '\'' +
                ", priHostnames='" + priHostnames + '\'' +
                ", priDbname='" + priDbname + '\'' +
                '}';
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }

    public String getTnsName() {
        return tnsName;
    }

    public void setTnsName(String tnsName) {
        this.tnsName = tnsName;
        params.put(ApiConstants.TNSNAME, tnsName);
    }

    public String getDbUniqueName() {
        return dbUniqueName;
    }

    public void setDbUniqueName(String dbUniqueName) {
        this.dbUniqueName = dbUniqueName;
        params.put(ApiConstants.DBUNIQUENAME, dbUniqueName);
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
        params.put(ApiConstants.DB_PASS, dbPass);
    }

    public String getTmpPort() {
        return tmpPort;
    }

    public void setTmpPort(String tmpPort) {
        this.tmpPort = tmpPort;
        params.put(ApiConstants.TMP_PORT, tmpPort);
    }

    public String getPriHostnames() {
        return priHostnames;
    }

    public void setPriHostnames(String priHostnames) {
        this.priHostnames = priHostnames;
        params.put(ApiConstants.PRI_HOSTNAMES, priHostnames);
    }

    public String getPriDbname() {
        return priDbname;
    }

    public void setPriDbname(String priDbname) {
        this.priDbname = priDbname;
        params.put(ApiConstants.PRI_DBNAME, priDbname);
    }

    public SendOraSwitchInfoCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORASWITCHINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
