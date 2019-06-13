package com.whstone.api.response;

import com.whstone.api.BaseResponse;

/**
 * Created by weijun on 2018/5/9.
 */
public class HostManageResponse extends BaseResponse {
    private Integer hostId;

    private String manageHost;

    private String baseUrl;

    private String apiPath;

    private String reserverOne;

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getManageHost() {
        return manageHost;
    }

    public void setManageHost(String manageHost) {
        this.manageHost = manageHost;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getReserverOne() {
        return reserverOne;
    }

    public void setReserverOne(String reserverOne) {
        this.reserverOne = reserverOne;
    }
}
