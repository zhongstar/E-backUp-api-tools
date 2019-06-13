package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by wanqian on 2018/10/15.
 */
public class SendStopAllJobCmd extends BaseCmd {

    private static final String COMMAND_NAME = "sendStopAllJob";

    public SendStopAllJobCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSTOPALLJOBRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {
        return responseJSONObject.getString("result");
    }
}
