package com.whstone.api.command.onokeymanage.switchIp;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by xzli on 2019/05/21.
 */
public class SendSwitchVipInEbackupCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchVipInEbackup";

    private Integer switchId;

    private String ebackupHostIp;//易备环境IP

    private String vips; //生产环境所有节点的VIP

    private String tmpVips; //生产环境所有节点的临时VIP

    private Integer switchFlag;//VIP切换方向 1：生产环境切换到易备环境  2：易备环境切换到生产环境

    public SendSwitchVipInEbackupCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWITCHVIPINEBACKUPRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }

    public String getEbackupHostIp() {
        return ebackupHostIp;
    }

    public void setEbackupHostIp(String ebackupHostIp) {
        this.ebackupHostIp = ebackupHostIp;
        params.put(ApiConstants.IP, ebackupHostIp);
    }

    public String getVips() {
        return vips;
    }

    public void setVips(String vips) {
        this.vips = vips;
        params.put(ApiConstants.VIPS, vips);
    }

    public String getTmpVips() {
        return tmpVips;
    }

    public void setTmpVips(String tmpVips) {
        this.tmpVips = tmpVips;
        params.put(ApiConstants.TMP_VIPS, tmpVips);
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
        return "SendSwitchVipInProCmd{" +
                "switchId=" + switchId +
                ", ebackupHostIp='" + ebackupHostIp + '\'' +
                ", vips='" + vips + '\'' +
                ", tmpVips='" + tmpVips + '\'' +
                ", switchFlag=" + switchFlag +
                '}';
    }
}
