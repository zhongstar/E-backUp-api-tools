package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by wanqian on 2018/10/9.
 */
public class SendVmHostServerCmd extends BaseCmd {

    private static final String COMMAND_NAME = "sendVmHostServerInfo";

    private String serverIp;

    private String serverLoginName;

    private String serverPassword;

    private String serverType;

    public SendVmHostServerCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDVMHOSTSERVERRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
        params.put(ApiConstants.SERVER_IP, serverIp);
    }

    public String getServerLoginName() {
        return serverLoginName;
    }

    public void setServerLoginName(String serverLoginName) {
        this.serverLoginName = serverLoginName;
        params.put(ApiConstants.SERVERLOGINNAME, serverLoginName);
    }

    public String getServerPassword() {
        return serverPassword;
    }

    public void setServerPassword(String serverPassword) {
        this.serverPassword = serverPassword;
        params.put(ApiConstants.SERVERPASSWORD, serverPassword);
    }

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
        params.put(ApiConstants.SERVER_TYPE, serverType);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
