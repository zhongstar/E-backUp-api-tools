package com.whstone.api.command.onokeymanage.switchIp;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by xzli on 2019/05/28
 */
public class SendSwitchScanIPInEbackupResCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchScanIPInEbackupRes";

    private Integer switchId;

    private String message;

    private Integer status;

    private String listenerName;

    private Integer switchFlag;

    public SendSwitchScanIPInEbackupResCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWITCHSCANIPINEBACKUPRESRESPONSE);
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

    public String getListenerName() {
        return listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
        params.put(ApiConstants.HOST_NAME, listenerName);
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
        return "SendSwitchScanIPInEbackupResCmd{" +
                "switchId=" + switchId +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", listenerName='" + listenerName + '\'' +
                ", switchFlag=" + switchFlag +
                '}';
    }
}