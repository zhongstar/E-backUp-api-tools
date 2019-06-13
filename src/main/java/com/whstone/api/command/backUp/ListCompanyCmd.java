package com.whstone.api.command.backUp;

import com.whstone.api.ApiConstants;
import com.whstone.api.ApiData;
import com.whstone.api.ApiResponseConstants;
import com.whstone.api.BaseCmd;
import com.whstone.api.response.CompanyResponse;
import com.whstone.api.response.ListResponse;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijun on 2018/2/7.
 */
public class ListCompanyCmd extends BaseCmd {


    private static final String COMMAND_NAME = "listCompany";

    private int id;

    private String name;

    private int age;

    private String address;

    private double salary;


    public ListCompanyCmd(ApiData apiData) {
        super(apiData, ApiResponseConstants.LISTCOMPANYS);
        params.put(ApiConstants.COMMAND, COMMAND_NAME);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        params.put(ApiConstants.ID, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        params.put(ApiConstants.NAME, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        params.put(ApiConstants.AGE, age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        params.put(ApiConstants.ADDRESS, address);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        params.put(ApiConstants.SALARY, salary);
    }

    public ListResponse<CompanyResponse> getResult() {

        if (this.responseJSONObject.isEmpty())
            return null;
        ListResponse<CompanyResponse> response = new ListResponse<CompanyResponse>();
        //     setCountAndJob(response, responseJSONObject);

        JSONArray array = responseJSONObject.getJSONArray(ApiResponseConstants.COMPANY);
        if (!array.isEmpty()) {

            List<CompanyResponse> responses = new ArrayList<CompanyResponse>();
            for (int i = 0; i < array.size(); i++) {
                JSONObject o = array.getJSONObject(i);
                if (!o.isEmpty()) {
                    CompanyResponse response2 = (CompanyResponse) JSONObject.toBean(o,
                            CompanyResponse.class);
                    responses.add(response2);
                }
            }
            response.setResponses(responses);
        }
        return response;
    }
}
