package com.whstone.api.command.onokeymanage.cancelConnect;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/14.
 */
public class SendDeleteSqlserverConnectCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendDeleteSqlserverConnect";

    private String cancelId; //取消连接表 主键

    private String databaseNames; //数据库名字字符串 多个空格隔开

    private String dbPorts; //数据库端口字符串 多个空格隔开

    private String primaryIp; //主库IP

    private String primaryUsername; //主库 管理员用户名

    private String primaryPassword; //主库 管理员密码

    private String mirrorIp; //备库IP

    private String mirrorUsername; //备库 管理员用户名

    private String mirrorPassword; //备库 管理员密码

    private Integer state; //取消 状态

    private String errorMsg; //错误信息


    @Override
    public String toString() {
        return "SendDeleteSqlserverConnectCmd{" +
                "cancelId='" + cancelId + '\'' +
                ", databaseNames='" + databaseNames + '\'' +
                ", primaryIp='" + primaryIp + '\'' +
                ", primaryUsername='" + primaryUsername + '\'' +
                ", primaryPassword='" + primaryPassword + '\'' +
                ", mirrorIp='" + mirrorIp + '\'' +
                ", mirrorUsername='" + mirrorUsername + '\'' +
                ", mirrorPassword='" + mirrorPassword + '\'' +
                ", state=" + state +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public String getCancelId() {
        return cancelId;
    }

    public void setCancelId(String cancelId) {
        this.cancelId = cancelId;
        params.put(ApiConstants.CANCELID, cancelId);
    }

    public String getDatabaseNames() {
        return databaseNames;
    }

    public void setDatabaseNames(String databaseNames) {
        this.databaseNames = databaseNames;
        params.put(ApiConstants.DATABASE_NAMES, databaseNames);
    }

    public String getPrimaryIp() {
        return primaryIp;
    }

    public void setPrimaryIp(String primaryIp) {
        this.primaryIp = primaryIp;
        params.put(ApiConstants.PRIMARY_IP, primaryIp);
    }

    public String getPrimaryUsername() {
        return primaryUsername;
    }

    public void setPrimaryUsername(String primaryUsername) {
        this.primaryUsername = primaryUsername;
        params.put(ApiConstants.PRIMARY_USERNAME, primaryUsername);
    }

    public String getPrimaryPassword() {
        return primaryPassword;
    }

    public void setPrimaryPassword(String primaryPassword) {
        this.primaryPassword = primaryPassword;
        params.put(ApiConstants.PRIMARY_PASSWORD, primaryPassword);
    }

    public String getMirrorIp() {
        return mirrorIp;
    }

    public void setMirrorIp(String mirrorIp) {
        this.mirrorIp = mirrorIp;
        params.put(ApiConstants.MIRROR_IP, mirrorIp);
    }

    public String getMirrorUsername() {
        return mirrorUsername;
    }

    public void setMirrorUsername(String mirrorUsername) {
        this.mirrorUsername = mirrorUsername;
        params.put(ApiConstants.MIRROR_USERNAME, mirrorUsername);
    }

    public String getMirrorPassword() {
        return mirrorPassword;
    }

    public void setMirrorPassword(String mirrorPassword) {
        this.mirrorPassword = mirrorPassword;
        params.put(ApiConstants.MIRROR_PASSWORD, mirrorPassword);
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        params.put(ApiConstants.STATE, state);
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        params.put(ApiConstants.ERROR_MSG, errorMsg);
    }

    public String getDbPorts() {
        return dbPorts;
    }

    public void setDbPorts(String dbPorts) {
        this.dbPorts = dbPorts;
        params.put(ApiConstants.DB_PORTS, dbPorts);
    }

    public SendDeleteSqlserverConnectCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDDELETESQLSESRVERCONNECTCMDREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
