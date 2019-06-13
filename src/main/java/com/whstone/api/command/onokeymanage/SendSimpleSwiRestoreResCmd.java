package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by zhongkf on 2018/10/19.
 */
public class SendSimpleSwiRestoreResCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSimpleSwitchRestoreRes";

    private Integer switchId;

    private Integer status;

    private String message;

    @Override
    public String toString() {
        return "SendSwiStandInsResCmd{" +
                "switchId=" + switchId +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
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

    public SendSimpleSwiRestoreResCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDRESTORESIMPLESWITCHRRESESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
