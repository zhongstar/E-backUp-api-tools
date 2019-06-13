package com.whstone.api.command.onokeymanage.switchIp;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by xzli on 2019/05/21.
 */
public class SendSwitchVipInProCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSwitchVipInPro";

    private Integer switchId;

    private String proHostIp;     //rac环境vip

    private String vip;     //rac环境vip

    private String tmpVip;     //rac环境临时vip

    private String vips; //生产环境所有节点的VIP

    private String tmpVips; //生产环境所有节点的临时VIP

    private String priDbuniqueName; //生产库数据库唯一名

    private Integer switchFlag;//VIP切换方向 1：生产环境切换到易备环境  2：易备环境切换到生产环境

    public SendSwitchVipInProCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSWITCHVIPINPRORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
        params.put(ApiConstants.SWITCHID, switchId);
    }

    public String getProHostIp() {
        return proHostIp;
    }

    public void setProHostIp(String proHostIp) {
        this.proHostIp = proHostIp;
        params.put(ApiConstants.IP, proHostIp);
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
        params.put(ApiConstants.VIP, vip);
    }

    public String getTmpVip() {
        return tmpVip;
    }

    public void setTmpVip(String tmpVip) {
        this.tmpVip = tmpVip;
        params.put(ApiConstants.TMP_VIP, tmpVip);
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

    public String getPriDbuniqueName() {
        return priDbuniqueName;
    }

    public void setPriDbuniqueName(String priDbuniqueName) {
        this.priDbuniqueName = priDbuniqueName;
        params.put(ApiConstants.DBUNIQUENAME, priDbuniqueName);
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
                ", proHostIp='" + proHostIp + '\'' +
                ", vip='" + vip + '\'' +
                ", tmpVip='" + tmpVip + '\'' +
                ", vips='" + vips + '\'' +
                ", tmpVips='" + tmpVips + '\'' +
                ", priDbuniqueName='" + priDbuniqueName + '\'' +
                ", switchFlag=" + switchFlag +
                '}';
    }
}
