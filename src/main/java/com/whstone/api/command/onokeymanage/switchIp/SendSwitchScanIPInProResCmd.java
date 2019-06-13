package com.whstone.api.command.onokeymanage.switchIp;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by zhongkf on 2018/10/10
 */
public class SendSwitchScanIPInProResCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchScanIPInProRes";

    private Integer switchId;

    private String message;

    private Integer status;

    private Integer switchFlag;

    public SendSwitchScanIPInProResCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWITCHSCANIPINPRORESRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        params.put(ApiConstants.MESSAGE, message);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        params.put(ApiConstants.STATUS, status);
    }

    public Integer getSwitchFlag() {
        return switchFlag;
    }
    public void setSwitchFlag(Integer switchFlag) {
        this.switchFlag = switchFlag;
        params.put(ApiConstants.SWITCH_FLAG, switchFlag);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }

    @Override
    public String toString() {
        return "SendSwitchScanIPInProResCmd{" +
                "switchId=" + switchId +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", switchFlag=" + switchFlag +
                '}';
    }
}