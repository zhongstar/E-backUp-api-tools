package com.whstone.api.response;

import com.whstone.api.BaseResponse;

/**
 * Created by weijun on 2018/5/30.
 */
public class OperaterRestoreResponse extends BaseResponse {

    private Integer operaterId;

    private Integer backupId;

    private Integer restoreOperaterType;

    private String startTime;

    private String timeConsuming;

    private Integer operaterResult;

    private String restoreSize;

    private String restoreProgress;

    private String reserverOne; //1、立即执行  2、最新

    private String reserverTwo; //备份集名称

    private String reserverThree; //pfile 文件名路径

    private Integer fileDatabaseId;

    private String operaterAlias;

    private String backupType;

    private String fullPlanId;

    public String getFullPlanId() {
        return fullPlanId;
    }

    public void setFullPlanId(String fullPlanId) {
        this.fullPlanId = fullPlanId;
    }

    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public Integer getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Integer operaterId) {
        this.operaterId = operaterId;
    }

    public Integer getBackupId() {
        return backupId;
    }

    public void setBackupId(Integer backupId) {
        this.backupId = backupId;
    }

    public Integer getRestoreOperaterType() {
        return restoreOperaterType;
    }

    public void setRestoreOperaterType(Integer restoreOperaterType) {
        this.restoreOperaterType = restoreOperaterType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    public Integer getOperaterResult() {
        return operaterResult;
    }

    public void setOperaterResult(Integer operaterResult) {
        this.operaterResult = operaterResult;
    }

    public String getRestoreSize() {
        return restoreSize;
    }

    public void setRestoreSize(String restoreSize) {
        this.restoreSize = restoreSize;
    }

    public String getRestoreProgress() {
        return restoreProgress;
    }

    public void setRestoreProgress(String restoreProgress) {
        this.restoreProgress = restoreProgress;
    }

    public String getReserverOne() {
        return reserverOne;
    }

    public void setReserverOne(String reserverOne) {
        this.reserverOne = reserverOne;
    }

    public String getReserverTwo() {
        return reserverTwo;
    }

    public void setReserverTwo(String reserverTwo) {
        this.reserverTwo = reserverTwo;
    }

    public String getReserverThree() {
        return reserverThree;
    }

    public void setReserverThree(String reserverThree) {
        this.reserverThree = reserverThree;
    }

    public Integer getFileDatabaseId() {
        return fileDatabaseId;
    }

    public void setFileDatabaseId(Integer fileDatabaseId) {
        this.fileDatabaseId = fileDatabaseId;
    }

    public String getOperaterAlias() {
        return operaterAlias;
    }

    public void setOperaterAlias(String operaterAlias) {
        this.operaterAlias = operaterAlias;
    }
}
