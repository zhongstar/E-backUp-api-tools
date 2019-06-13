package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/6/1.
 */
public class SendOracleInfoFromProWoLCmd extends BaseCmd {


    private static final String COMMAND_NAME = "SendOracleInfoFromProWoL";
    private Integer initId;

    private String oracleHome;

    private String oracleBase;

    private String priHostname; //主库主机名

    private String priTnsname;

    private String standTnsname;

    private String dbloginName; //数据库登录名

    private String dbPass;  //数据库密码

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

    private Integer status;

    private String message;


    @Override
    public String toString() {
        return "SendOracleInfoFromProWoLCmd{" +
                "initId=" + initId +
                ", oracleHome='" + oracleHome + '\'' +
                ", oracleBase='" + oracleBase + '\'' +
                ", priHostname='" + priHostname + '\'' +
                ", priTnsname='" + priTnsname + '\'' +
                ", standTnsname='" + standTnsname + '\'' +
                ", dbloginName='" + dbloginName + '\'' +
                ", dbPass='" + dbPass + '\'' +
                ", standPfile='" + standPfile + '\'' +
                ", standDir='" + standDir + '\'' +
                ", controlfilePathname='" + controlfilePathname + '\'' +
                ", controlFileName='" + controlFileName + '\'' +
                ", flashRecoveryAreaName='" + flashRecoveryAreaName + '\'' +
                ", flashRecoveryAreaSize='" + flashRecoveryAreaSize + '\'' +
                ", standDbFileNameConvert='" + standDbFileNameConvert + '\'' +
                ", standLogFileNameConvert='" + standLogFileNameConvert + '\'' +
                ", archiveLogPath='" + archiveLogPath + '\'' +
                ", menSize=" + menSize +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getInitId() {
        return initId;
    }

    public void setInitId(Integer initId) {
        this.initId = initId;
        params.put(ApiConstants.INIT_ID, initId);
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

    public String getPriHostname() {
        return priHostname;
    }

    public void setPriHostname(String priHostname) {
        this.priHostname = priHostname;
        params.put(ApiConstants.PRI_HOSTNAME, priHostname);
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        params.put(ApiConstants.STATUS, status);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        params.put(ApiConstants.MESSAGE, message);
    }

    public SendOracleInfoFromProWoLCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLEFROMPRODUCTIONPARAMREREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
