package com.whstone.api.command.onokeymanage.dg;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/8.
 */
public class SendDGStatusWoLCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendDGStatus";

    private Integer initId;

    private String dbPass;

    private String priTnsname;

    private String standTnsname;

    private String priUniqueName;

    private String standUniqueName;

    private String oracleSid;

    private String tmpPort;

    private String priIp;

    private String standIp;

    @Override
    public String toString() {
        return "SendDGStatusWoLCmd{" +
                "initId=" + initId +
                ", dbPass='" + dbPass + '\'' +
                ", priTnsname='" + priTnsname + '\'' +
                ", standTnsname='" + standTnsname + '\'' +
                ", priUniqueName='" + priUniqueName + '\'' +
                ", standUniqueName='" + standUniqueName + '\'' +
                ", oracleSid='" + oracleSid + '\'' +
                ", tmpPort='" + tmpPort + '\'' +
                ", priIp='" + priIp + '\'' +
                ", standIp='" + standIp + '\'' +
                '}';
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
    }

    public String getPriTnsname() {
        return priTnsname;
    }

    public void setPriTnsname(String priTnsname) {
        this.priTnsname = priTnsname;
        params.put(ApiConstants.PRI_TNSNAME, priTnsname);

    }

    public String getStandTnsname() {
        return standTnsname;
    }

    public void setStandTnsname(String standTnsname) {
        this.standTnsname = standTnsname;
        params.put(ApiConstants.STAND_TNSNAME, standTnsname);
    }

    public String getTmpPort() {
        return tmpPort;
    }

    public void setTmpPort(String tmpPort) {
        this.tmpPort = tmpPort;
        params.put(ApiConstants.TMP_PORT, tmpPort);
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

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
        params.put(ApiConstants.DB_PASS, dbPass);
    }

    public String getPriIp() {
        return priIp;
    }

    public void setPriIp(String priIp) {
        this.priIp = priIp;
        params.put(ApiConstants.PRIMARY_IP, priIp);
    }

    public String getOracleSid() {
        return oracleSid;
    }

    public void setOracleSid(String oracleSid) {
        this.oracleSid = oracleSid;
        params.put(ApiConstants.ORACLE_SID, oracleSid);
    }

    public String getStandIp() {
        return standIp;
    }

    public void setStandIp(String standIp) {
        this.standIp = standIp;
        params.put(ApiConstants.STAND_IP, standIp);
    }

    public SendDGStatusWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDDGSTATUSREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }

}

