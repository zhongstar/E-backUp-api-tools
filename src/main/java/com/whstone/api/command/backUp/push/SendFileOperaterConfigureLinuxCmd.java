package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/5/18.
 */
public class SendFileOperaterConfigureLinuxCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendFileOperaterConfigureLinux";


    private Integer operaterId;

    private Integer fileId;

    private String operaterAlias;

    private String hostName;

    private String fileResource;

    private String backupResource;

    private String nfsShareDir;

    private String startTime;

    private String timeConsuming;

    private Integer processResult;

    private String backupProcess;

    private String backupSize;

    private String reserverOne;

    private String reserverTwo;

    private String reserverThree;

    private Integer backupStrategy;

    private Integer timeStrategy;

    private String backupStartTime;

    private String singleTime;

    private String dayTime;

    private String weekdays;

    private String monthDays;

    private String timeIntervel;

    private String reverser1;

    private String reverser2;

    private String reverser3;

    public SendFileOperaterConfigureLinuxCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDFILEOPERATERCONFIGURELINUXREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public Integer getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Integer operaterId) {
        this.operaterId = operaterId;
        params.put(ApiConstants.OPERATION_ID, operaterId);
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
        params.put(ApiConstants.FILE_ID, fileId);
    }

    public String getOperaterAlias() {
        return operaterAlias;
    }

    public void setOperaterAlias(String operaterAlias) {
        this.operaterAlias = operaterAlias;
        params.put(ApiConstants.OPERATER_ALIAS, operaterAlias);
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
        params.put(ApiConstants.HOST_NAME, hostName);
    }

    public String getFileResource() {
        return fileResource;
    }

    public void setFileResource(String fileResource) {
        this.fileResource = fileResource;
        params.put(ApiConstants.FILE_RESOURCE, fileResource);
    }

    public String getBackupResource() {
        return backupResource;
    }

    public void setBackupResource(String backupResource) {
        this.backupResource = backupResource;
        params.put(ApiConstants.BACKUP_RESOURCE, backupResource);
    }

    public String getNfsShareDir() {
        return nfsShareDir;
    }

    public void setNfsShareDir(String nfsShareDir) {
        this.nfsShareDir = nfsShareDir;
        params.put(ApiConstants.NFS_SHARE_DIR, nfsShareDir);
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
        params.put(ApiConstants.START_TIME, startTime);
    }

    public String getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming;
        params.put(ApiConstants.TIME_CONSUMING, timeConsuming);
    }

    public Integer getProcessResult() {
        return processResult;
    }

    public void setProcessResult(Integer processResult) {
        this.processResult = processResult;
        params.put(ApiConstants.PROCESSRESULT, processResult);
    }

    public String getBackupProcess() {
        return backupProcess;
    }

    public void setBackupProcess(String backupProcess) {
        this.backupProcess = backupProcess;
        params.put(ApiConstants.BACKUP_PROCESS, backupProcess);
    }

    public String getBackupSize() {
        return backupSize;
    }

    public void setBackupSize(String backupSize) {
        this.backupSize = backupSize;
        params.put(ApiConstants.BACKUP_SIZE, backupSize);
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

    public Integer getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(Integer backupStrategy) {
        this.backupStrategy = backupStrategy;
        params.put(ApiConstants.BACKUP_STRATEGY, backupStrategy);
    }

    public Integer getTimeStrategy() {
        return timeStrategy;
    }

    public void setTimeStrategy(Integer timeStrategy) {
        this.timeStrategy = timeStrategy;
        params.put(ApiConstants.TIME_STRATEGY, timeStrategy);
    }

    public String getBackupStartTime() {
        return backupStartTime;
    }

    public void setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        params.put(ApiConstants.BACKUP_START_TIME, backupStartTime);
    }

    public String getSingleTime() {
        return singleTime;
    }

    public void setSingleTime(String singleTime) {
        this.singleTime = singleTime;
        params.put(ApiConstants.SINGLE_TIME, singleTime);
    }

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
        params.put(ApiConstants.DAY_TIME, dayTime);
    }

    public String getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
        params.put(ApiConstants.WEEKDAYS, weekdays);
    }

    public String getMonthDays() {
        return monthDays;
    }

    public void setMonthDays(String monthDays) {
        this.monthDays = monthDays;
        params.put(ApiConstants.MONTH_DAYS, monthDays);
    }

    public String getTimeIntervel() {
        return timeIntervel;
    }

    public void setTimeIntervel(String timeIntervel) {
        this.timeIntervel = timeIntervel;
        params.put(ApiConstants.TIME_INTERVEL, timeIntervel);
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

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
