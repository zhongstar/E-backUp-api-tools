package com.whstone.api.command.onokeymanage;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;

public class SendCopyCertFileFromNfsCmd extends BaseCmd {


    private static final String COMMAND_NAME = "sendCopyCertFileFromNfs";

    private String certPath;

    private String adminUsername;

    private String adminPassword;


    public String getCertPath() {
        return certPath;
    }

    public void setCertPath(String certPath) {
        this.certPath = certPath;
        params.put(ApiConstants.CERTPATH, certPath);

    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        params.put(ApiConstants.ADMINUSERNAME, adminUsername);
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        params.put(ApiConstants.ADMINPASSWORD, adminPassword);
    }

    public SendCopyCertFileFromNfsCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.SENDCOPYCERTFILEFORMNFSRESPONSE);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public String getResult() {

        return responseJSONObject.getString("result");

    }


}
