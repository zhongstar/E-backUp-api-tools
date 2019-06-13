package com.whstone.api.command.restore.push;

import com.whstone.api.ApiData;
import com.whstone.api.BaseCmd;
import com.whstone.api.ApiConstants;
import com.whstone.api.ApiResponseConstants;

/**
 * @Author: yangfeng
 * @Date: 2018/11/14
 */
public class SendDaMengRestoreInfoCmd extends BaseCmd {

    private static final String COMMAND_NAME = "sendDaMengRestoreInfo";
    /**
     * 恢复操作ID
     */
    private String operationId;
    /**
     * 备份集名称
     */
    private String backupSetName;
    /**
     * 是否带有日志
     */
    private String hasLog;
    /**
     * 备份集在NFS上的全路劲  windows系统使用此路径直接下载  多个用空格隔开
     */
    private String nfsDownloadPath;
    /**
     * 备份集在挂载点下的全路劲  linux系统下使用此路径下载  多个用空格隔开
     */
    private String mountDownloadPath;
    /**
     * 数据库端口
     */
    private String dbPort;
    /**
     * 数据录名
     */
    private String loginName;
    /**
     * 数据库密码
     */
    private String loginPass;
    /**
     * 恢复状态  1.恢复成功 2.恢复失败
     */
    private Integer restoreState;
    /**
     * 错误信息
     */
    private String errorMsg;

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
        params.put(ApiConstants.OPERATION_ID, operationId);
    }

    public String getBackupSetName() {
        return backupSetName;
    }

    public void setBackupSetName(String backupSetName) {
        this.backupSetName = backupSetName;
        params.put(ApiConstants.BACKUP_FILE_NAME, backupSetName);
    }

    public String getHasLog() {
        return hasLog;
    }

    public void setHasLog(String hasLog) {
        this.hasLog = hasLog;
        params.put(ApiConstants.HAS_LOG, hasLog);
    }

    public String getNfsDownloadPath() {
        return nfsDownloadPath;
    }

    public void setNfsDownloadPath(String nfsDownloadPath) {
        this.nfsDownloadPath = nfsDownloadPath;
        params.put(ApiConstants.NFS_DOWNLOAD_PATH, nfsDownloadPath);
    }

    public String getMountDownloadPath() {
        return mountDownloadPath;
    }

    public void setMountDownloadPath(String mountDownloadPath) {
        this.mountDownloadPath = mountDownloadPath;
        params.put(ApiConstants.MOUNT_DOWNLOAD_PATH, mountDownloadPath);
    }

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
        params.put(ApiConstants.DB_PORT, dbPort);
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
        params.put(ApiConstants.DB_LOGINNAME, loginName);
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
        params.put(ApiConstants.DB_PASS, loginPass);
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        params.put(ApiConstants.ERROR_MSG, errorMsg);
    }

    public Integer getRestoreState() {
        return restoreState;
    }

    public void setRestoreState(Integer restoreState) {
        this.restoreState = restoreState;
        params.put(ApiConstants.RESTORE_STATE, restoreState);
    }

    public SendDaMengRestoreInfoCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDDAMENGRESTOREINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {
        return responseJSONObject.getString("result");
    }
}
