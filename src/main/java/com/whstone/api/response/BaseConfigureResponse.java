package com.whstone.api.response;

/**
 * Created by weijun on 2018/3/6.
 */
public class BaseConfigureResponse {

    private Integer configure_id;

    private Integer configure_type;

    private String configure_date;

    private String configure_hour;

    private String configure_minute;

    private String configure_second;

    private String reserver_one;

    private Integer operater_id;

    public Integer getConfigure_id() {
        return configure_id;
    }

    public void setConfigure_id(Integer configure_id) {
        this.configure_id = configure_id;
    }

    public Integer getConfigure_type() {
        return configure_type;
    }

    public void setConfigure_type(Integer configure_type) {
        this.configure_type = configure_type;
    }

    public String getConfigure_date() {
        return configure_date;
    }

    public void setConfigure_date(String configure_date) {
        this.configure_date = configure_date;
    }

    public String getConfigure_hour() {
        return configure_hour;
    }

    public void setConfigure_hour(String configure_hour) {
        this.configure_hour = configure_hour;
    }

    public String getConfigure_minute() {
        return configure_minute;
    }

    public void setConfigure_minute(String configure_minute) {
        this.configure_minute = configure_minute;
    }

    public String getConfigure_second() {
        return configure_second;
    }

    public void setConfigure_second(String configure_second) {
        this.configure_second = configure_second;
    }

    public String getReserver_one() {
        return reserver_one;
    }

    public void setReserver_one(String reserver_one) {
        this.reserver_one = reserver_one;
    }

    public Integer getOperater_id() {
        return operater_id;
    }

    public void setOperater_id(Integer operater_id) {
        this.operater_id = operater_id;
    }


}
