package com.whstone.api.response;


import com.whstone.api.BaseResponse;

import java.util.List;

public class ListResponse<T extends BaseResponse> extends BaseResponse {

    private List<T> responses;
    private int count;

    public List<T> getResponses() {
        return responses;
    }

    public void setResponses(List<T> responses) {
        this.responses = responses;
    }

    public void setResponses(List<T> responses, int count) {
        this.responses = responses;
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
