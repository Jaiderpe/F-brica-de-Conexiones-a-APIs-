package com.beans.Factory;
import com.beans.Api.APIConnection;
import com.beans.Api.RestAPIConnection;

public class RestAPIFactory implements APIFactory {
    public APIConnection createConnection() {
        return new RestAPIConnection();
    }
}