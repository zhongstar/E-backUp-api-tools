package com.whstone.api.command.onokeymanage.cancelConnect;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/14.
 */
public class SendOracleCancelConnPriWoLCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOracleCancelConnPri";

    private Integer initId;

    private String initIds;

    private String dbPass;

    private String logArchive;

    private String standIp;

    private String priTnsname;

    private String priLsn;

    private String oracleSid;

    private String tmpPort;


    @Override
    public String toString() {
        return "SendOracleCancelConnPriWoLCmd{" +
                "initId=" + initId +
                ", initIds='" + initIds + '\'' +
                ", dbPass='" + dbPass + '\'' +
                ", logArchive='" + logArchive + '\'' +
                ", standIp='" + standIp + '\'' +
                ", priTnsname='" + priTnsname + '\'' +
                ", priLsn='" + priLsn + '\'' +
                ", oracleSid='" + oracleSid + '\'' +
                ", tmpPort='" + tmpPort + '\'' +
                '}';
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
    }

    public String getInitIds() {
        return initIds;
    }

    public void setInitIds(String initIds) {
        this.initIds = initIds;
        params.put(ApiConstants.INIT_IDS, initIds);
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
        params.put(ApiConstants.DB_PASS, dbPass);
    }

    public String getLogArchive() {
        return logArchive;
    }

    public void setLogArchive(String logArchive) {
        this.logArchive = logArchive;
        params.put(ApiConstants.LOG_ARCHIVE, logArchive);
    }

    public String getStandIp() {
        return standIp;
    }

    public void setStandIp(String standIp) {
        this.standIp = standIp;
        params.put(ApiConstants.STAND_IP, standIp);
    }

    public String getPriTnsname() {
        return priTnsname;
    }

    public void setPriTnsname(String priTnsname) {
        this.priTnsname = priTnsname;
        params.put(ApiConstants.PRI_TNSNAME, priTnsname);
    }

    public String getPriLsn() {
        return priLsn;
    }

    public void setPriLsn(String priLsn) {
        this.priLsn = priLsn;
        params.put(ApiConstants.PRI_LSN, priLsn);
    }

    public String getOracleSid() {
        return oracleSid;
    }

    public void setOracleSid(String oracleSid) {
        this.oracleSid = oracleSid;
        params.put(ApiConstants.ORACLE_SID, oracleSid);
    }
    public String getTmpPort() {
        return tmpPort;
    }

    public void setTmpPort(String tmpPort) {
        this.tmpPort = tmpPort;
        params.put(ApiConstants.TMP_PORT, tmpPort);
    }
    public SendOracleCancelConnPriWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLECANCELCONNPRIRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }



    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
