package com.whstone.api.command.restore.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/5/29.
 */
public class SendRestoreUpInfoWoLCmd extends BaseCmd {

    private static final String COMMAND_NAME = "sendRestoreInfo";

    private Integer restoreId;

    private String restoreIp;

    private Integer backupId;

    private Integer databaseId;

    private Integer operaterId;

    private String fileInstanceName;

    private String startTime;

    private String endTime;

    private Integer restoreState;

    private String errorMessage;

    private String restoreFilePath;

    private String reverser1;

    private String reverser2;

    private String reverser3;


    public Integer getRestoreId() {
        return restoreId;
    }

    public void setRestoreId(Integer restoreId) {
        this.restoreId = restoreId;
        params.put(ApiConstants.RESTORE_ID, restoreId);
    }

    public String getRestoreIp() {
        return restoreIp;
    }

    public void setRestoreIp(String restoreIp) {
        this.restoreIp = restoreIp;
        params.put(ApiConstants.RESTORE_IP, restoreIp);
    }

    public Integer getBackupId() {
        return backupId;
    }

    public void setBackupId(Integer backupId) {
        this.backupId = backupId;
        params.put(ApiConstants.BACKUP_ID, backupId);
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
        params.put(ApiConstants.DATABASE_ID, databaseId);
    }

    public Integer getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Integer operaterId) {
        this.operaterId = operaterId;
        params.put(ApiConstants.OPERATER_ID, operaterId);
    }

    public String getFileInstanceName() {
        return fileInstanceName;
    }

    public void setFileInstanceName(String fileInstanceName) {
        this.fileInstanceName = fileInstanceName;
        params.put(ApiConstants.FILE_INSTANCE_NAME, fileInstanceName);
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

    public Integer getRestoreState() {
        return restoreState;
    }

    public void setRestoreState(Integer restoreState) {
        this.restoreState = restoreState;
        params.put(ApiConstants.RESTORE_STATE, restoreState);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        params.put(ApiConstants.ERROR_MSG, errorMessage);
    }

    public String getRestoreFilePath() {
        return restoreFilePath;
    }

    public void setRestoreFilePath(String restoreFilePath) {
        this.restoreFilePath = restoreFilePath;
        params.put(ApiConstants.RESTOR_FILE_PATH, restoreFilePath);
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

    public String getReverser3() {
        return reverser3;
    }

    public void setReverser3(String reverser3) {
        this.reverser3 = reverser3;
        params.put(ApiConstants.REVERSER3, reverser3);
    }

    public SendRestoreUpInfoWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDRESTORREINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
