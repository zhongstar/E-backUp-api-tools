package com.whstone.api;

public class BaseResponse {

    /**
     * the ID of the latest async job acting on this object
     */
    private String jobid;

    /**
     * the current status of the latest async job acting on this object
     */
    private Integer jobstatus;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public Integer getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(Integer jobstatus) {
        this.jobstatus = jobstatus;
    }

}
