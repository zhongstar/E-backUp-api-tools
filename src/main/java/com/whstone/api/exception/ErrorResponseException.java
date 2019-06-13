package com.whstone.api.exception;


import com.whstone.api.response.ExceptionResponse;

public class ErrorResponseException extends Exception {
    private static final long serialVersionUID = 8784427323859682503L;

    private ExceptionResponse response;

    public ErrorResponseException(ExceptionResponse response) {
        super(response.toString());
        this.response = response;
    }

    public ExceptionResponse getResponse() {
        return response;
    }

    public void setResponse(ExceptionResponse response) {
        this.response = response;
    }

}
