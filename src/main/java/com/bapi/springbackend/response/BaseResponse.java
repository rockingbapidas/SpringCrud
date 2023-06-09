package com.bapi.springbackend.response;


public class BaseResponse<RESPONSE> {
    private ResponseStatus responseStatus = null;
    private RESPONSE response = null;

    public BaseResponse(ResponseStatus responseStatus, RESPONSE response) {
        this.responseStatus = responseStatus;
        this.response = response;
    }

    public ResponseStatus getStatus() {
        return responseStatus;
    }

    public void setStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public RESPONSE getResponse() {
        return response;
    }

    public void setResponse(RESPONSE response) {
        this.response = response;
    }
}