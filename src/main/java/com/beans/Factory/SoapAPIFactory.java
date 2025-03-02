package com.beans.Factory;
import com.beans.Api.APIConnection;
import com.beans.Api.SoapAPIConnection;

public class SoapAPIFactory implements APIFactory {
    public APIConnection createConnection() {
        return new SoapAPIConnection();
    }
}