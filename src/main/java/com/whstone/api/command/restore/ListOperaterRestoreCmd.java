package com.whstone.api.command.restore;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;
import com.whstone.api.response.ListResponse;
import com.whstone.api.response.OperaterRestoreResponse;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijun on 2018/5/30.
 */
public class ListOperaterRestoreCmd extends BaseCmd {


    private static final String COMMAND_NAME = "listOperaterRestore";

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


    public ListOperaterRestoreCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.LISTOPERATEERRESTORERESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public ListResponse<OperaterRestoreResponse> getResult() {

        if (this.responseJSONObject.isEmpty())
            return null;
        ListResponse<OperaterRestoreResponse> response = new ListResponse<OperaterRestoreResponse>();
        //     setCountAndJob(response, responseJSONObject);

        JSONArray array = responseJSONObject.getJSONArray(ApiResponseConstants.OPERATERRESTORE);
        if (!array.isEmpty()) {

            List<OperaterRestoreResponse> responses = new ArrayList<OperaterRestoreResponse>();
            for (int i = 0; i < array.size(); i++) {
                JSONObject o = array.getJSONObject(i);
                if (!o.isEmpty()) {
                    OperaterRestoreResponse response2 = (OperaterRestoreResponse) JSONObject.toBean(o,
                            OperaterRestoreResponse.class);
                    responses.add(response2);
                }
            }
            response.setResponses(responses);
        }
        return response;
    }


}
