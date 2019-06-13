package com.whstone.api.command.onokeymanage.cancelConnect;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/14.
 */
public class SendOracleCancelConnPriResWoLCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOracleCancelConnPriRes";


    private Integer initId;

    private String initIds;

    private Integer status;

    private String message;

    @Override
    public String toString() {
        return "SendOracleCancelConnPriResWoLCmd{" +
                "initId=" + initId +
                ", initIds='" + initIds + '\'' +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                "} " + super.toString();
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
    }

    public String getInitIds() {
        return initIds;
    }

    public void setInitIds(String initIds) {
        this.initIds = initIds;
        params.put(ApiConstants.INIT_IDS, initIds);
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

    public SendOracleCancelConnPriResWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLECANCELCONNPRIRRESESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
