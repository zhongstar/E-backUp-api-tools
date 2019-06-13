package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/1.
 */
public class SendOracleInfoToProWoLCmd extends BaseCmd {


    private static final String COMMAND_NAME = "SendOracleInfoToProWoL";

    private Integer initId; //初始化id

    private String standIp; //备库IP

    private String tmpPort; //临时端口

    private String oracleSid; //主库实例名

    private String dbloginName; //数据库登录名


    private String dbPass;  //数据库密码

    private String priLsn; //主库监听名

    private String standHostName; //备库主机名

    private String racHostName;  //rac主机名称


    private String standUser;

    private String standPass;

    private String userPass; //12c 运行用户口令


    @Override
    public String toString() {
        return "SendOracleInfoToProWoLCmd{" +
                "initId=" + initId +
                ", standIp='" + standIp + '\'' +
                ", tmpPort='" + tmpPort + '\'' +
                ", oracleSid='" + oracleSid + '\'' +
                ", dbloginName='" + dbloginName + '\'' +
                ", dbPass='" + dbPass + '\'' +
                ", priLsn='" + priLsn + '\'' +
                ", standHostName='" + standHostName + '\'' +
                ", racHostName='" + racHostName + '\'' +
                ", standUser='" + standUser + '\'' +
                ", standPass='" + standPass + '\'' +
                ", userPass='" + userPass + '\'' +
                '}';
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
    }

    public String getStandIp() {
        return standIp;
    }

    public void setStandIp(String standIp) {
        this.standIp = standIp;
        params.put(ApiConstants.STAND_IP, standIp);
    }

    public String getTmpPort() {
        return tmpPort;
    }

    public void setTmpPort(String tmpPort) {
        this.tmpPort = tmpPort;
        params.put(ApiConstants.TMP_PORT, tmpPort);
    }

    public String getOracleSid() {
        return oracleSid;
    }

    public void setOracleSid(String oracleSid) {
        this.oracleSid = oracleSid;
        params.put(ApiConstants.ORACLE_SID, oracleSid);
    }

    public String getDbloginName() {
        return dbloginName;
    }

    public void setDbloginName(String dbloginName) {
        this.dbloginName = dbloginName;
        params.put(ApiConstants.DB_LOGINNAME, dbloginName);
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
        params.put(ApiConstants.DB_PASS, dbPass);
    }

    public String getPriLsn() {
        return priLsn;
    }

    public void setPriLsn(String priLsn) {
        this.priLsn = priLsn;
        params.put(ApiConstants.PRI_LSN, priLsn);
    }

    public String getStandHostName() {
        return standHostName;
    }


    public void setStandHostName(String standHostName) {
        this.standHostName = standHostName;
        params.put(ApiConstants.STAND_HOSTNAME, standHostName);
    }

    public String getRacHostName() {
        return racHostName;
    }

    public void setRacHostName(String racHostName) {
        this.racHostName = racHostName;
        params.put(ApiConstants.RAC_HOSTNAME, racHostName);
    }

    public String getStandUser() {
        return standUser;
    }

    public void setStandUser(String standUser) {
        this.standUser = standUser;
        params.put(ApiConstants.STAND_USER, standUser);
    }

    public String getStandPass() {
        return standPass;
    }

    public void setStandPass(String standPass) {
        this.standPass = standPass;
        params.put(ApiConstants.STAND_PASS, standPass);
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
        params.put(ApiConstants.USER_PASS, userPass);
    }

    public SendOracleInfoToProWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLEPRODUCTIONPARAMREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
