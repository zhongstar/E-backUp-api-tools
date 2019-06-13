package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/5/18.
 */
public class SendFileBackUpInfoLinuxCmd extends BaseCmd {
    private static final String COMMAND_NAME = "sendFileBackUpInfoLinux";

    private String fileId;

    private String backupSize;

    private String startTime;

    private String endTime;

    private String timeConsuming;

    private Integer backupState;

    private String backupPath;

    private String sourcePath;

    private String errorMsg;

    private String reverser3;

    private String reverser1;

    private String reverser2;

    private Integer opertionId;


    public SendFileBackUpInfoLinuxCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDFILEBACKUPINFOINFOLINUXRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
        params.put(ApiConstants.FILE_ID, fileId);
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

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        params.put(ApiConstants.SOURCE_PATH, sourcePath);
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


    public String getResult() {

        return responseJSONObject.getString("result");

    }

}
