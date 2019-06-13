package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/19.
 */
public class GetOracleHostNameCmd extends BaseCmd {


    private static final String COMMAND_NAME = "GetOracleHostName";


    public GetOracleHostNameCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.GETORACLEHOSTNAME);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("hostname");

    }
}
