package com.whstone.api.command.onokeymanage.switchIp;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by xzli on 2019/05/21.
 */
public class SendSwitchScanIPInProCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchScanIPInPro";

    private Integer switchId;

    private Integer switchFlag;

    public SendSwitchScanIPInProCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWITCHSCANIPINPRORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
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
        return "SendSwitchScanIPInProCmd{" +
                "switchId=" + switchId +
                ", switchFlag=" + switchFlag +
                '}';
    }
}
