package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/1.
 */
public class SendSqlserverInfoProductionWoLCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendSqlserverInfoProductionWoL";

    private String initIds; //数据库连接ID,多个用空格隔开

    private String primaryIds; //主库ID,多个用空格隔开

    private String databaseNames; //数据库名称,多个用空格隔开

    private String dbPorts; //数据库端口,多个用空格隔开

    private String primaryIp; //主库IP

    private String primaryUsername; //主库管理员用户名

    private String primaryPassword; //主库管理员密码

    private String mirrorIp; //备库IP

    private String mirrorUsername; //备库管理员用户名

    private String mirrorPassword; //备库管理员密码

    private String startTime; //初始化开始时间

    private String endTime; //初始化结束时间

    private Integer state; //初始化状态

    private String processMsg; //错误信息

    private String assignPath;// sqlserver一键接管易备环境指定的恢复路径


    public String getInitIds() {
        return initIds;
    }

    public void setInitIds(String initIds) {
        this.initIds = initIds;
        params.put(ApiConstants.INIT_IDS, initIds);
    }

    public String getPrimaryIds() {
        return primaryIds;
    }

    public void setPrimaryIds(String primaryIds) {
        this.primaryIds = primaryIds;
        params.put(ApiConstants.PRIMARY_IDS, primaryIds);
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


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        params.put(ApiConstants.STATE, state);
    }

    public String getProcessMsg() {
        return processMsg;
    }

    public void setProcessMsg(String processMsg) {
        this.processMsg = processMsg;
        params.put(ApiConstants.PROCESS_MSG, processMsg);
    }

    public String getDbPorts() {
        return dbPorts;
    }

    public void setDbPorts(String dbPorts) {
        this.dbPorts = dbPorts;
        params.put(ApiConstants.DB_PORTS, dbPorts);
    }

    public SendSqlserverInfoProductionWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDSQLSESRVERINFOREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }

    public String getAssignPath() {
        return assignPath;
    }

    public SendSqlserverInfoProductionWoLCmd setAssignPath(String assignPath) {
        this.assignPath = assignPath;
        params.put(ApiConstants.ASSIGN_PATH, assignPath);
        return this;
    }

    @Override
    public String toString() {
        return "SendSqlserverInfoProductionWoLCmd{" +
                "initIds='" + initIds + '\'' +
                ", primaryIds='" + primaryIds + '\'' +
                ", databaseNames='" + databaseNames + '\'' +
                ", dbPorts='" + dbPorts + '\'' +
                ", primaryIp='" + primaryIp + '\'' +
                ", primaryUsername='" + primaryUsername + '\'' +
                ", primaryPassword='" + primaryPassword + '\'' +
                ", mirrorIp='" + mirrorIp + '\'' +
                ", mirrorUsername='" + mirrorUsername + '\'' +
                ", mirrorPassword='" + mirrorPassword + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", state=" + state +
                ", processMsg='" + processMsg + '\'' +
                ", assignPath='" + assignPath + '\'' +
                '}';
    }
}
