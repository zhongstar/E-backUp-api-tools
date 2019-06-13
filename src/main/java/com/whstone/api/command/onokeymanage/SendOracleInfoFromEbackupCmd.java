package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/1.
 */
public class SendOracleInfoFromEbackupCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOracleInfoFromEbackupWoL";


    private Integer initId;

    private Integer status;

    private Integer archiveGapNum;

    private String rfs;

    private Integer mrpo;

    private String priUniqueName;

    private String standUniqueName;

    private String message;


    @Override
    public String toString() {
        return "SendOracleInfoFromEbackupCmd{" +
                "initId=" + initId +
                ", status=" + status +
                ", archiveGapNum=" + archiveGapNum +
                ", rfs='" + rfs + '\'' +
                ", mrpo=" + mrpo +
                ", priUniqueName='" + priUniqueName + '\'' +
                ", standUniqueName='" + standUniqueName + '\'' +
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

    public Integer getArchiveGapNum() {
        return archiveGapNum;
    }

    public void setArchiveGapNum(Integer archiveGapNum) {
        this.archiveGapNum = archiveGapNum;
        params.put(ApiConstants.ARCHIVE_GAP_NUM, archiveGapNum);
    }

    public String getRfs() {
        return rfs;
    }

    public void setRfs(String rfs) {
        this.rfs = rfs;
        params.put(ApiConstants.RFS, rfs);
    }

    public Integer getMrpo() {
        return mrpo;
    }

    public void setMrpo(Integer mrpo) {
        this.mrpo = mrpo;
        params.put(ApiConstants.MRPO, mrpo);
    }

    public String getPriUniqueName() {
        return priUniqueName;
    }

    public void setPriUniqueName(String priUniqueName) {
        this.priUniqueName = priUniqueName;
        params.put(ApiConstants.PRI_UNIQUE_NAME, priUniqueName);
    }

    public String getStandUniqueName() {
        return standUniqueName;
    }

    public void setStandUniqueName(String standUniqueName) {
        this.standUniqueName = standUniqueName;
        params.put(ApiConstants.STAND_UNIQUE_NAME, standUniqueName);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        params.put(ApiConstants.MESSAGE, message);
    }

    public SendOracleInfoFromEbackupCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLEFROMEBACKUPPARAMREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }

}
