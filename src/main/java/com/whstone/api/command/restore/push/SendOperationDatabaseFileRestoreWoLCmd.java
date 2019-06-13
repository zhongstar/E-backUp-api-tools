package com.whstone.api.command.restore.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/5/26.
 */
public class SendOperationDatabaseFileRestoreWoLCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOperationDatabaseFileRestoreWoL";

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

    private String pfilePath;

    private String controlPath;

    private String backupPlanId;

    private String backupType;

    private String fullPlanId;

    //配置
    private String restoreIp;

    private String restoreLoginName;

    private String restorePassword;

    private Integer restoreFrequency;

    private String restoreTimeSingle;

    private String restoreTime;

    private String restoreWeekdays;

    private String restoreMonthdays;


    private String restorePath;

    private String instanceDatabaseName;

    private Integer restoreFileLocal;

    private Integer restoreFileLitmType;

    private Integer restoreFileType;

    private String reverser1;

    private String reverser2;

    private String reverser3;

    private String restorestartTime;

    private Integer dbPort; //v2.3 新增端口


    public Integer getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Integer operaterId) {
        this.operaterId = operaterId;
        params.put(ApiConstants.OPERATER_ID, operaterId);
    }

    public Integer getBackupId() {
        return backupId;
    }

    public void setBackupId(Integer backupId) {
        this.backupId = backupId;
        params.put(ApiConstants.BACKUP_ID, backupId);
    }

    public Integer getRestoreOperaterType() {
        return restoreOperaterType;
    }

    public void setRestoreOperaterType(Integer restoreOperaterType) {
        this.restoreOperaterType = restoreOperaterType;
        params.put(ApiConstants.RESTORE_OPERATER_TYPE, restoreOperaterType);
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

    public Integer getOperaterResult() {
        return operaterResult;
    }

    public void setOperaterResult(Integer operaterResult) {
        this.operaterResult = operaterResult;
        params.put(ApiConstants.OPERATER_RESULT, operaterResult);
    }

    public String getRestoreSize() {
        return restoreSize;
    }

    public void setRestoreSize(String restoreSize) {
        this.restoreSize = restoreSize;
        params.put(ApiConstants.RESTORE_SIZE, restoreSize);
    }

    public String getRestoreProgress() {
        return restoreProgress;
    }

    public void setRestoreProgress(String restoreProgress) {
        this.restoreProgress = restoreProgress;
        params.put(ApiConstants.RESTORE_PROGRESS, restoreProgress);
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

    public Integer getFileDatabaseId() {
        return fileDatabaseId;
    }

    public void setFileDatabaseId(Integer fileDatabaseId) {
        this.fileDatabaseId = fileDatabaseId;
        params.put(ApiConstants.FILE_DATABASE_ID, fileDatabaseId);
    }

    public String getOperaterAlias() {
        return operaterAlias;
    }

    public void setOperaterAlias(String operaterAlias) {
        this.operaterAlias = operaterAlias;
        params.put(ApiConstants.OPERATER_ALIAS, operaterAlias);
    }


    public String getPfilePath() {
        return pfilePath;
    }

    public void setPfilePath(String pfilePath) {
        this.pfilePath = pfilePath;
        params.put(ApiConstants.PFILE_PATH, pfilePath);
    }


    public String getControlPath() {
        return controlPath;
    }

    public void setControlPath(String controlPath) {
        this.controlPath = controlPath;
        params.put(ApiConstants.CONTROL_PATH, controlPath);
    }

    public String getRestoreIp() {
        return restoreIp;
    }

    public void setRestoreIp(String restoreIp) {
        this.restoreIp = restoreIp;
        params.put(ApiConstants.RESTORE_IP, restoreIp);
    }

    public String getRestoreLoginName() {
        return restoreLoginName;
    }

    public void setRestoreLoginName(String restoreLoginName) {
        this.restoreLoginName = restoreLoginName;
        params.put(ApiConstants.RESTORE_LOGIN_NAME, restoreLoginName);
    }

    public String getRestorePassword() {
        return restorePassword;
    }

    public void setRestorePassword(String restorePassword) {
        this.restorePassword = restorePassword;
        params.put(ApiConstants.RESTORE_PASSWORD, restorePassword);
    }

    public Integer getRestoreFrequency() {
        return restoreFrequency;
    }

    public void setRestoreFrequency(Integer restoreFrequency) {
        this.restoreFrequency = restoreFrequency;
        params.put(ApiConstants.RESTORE_FREQUENCY, restoreFrequency);
    }

    public String getRestoreTimeSingle() {
        return restoreTimeSingle;
    }

    public void setRestoreTimeSingle(String restoreTimeSingle) {
        this.restoreTimeSingle = restoreTimeSingle;
        params.put(ApiConstants.RESTORE_TIME_SINGLE, restoreTimeSingle);
    }

    public String getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        params.put(ApiConstants.RESTORE_TIME, restoreTime);
    }

    public String getRestoreWeekdays() {
        return restoreWeekdays;
    }

    public void setRestoreWeekdays(String restoreWeekdays) {
        this.restoreWeekdays = restoreWeekdays;
        params.put(ApiConstants.RESTORE_WEEKDAYS, restoreWeekdays);
    }

    public String getRestoreMonthdays() {
        return restoreMonthdays;
    }

    public void setRestoreMonthdays(String restoreMonthdays) {
        this.restoreMonthdays = restoreMonthdays;
        params.put(ApiConstants.RESTORE_MONTHDAYS, restoreMonthdays);
    }

    public String getRestorePath() {
        return restorePath;
    }

    public void setRestorePath(String restorePath) {
        this.restorePath = restorePath;
        params.put(ApiConstants.RESTORE_PATH, restorePath);
    }

    public String getInstanceDatabaseName() {
        return instanceDatabaseName;
    }

    public void setInstanceDatabaseName(String instanceDatabaseName) {
        this.instanceDatabaseName = instanceDatabaseName;
        params.put(ApiConstants.INSTANCE_DATABASE_NAME, instanceDatabaseName);
    }

    public Integer getRestoreFileLocal() {
        return restoreFileLocal;
    }

    public void setRestoreFileLocal(Integer restoreFileLocal) {
        this.restoreFileLocal = restoreFileLocal;
        params.put(ApiConstants.RESTORE_FILE_LOCAL, restoreFileLocal);
    }

    public Integer getRestoreFileLitmType() {
        return restoreFileLitmType;
    }

    public void setRestoreFileLitmType(Integer restoreFileLitmType) {
        this.restoreFileLitmType = restoreFileLitmType;
        params.put(ApiConstants.RESTORE_FILE_LITM_TYPE, restoreFileLitmType);
    }

    public Integer getRestoreFileType() {
        return restoreFileType;
    }

    public void setRestoreFileType(Integer restoreFileType) {
        this.restoreFileType = restoreFileType;
        params.put(ApiConstants.RESTORE_FILE_TYPE, restoreFileType);
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

    public String getRestorestartTime() {
        return restorestartTime;
    }

    public void setRestorestartTime(String restorestartTime) {
        this.restorestartTime = restorestartTime;
        params.put(ApiConstants.RESTORE_START_TIME, restorestartTime);
    }

    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        params.put(ApiConstants.DB_PORT, dbPort);

    }

    public SendOperationDatabaseFileRestoreWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDOPERATIONDATAORFILERESTOREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getBackupPlanId() {
        return backupPlanId;
    }

    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        params.put(ApiConstants.BACKUP_PLAN_ID, backupPlanId);
    }

    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
        params.put(ApiConstants.BACKUP_TYPE, backupType);
    }

    public String getFullPlanId() {
        return fullPlanId;
    }

    public void setFullPlanId(String fullPlanId) {
        this.fullPlanId = fullPlanId;
        params.put(ApiConstants.FULL_PLAN_ID, fullPlanId);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
