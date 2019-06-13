package com.whstone.api.command.onokeymanage.dg;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/2.
 */
public class SendOracleDGbrokerParamCmd extends BaseCmd {


    private static final String COMMAND_NAME = "SendOracleDGbrokerParam";

    private Integer initId;

    private String priTnsname;

    private String standTnsname;

    private String tmpPort;

    private String priUniqueName;

    private String standUniqueName;

    private String priHostname;

    private String standHostname;

    private String databasePass;

    private String oracleSid;

    @Override
    public String toString() {
        return "SendOracleDGbrokerParamCmd{" +
                "initId=" + initId +
                ", priTnsname='" + priTnsname + '\'' +
                ", standTnsname='" + standTnsname + '\'' +
                ", tmpPort='" + tmpPort + '\'' +
                ", priUniqueName='" + priUniqueName + '\'' +
                ", standUniqueName='" + standUniqueName + '\'' +
                ", priHostname='" + priHostname + '\'' +
                ", standHostname='" + standHostname + '\'' +
                ", databasePass='" + databasePass + '\'' +
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

    public String getPriHostname() {
        return priHostname;
    }

    public void setPriHostname(String priHostname) {
        this.priHostname = priHostname;
        params.put(ApiConstants.PRI_HOSTNAME, priHostname);
    }

    public String getStandHostname() {
        return standHostname;
    }

    public void setStandHostname(String standHostname) {
        this.standHostname = standHostname;
        params.put(ApiConstants.STAND_HOSTNAME, standHostname);
    }

    public String getDatabasePass() {
        return databasePass;
    }

    public void setDatabasePass(String databasePass) {
        this.databasePass = databasePass;
        params.put(ApiConstants.DATABASE_PASS, databasePass);
    }

    public String getOracleSid() {
        return oracleSid;
    }

    public void setOracleSid(String oracleSid) {
        this.oracleSid = oracleSid;
        params.put(ApiConstants.ORACLE_SID, oracleSid);
    }

    public SendOracleDGbrokerParamCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLEDGBROKERPARAMREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }

}
