package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/5/7.
 */
public class SendDeleteOperaterCmd extends BaseCmd {


    private static final String COMMAND_NAME = "sendDeleteOperaterInfo";


    /**
     * 操作id
     */
    private Integer operaterId;
    /**
     * 是备份还是恢复操作 0：备份，1：恢复
     */
    private Integer backupOrRestore;

    public Integer getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Integer operaterId) {
        this.operaterId = operaterId;
        params.put(ApiConstants.OPERATION_ID, operaterId);
    }

    public Integer getBackupOrRestore() {
        return backupOrRestore;
    }

    public void setBackupOrRestore(Integer backupOrRestore) {
        this.backupOrRestore = backupOrRestore;
        params.put(ApiConstants.BACKUP_OR_RESTORE, backupOrRestore);
    }

    public SendDeleteOperaterCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDDELETEOPERATERINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public String getResult() {

        return responseJSONObject.getString("result");

    }

}
