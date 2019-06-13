package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

import java.math.BigDecimal;

/**
 * Created by weijun on 2018/6/7.
 */
public class SendCanBackupVmCmd extends BaseCmd {

    private static final String COMMAND_NAME = "sendCanBackVmInfo";

    private BigDecimal vmId;

    private String vmName;

    private String vmPath;

    private String vmHostName;

    private String reserverOne;

    private String reserverTwo;

    private String reserverThree;

    private BigDecimal vmType;


    public BigDecimal getVmId() {
        return vmId;
    }

    public void setVmId(BigDecimal vmId) {
        this.vmId = vmId;
        params.put(ApiConstants.VIRTUAL_ID, vmId);
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
        params.put(ApiConstants.VIRTUAL_NAME, vmName);
    }

    public String getVmPath() {
        return vmPath;
    }

    public void setVmPath(String vmPath) {
        this.vmPath = vmPath;
        params.put(ApiConstants.VIRTUAL_PATH, vmPath);
    }

    public String getVmHostName() {
        return vmHostName;
    }

    public void setVmHostName(String vmHostName) {
        this.vmHostName = vmHostName;
        params.put(ApiConstants.VIRTUAL_HOSTNAME, vmHostName);
    }

    public String getReserverOne() {
        return reserverOne;
    }

    public void setReserverOne(String reserverOne) {
        this.reserverOne = reserverOne;
        params.put(ApiConstants.RESERVER_ONE, reserverOne);
    }

    public String getReserverTwo() {
        return reserverTwo;
    }

    public void setReserverTwo(String reserverTwo) {
        this.reserverTwo = reserverTwo;
        params.put(ApiConstants.RESERVER_TWO, reserverTwo);
    }

    public String getReserverThree() {
        return reserverThree;
    }

    public void setReserverThree(String reserverThree) {
        this.reserverThree = reserverThree;
        params.put(ApiConstants.RESERVER_THREE, reserverThree);
    }

    public SendCanBackupVmCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDCANBACKUPVMRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public BigDecimal getType() {
        return vmType;
    }

    public void setType(BigDecimal vmType) {
        this.vmType = vmType;
        params.put(ApiConstants.VIRTUAL_TYPE, vmType);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }

}
