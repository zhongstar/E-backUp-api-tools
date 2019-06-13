package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/7/12.
 */
public class SendOracleRacNetCmd extends BaseCmd {

    private static final String COMMAND_NAME = "SendOracleRacNetCmd";


    private Integer initId; //初始化id

    private String tmpPort; //临时端口

    private String oracleSid; //主库实例名(子节点)

    private String priOracleSid; //主库实例名（主节点）

    private String priLsn; //主库监听名

    private String standHostName; //备库主机名

    private String racHostName;  //rac主机名称

    private String priHostName;  //rac主机名称


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

    public String getPriOracleSid() {
        return priOracleSid;
    }

    public void setPriOracleSid(String priOracleSid) {
        this.priOracleSid = priOracleSid;
        params.put(ApiConstants.PRI_ORACLE_SID, priOracleSid);
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

    public String getPriHostName() {
        return priHostName;
    }

    public void setPriHostName(String priHostName) {
        this.priHostName = priHostName;
        params.put(ApiConstants.PRI_HOSTNAME, priHostName);


    }

    public SendOracleRacNetCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDORACLERACNETREPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
