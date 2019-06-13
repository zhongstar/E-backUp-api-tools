package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/1.
 */
public class SendOracleInfoToEbackCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOracleInfoToEbackupWoL";


    private Integer initId;

    private String tmpPort; //临时端口

    private String oracleSid; //主库实例名

    private String dbloginName; //数据库登录名

    private String dbPass;  //数据库密码

    private String standLsn;

    private String priTnsname;

    private String standTnsname;

    private String oracleHome;

    private String oracleBase;

    private String priIp;

    private String priHostname; //主库主机名

    private String standHostname; //备库主机名

    private String standPfile;

    private String standDir;

    private String controlfilePathname;

    private String controlFileName;

    private String flashRecoveryAreaName;


    private String flashRecoveryAreaSize;

    private String standDbFileNameConvert;

    private String standLogFileNameConvert;

    private String archiveLogPath;

    private Long menSize;

    private String userPass;//12c运行用户密码


    @Override
    public String toString() {
        return "SendOracleInfoToEbackCmd{" +
                "initId=" + initId +
                ", tmpPort='" + tmpPort + '\'' +
                ", oracleSid='" + oracleSid + '\'' +
                ", dbloginName='" + dbloginName + '\'' +
                ", dbPass='" + dbPass + '\'' +
                ", standLsn='" + standLsn + '\'' +
                ", priTnsname='" + priTnsname + '\'' +
                ", standTnsname='" + standTnsname + '\'' +
                ", oracleHome='" + oracleHome + '\'' +
                ", oracleBase='" + oracleBase + '\'' +
                ", priIp='" + priIp + '\'' +
                ", priHostname='" + priHostname + '\'' +
                ", standHostname='" + standHostname + '\'' +
                ", standPfile='" + standPfile + '\'' +
                ", standDir='" + standDir + '\'' +
                ", controlfilePathname='" + controlfilePathname + '\'' +
                ", controlFileName='" + controlFileName + '\'' +
                ", flashRecoveryAreaName='" + flashRecoveryAreaName + '\'' +
                ", flashRecoveryAreaSize='" + flashRecoveryAreaSize + '\'' +
                ", standDbFileNameConvert='" + standDbFileNameConvert + '\'' +
                ", standLogFileNameConvert='" + standLogFileNameConvert + '\'' +
                ", archiveLogPath='" + archiveLogPath + '\'' +
                ", menSize='" + menSize + '\'' +
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

    public String getStandLsn() {
        return standLsn;
    }

    public void setStandLsn(String standLsn) {
        this.standLsn = standLsn;
        params.put(ApiConstants.STAND_LSN, standLsn);
    }

    public String getPriTnsname() {
        return priTnsname;
    }

    public void setPriTnsname(String priTnsname) {
        this.priTnsname = priTnsname;
        params.put(ApiConstants.PRI_TNSNAME, priTnsname);
    }

    public String getStandTnsname() {
        return standTnsname;
    }

    public void setStandTnsname(String standTnsname) {
        this.standTnsname = standTnsname;
        params.put(ApiConstants.STAND_TNSNAME, standTnsname);
    }

    public String getOracleHome() {
        return oracleHome;
    }

    public void setOracleHome(String oracleHome) {
        this.oracleHome = oracleHome;
        params.put(ApiConstants.ORACLE_HOME, oracleHome);
    }

    public String getOracleBase() {
        return oracleBase;
    }

    public void setOracleBase(String oracleBase) {
        this.oracleBase = oracleBase;
        params.put(ApiConstants.ORACLE_BASE, oracleBase);
    }

    public String getPriIp() {
        return priIp;
    }

    public void setPriIp(String priIp) {
        this.priIp = priIp;
        params.put(ApiConstants.PRI_IP, priIp);
    }

    public String getPriHostname() {
        return priHostname;
    }

    public void setPriHostname(String priHostname) {
        this.priHostname = priHostname;
        params.put(ApiConstants.PRI_HOSTNAME, priHostname);
    }


    public String getStandHostname() {
        return standHostname;
    }

    public void setStandHostname(String standHostname) {
        this.standHostname = standHostname;
        params.put(ApiConstants.STAND_HOSTNAME, standHostname);
    }

    public String getStandPfile() {
        return standPfile;
    }

    public void setStandPfile(String standPfile) {
        this.standPfile = standPfile;
        params.put(ApiConstants.STAND_PFILE, standPfile);
    }

    public String getStandDir() {
        return standDir;
    }

    public void setStandDir(String standDir) {
        this.standDir = standDir;
        params.put(ApiConstants.STAND_DIR, standDir);
    }

    public String getControlfilePathname() {
        return controlfilePathname;
    }

    public void setControlfilePathname(String controlfilePathname) {
        this.controlfilePathname = controlfilePathname;
        params.put(ApiConstants.CONTROLFILE_PATHNAME, controlfilePathname);
    }

    public String getControlFileName() {
        return controlFileName;
    }

    public void setControlFileName(String controlFileName) {
        this.controlFileName = controlFileName;
        params.put(ApiConstants.CONTROL_FILE_NAME, controlFileName);
    }

    public String getFlashRecoveryAreaName() {
        return flashRecoveryAreaName;
    }

    public void setFlashRecoveryAreaName(String flashRecoveryAreaName) {
        this.flashRecoveryAreaName = flashRecoveryAreaName;
        params.put(ApiConstants.FLASH_RECOVERY_AREA_NAME, flashRecoveryAreaName);

    }

    public String getFlashRecoveryAreaSize() {
        return flashRecoveryAreaSize;
    }

    public void setFlashRecoveryAreaSize(String flashRecoveryAreaSize) {
        this.flashRecoveryAreaSize = flashRecoveryAreaSize;
        params.put(ApiConstants.FLASH_RECOVERY_AREA_SIZE, flashRecoveryAreaSize);
    }

    public String getStandDbFileNameConvert() {
        return standDbFileNameConvert;
    }

    public void setStandDbFileNameConvert(String standDbFileNameConvert) {
        this.standDbFileNameConvert = standDbFileNameConvert;
        params.put(ApiConstants.STAND_DB_FILE_NAME_CONVERT, standDbFileNameConvert);
    }

    public String getStandLogFileNameConvert() {
        return standLogFileNameConvert;
    }

    public void setStandLogFileNameConvert(String standLogFileNameConvert) {
        this.standLogFileNameConvert = standLogFileNameConvert;
        params.put(ApiConstants.STAND_LOG_FILE_NAME_CONVERT, standLogFileNameConvert);
    }

    public String getArchiveLogPath() {
        return archiveLogPath;
    }

    public void setArchiveLogPath(String archiveLogPath) {
        this.archiveLogPath = archiveLogPath;
        params.put(ApiConstants.ARCHIVE_LOG_PATH, archiveLogPath);
    }

    public Long getMenSize() {
        return menSize;
    }

    public void setMenSize(Long menSize) {
        this.menSize = menSize;
        params.put(ApiConstants.MEN_SIZE, menSize);
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
        params.put(ApiConstants.USER_PASS, userPass);
    }

    public SendOracleInfoToEbackCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLETOEBACKUPPARAMREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }

}
