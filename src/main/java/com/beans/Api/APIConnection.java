package com.beans.Api;

public interface APIConnection {
    void makeRequest(String endpoint);
    String getData();
}