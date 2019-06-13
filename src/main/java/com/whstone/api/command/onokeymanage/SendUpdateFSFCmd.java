package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by zhongkf on 2018/10/19.
 */
public class SendUpdateFSFCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendUpdateFSF";

    private Integer initId;

    private String standTnsName;

    private String dbPass;

    private Integer updateFSF;


    @Override
    public String toString() {
        return "SendUpdateFSFCmd{" +
                "initId=" + initId +
                ", standTnsName='" + standTnsName + '\'' +
                ", dbPass='" + dbPass + '\'' +
                ", updateFSF=" + updateFSF +
                '}';
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
    }

    public String getStandTnsName() {
        return standTnsName;
    }

    public void setStandTnsName(String standTnsName) {
        this.standTnsName = standTnsName;
        params.put(ApiConstants.STAND_TNSNAME, standTnsName);
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
        params.put(ApiConstants.DB_PASS, dbPass);
    }

    public Integer getUpdateFSF() {
        return updateFSF;
    }

    public void setUpdateFSF(Integer updateFSF) {
        this.updateFSF = updateFSF;
        params.put(ApiConstants.UPDATE_FSF, updateFSF);
    }

    public SendUpdateFSFCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDUPDATEFSFRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
