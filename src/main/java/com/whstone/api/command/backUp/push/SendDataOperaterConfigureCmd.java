package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/4/11.
 */
public class SendDataOperaterConfigureCmd extends BaseCmd {


    private static final String COMMAND_NAME = "SendDataOperaterConfigure";


    private Integer operaterId;

    private Integer databaseId;

    private String databaseName;

    private String databaseLogin;

    private String databasePass;


    private String startTime;

    private String timeConsuming;

    private Integer processResult;

    private String backupSize;

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

    private String reverser2; //达梦数据库备份是否带日志  1.备份日志  2.不备份日志

    private String reverser3;

    private Integer dbPort; //备份的数据库端口 v2.3新增


    public Integer getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Integer operaterId) {
        this.operaterId = operaterId;
        params.put(ApiConstants.OPERATION_ID, operaterId);
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        params.put(ApiConstants.DATABASE_NAME, databaseName);
    }

    public String getDatabaseLogin() {
        return databaseLogin;
    }

    public void setDatabaseLogin(String databaseLogin) {
        this.databaseLogin = databaseLogin;
        params.put(ApiConstants.DATABASE_LOGIN, databaseLogin);
    }

    public String getDatabasePass() {
        return databasePass;
    }

    public void setDatabasePass(String databasePass) {
        this.databasePass = databasePass;
        params.put(ApiConstants.DATABASE_PASS, databasePass);
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


    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
        params.put(ApiConstants.DATABASE_ID, databaseId);
    }

    public SendDataOperaterConfigureCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDDATAOPERATERCONFIGUREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        params.put(ApiConstants.DB_PORT, dbPort);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
