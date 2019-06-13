package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/4/11.
 */
public class SendFileOperaterConfigureCmd extends BaseCmd {


    private static final String COMMAND_NAME = "SendFileOperaterConfigure";


    private Integer operaterId;

    private Integer fileId;

    private String application;

    private String hostName;

    private String fileResource;

    private String backupResource;

    private String startTime;

    private String timeConsuming;

    private Integer processResult;

    private String backupSize;

    private String remoteUser;

    private String remotePass;

    private String isSystem;

    private String systemType;

    private String systemIp;

    private String reserverOne;

    private String reserverTwo;

    private String reserverThree;

    private Integer backupStrategy;

    private Integer timeStrategy;

    private String dayTime;

    private String weekdays;

    private String monthDays;

    private String timeIntervel;

    private String dayBackupFrequency;

    private String dayForBackupTime;

    private String reverser1;

    private String reverser2;

    private String reverser3;


    public SendFileOperaterConfigureCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDFILEOPERATERCONFIGUREREPONSE);
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

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
        params.put(ApiConstants.APPLICATION, application);
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

    public String getBackupSize() {
        return backupSize;
    }

    public void setBackupSize(String backupSize) {
        this.backupSize = backupSize;
        params.put(ApiConstants.BACKUP_SIZE, backupSize);
    }

    public String getRemoteUser() {
        return remoteUser;
    }

    public void setRemoteUser(String remoteUser) {
        this.remoteUser = remoteUser;
        params.put(ApiConstants.REMOTE_USER, remoteUser);
    }

    public String getRemotePass() {
        return remotePass;
    }

    public void setRemotePass(String remotePass) {
        this.remotePass = remotePass;
        params.put(ApiConstants.REMOTE_PASS, remotePass);
    }

    public String getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
        params.put(ApiConstants.IS_SYSTEM, isSystem);
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
        params.put(ApiConstants.SYSTEM_TYPE, systemType);
    }

    public String getSystemIp() {
        return systemIp;
    }

    public void setSystemIp(String systemIp) {
        this.systemIp = systemIp;
        params.put(ApiConstants.SYSTEM_IP, systemIp);
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

    public String getDayBackupFrequency() {
        return dayBackupFrequency;
    }

    public void setDayBackupFrequency(String dayBackupFrequency) {
        this.dayBackupFrequency = dayBackupFrequency;
        params.put(ApiConstants.DAY_BACKUP_FREQUENCY, dayBackupFrequency);
    }

    public String getDayForBackupTime() {
        return dayForBackupTime;
    }

    public void setDayForBackupTime(String dayForBackupTime) {
        this.dayForBackupTime = dayForBackupTime;
        params.put(ApiConstants.DAY_FOR_BACKUP_TIME, dayForBackupTime);
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
