package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/12.
 */
public class SendSqlserverDosCmd extends BaseCmd {
    private static final String COMMAND_NAME = "SendSqlserverDos";

    private String cmd;

    private String ip;


    @Override
    public String toString() {
        return "SendSqlserverDosCmd{" +
                "cmd='" + cmd + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
        params.put(ApiConstants.CMD, cmd);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
        params.put(ApiConstants.IP, ip);
    }

    public SendSqlserverDosCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSQLSESRVERCMDREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
