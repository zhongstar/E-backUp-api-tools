package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/7.
 */
public class SendObserverInfoCmd extends BaseCmd {


    private static final String COMMAND_NAME = "SendObserverInfo";


    private Integer initId;

    private String dbPass;

    private String priTnsName;


    private String standTnsName;

    private String priUniqueName;

    private String standUniqueName;


    @Override
    public String toString() {
        return "SendObserverInfoCmd{" +
                "initId=" + initId +
                ", dbPass='" + dbPass + '\'' +
                ", priTnsName='" + priTnsName + '\'' +
                ", standTnsName='" + standTnsName + '\'' +
                ", priUniqueName='" + priUniqueName + '\'' +
                ", standUniqueName='" + standUniqueName + '\'' +
                '}';
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
    }


    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
        params.put(ApiConstants.DB_PASS, dbPass);

    }

    public String getPriTnsname() {
        return priTnsName;
    }

    public void setPriTnsname(String priTnsName) {
        this.priTnsName = priTnsName;
        params.put(ApiConstants.PRI_TNSNAME, priTnsName);
    }

    public String getStandTnsname() {
        return standTnsName;
    }

    public void setStandTnsname(String standTnsName) {
        this.standTnsName = standTnsName;
        params.put(ApiConstants.STAND_TNSNAME, standTnsName);
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


    public SendObserverInfoCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDOBSERVERINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
