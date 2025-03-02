package com.beans.Api;

public class RestAPIConnection implements APIConnection {
    private String data;

    public void makeRequest(String endpoint) {
        System.out.println("Conectando a REST API en: " + endpoint);
        this.data = "{\"message\": \"Datos de REST API\"}";
    }

    public String getData() {
        return data;
    }
}