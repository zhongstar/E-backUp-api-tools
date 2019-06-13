package com.whstone.api.command.backUp;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;
import com.whstone.api.response.HostManageResponse;
import com.whstone.api.response.ListResponse;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijun on 2018/5/9.
 */
public class ListHostManageCmd extends BaseCmd {

    private static final String COMMAND_NAME = "listHostManage";

    private int id;

    private String hostName;

    private String baseurl;

    private String apipath;

    private String reseverOne;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        params.put(ApiConstants.ID, id);
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
        params.put(ApiConstants.HOST_NAME, hostName);
    }

    public String getBaseurl() {
        return baseurl;
    }

    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
        params.put(ApiConstants.BASEURL, baseurl);
    }


    public String getApipath() {
        return apipath;
    }

    public void setApipath(String apipath) {
        this.apipath = apipath;
        params.put(ApiConstants.APIPATH, apipath);
    }


    public String getReseverOne() {
        return reseverOne;
    }

    public void setReseverOne(String reseverOne) {
        this.reseverOne = reseverOne;
        params.put(ApiConstants.RESERVER_ONE, reseverOne);
    }

    public ListHostManageCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.LISTHOSTMANAGERESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }


    public ListResponse<HostManageResponse> getResult() {

        if (this.responseJSONObject.isEmpty())
            return null;
        ListResponse<HostManageResponse> response = new ListResponse<HostManageResponse>();
        //     setCountAndJob(response, responseJSONObject);

        JSONArray array = responseJSONObject.getJSONArray(ApiResponseConstants.HOSTMANAGE);
        if (!array.isEmpty()) {

            List<HostManageResponse> responses = new ArrayList<HostManageResponse>();
            for (int i = 0; i < array.size(); i++) {
                JSONObject o = array.getJSONObject(i);
                if (!o.isEmpty()) {
                    HostManageResponse response2 = (HostManageResponse) JSONObject.toBean(o,
                            HostManageResponse.class);
                    responses.add(response2);
                }
            }
            response.setResponses(responses);
        }
        return response;
    }
}
