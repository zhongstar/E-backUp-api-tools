package com.whstone.api.command.onokeymanage.cancelConnect;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/14.
 */
public class SendOracleCancelConnStandWoLCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOracleCancelConnStand";

    private Integer initId;

    private String initIds;

    private String dbPass;

    private String standTnsname;

    private String standLsn;

    private String logPaths;

    private String priIp;

    private String oracleSid;

    @Override
    public String toString() {
        return "SendOracleCancelConnStandWoLCmd{" +
                "initId=" + initId +
                ", initIds='" + initIds + '\'' +
                ", dbPass='" + dbPass + '\'' +
                ", standTnsname='" + standTnsname + '\'' +
                ", standLsn='" + standLsn + '\'' +
                ", logPaths='" + logPaths + '\'' +
                ", priIp='" + priIp + '\'' +
                ", oracleSid='" + oracleSid + '\'' +
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

    public String getStandTnsname() {
        return standTnsname;
    }

    public void setStandTnsname(String standTnsname) {
        this.standTnsname = standTnsname;
        params.put(ApiConstants.STAND_TNSNAME, standTnsname);
    }

    public String getStandLsn() {
        return standLsn;
    }

    public void setStandLsn(String standLsn) {
        this.standLsn = standLsn;
        params.put(ApiConstants.STAND_LSN, standLsn);
    }

    public String getLogPaths() {
        return logPaths;
    }

    public void setLogPaths(String logPaths) {
        this.logPaths = logPaths;
        params.put(ApiConstants.LOG_PATHS, logPaths);
    }

    public String getPriIp() {
        return priIp;
    }

    public void setPriIp(String priIp) {
        this.priIp = priIp;
        params.put(ApiConstants.PRI_IP, priIp);
    }


    public String getOracleSid() {
        return oracleSid;
    }

    public void setOracleSid(String oracleSid) {
        this.oracleSid = oracleSid;
        params.put(ApiConstants.ORACLE_SID, oracleSid);
    }

    public SendOracleCancelConnStandWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLECANCELCONNSTANDRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
