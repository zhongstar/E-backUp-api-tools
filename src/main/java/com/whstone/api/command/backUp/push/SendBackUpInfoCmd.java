package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/3/22.
 */
public class SendBackUpInfoCmd extends BaseCmd {


    private static final String COMMAND_NAME = "sendBackUpInfo";

    private String databaseName;

    private String startTime;

    private String endTime;

    private String timeConsuming;

    private String backupSize;

    private String backupFileName;

    private Integer backupState;

    private String backupPath;

    private String versionInfo;

    private String errorMsg;

    private String reverser3;

    private String reverser1;

    private String reverser2;

    private Integer opertionId;


    private Integer backupType;


    private Integer databaseId;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        params.put(ApiConstants.DATABASE_NAME, databaseName);
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
        params.put(ApiConstants.START_TIME, startTime);
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
        params.put(ApiConstants.END_TIME, endTime);
    }

    public String getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming;
        params.put(ApiConstants.TIME_CONSUMING, timeConsuming);
    }

    public String getBackupSize() {
        return backupSize;
    }

    public void setBackupSize(String backupSize) {
        this.backupSize = backupSize;
        params.put(ApiConstants.BACKUP_SIZE, backupSize);
    }

    public String getBackupFileName() {
        return backupFileName;
    }

    public void setBackupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
        params.put(ApiConstants.BACKUP_FILE_NAME, backupFileName);
    }

    public Integer getBackupState() {
        return backupState;
    }

    public void setBackupState(Integer backupState) {
        this.backupState = backupState;
        params.put(ApiConstants.BACKUP_STATE, backupState);
    }


    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
        params.put(ApiConstants.BACKUP_PATH, backupPath);
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
        params.put(ApiConstants.VERSION_INFO, versionInfo);
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        params.put(ApiConstants.ERROR_MSG, errorMsg);
    }

    public String getReverser3() {
        return reverser3;
    }

    public void setReverser3(String reverser3) {
        this.reverser3 = reverser3;
        params.put(ApiConstants.REVERSER3, reverser3);
    }

    public String getReverser1() {
        return reverser1;
    }

    public void setReverser1(String reverser1) {
        this.reverser1 = reverser1;
        params.put(ApiConstants.REVERSER1, reverser1);
    }

    public String getReverser2() {
        return reverser2;
    }

    public void setReverser2(String reverser2) {
        this.reverser2 = reverser2;
        params.put(ApiConstants.REVERSER2, reverser2);
    }

    public Integer getOpertionId() {
        return opertionId;
    }

    public void setOpertionId(Integer opertionId) {
        this.opertionId = opertionId;
        params.put(ApiConstants.OPERATION_ID, opertionId);
    }


    public Integer getBackupType() {
        return backupType;
    }

    public void setBackupType(Integer backupType) {
        this.backupType = backupType;
        params.put(ApiConstants.BACKUP_TYPE, backupType);
    }


    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
        params.put(ApiConstants.DATABASE_ID, databaseId);
    }

    public SendBackUpInfoCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDBACKUPINFOINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
