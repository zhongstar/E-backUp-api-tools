package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by xzli on 2019/05/13.
 */
public class SendDatabaseInfoCmd extends BaseCmd {

    private static final String COMMAND_NAME = "sendDatabaseInfo";

    private String instanceName;

    public SendDatabaseInfoCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDDATABASEINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        params.put(ApiConstants.INSTANCE_DATABASE_NAME, instanceName);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
