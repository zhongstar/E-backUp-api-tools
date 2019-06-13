package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/7/12.
 */
public class SendOracleRacCancelCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOracleRacCancelCmd";

    private String oracleSid; //主库实例名

    private String priLsn; //主库监听名


    public String getOracleSid() {
        return oracleSid;
    }

    public void setOracleSid(String oracleSid) {
        this.oracleSid = oracleSid;
        params.put(ApiConstants.ORACLE_SID, oracleSid);
    }

    public String getPriLsn() {
        return priLsn;
    }

    public void setPriLsn(String priLsn) {
        this.priLsn = priLsn;
        params.put(ApiConstants.PRI_LSN, priLsn);
    }

    public SendOracleRacCancelCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLERACCANCELREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public String getResult() {

        return responseJSONObject.getString("result");

    }

}
