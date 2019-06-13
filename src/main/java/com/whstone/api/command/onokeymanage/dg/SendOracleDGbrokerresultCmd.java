package com.whstone.api.command.onokeymanage.dg;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/6.
 */
public class SendOracleDGbrokerresultCmd extends BaseCmd {


    private static final String COMMAND_NAME = "SendOracleDGbrokerresult";

    private Integer initId;

    private Integer status;

    private String message;

    @Override
    public String toString() {
        return "SendOracleDGbrokerresultCmd{" +
                "initId=" + initId +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        params.put(ApiConstants.STATUS, status);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        params.put(ApiConstants.MESSAGE, message);
    }

    public SendOracleDGbrokerresultCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLEDGBROKERRESULTREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
