package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by zhongkf on 2018/10/19.
 */
public class SendSwiStandInsCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwiStandIns";

    private Integer switchId;

    private String tnsName;

    private String dbUniqueName;

    private String dbPass;


    @Override
    public String toString() {
        return "SendOraSwitchInfoCmd{" +
                "switchId=" + switchId +
                ", tnsName='" + tnsName + '\'' +
                ", dbUniqueName='" + dbUniqueName + '\'' +
                ", dbPass='" + dbPass;
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

    public SendSwiStandInsCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWISTANDINSRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
