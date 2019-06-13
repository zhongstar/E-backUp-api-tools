package com.whstone.api.command.backUp.push;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

/**
 * Created by weijun on 2018/3/9.
 */
public class SendApiDataInfoCmd extends BaseCmd {

    private static final String COMMAND_NAME = "sendApiDataInfo";

    private String hostName;

    private String baseurl;

    private String apipath;

    private String reseverOne;


    private String nfsShareUrl;

    private String nfsPoint;


    private String storagePath;  // 存储路径盘符

    private String sharePath;     //共享路径盘符

    private String shareLoginName; //共享文件夹登录名

    private String shareLoginPass; //共享文件夹登录密码

    private Integer storeType;  //1:NFS;2:CLOUD

    private String ak;

    private String sk;

    private String endpoint;


    public String getNfsShareUrl() {
        return nfsShareUrl;
    }

    public void setNfsShareUrl(String nfsShareUrl) {
        this.nfsShareUrl = nfsShareUrl;
        params.put(ApiConstants.NFS_SHARE_URL, nfsShareUrl);
    }

    public String getNfsPoint() {
        return nfsPoint;
    }

    public void setNfsPoint(String nfsPoint) {
        this.nfsPoint = nfsPoint;
        params.put(ApiConstants.NFS_POINT, nfsPoint);
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


    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        params.put(ApiConstants.STORAGEPATH, storagePath);
    }

    public String getSharePath() {
        return sharePath;
    }

    public void setSharePath(String sharePath) {
        this.sharePath = sharePath;
        params.put(ApiConstants.SHAREEPATH, sharePath);
    }

    public SendApiDataInfoCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDAPIDATAINFORESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getShareLoginName() {
        return shareLoginName;
    }

    public void setShareLoginName(String shareLoginName) {
        this.shareLoginName = shareLoginName;
        params.put(ApiConstants.SHARE_LOGIN_NAME, shareLoginName);
    }

    public String getShareLoginPass() {
        return shareLoginPass;
    }

    public void setShareLoginPass(String shareLoginPass) {
        this.shareLoginPass = shareLoginPass;
        params.put(ApiConstants.SHARE_LOGIN_PASS, shareLoginPass);
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
        params.put(ApiConstants.STORE_TYPE, storeType);
    }

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
        params.put(ApiConstants.AK, ak);

    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
        params.put(ApiConstants.SK, sk);
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        params.put(ApiConstants.END_POINT, endpoint);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }
}
