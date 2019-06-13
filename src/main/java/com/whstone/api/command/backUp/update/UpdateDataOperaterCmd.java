package com.whstone.api.command.backUp.update;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/5/9.
 */
public class UpdateDataOperaterCmd extends BaseCmd {


    private static final String COMMAND_NAME = "updateDataOperater";

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

    public UpdateDataOperaterCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.UPDATAOPERATERREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public Integer getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Integer operaterId) {
        this.operaterId = operaterId;
        params.put(ApiConstants.OPERATION_ID, operaterId);
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
        params.put(ApiConstants.DATABASE_ID, databaseId);
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


    public String getResult() {

        return responseJSONObject.getString("result");

    }

}
