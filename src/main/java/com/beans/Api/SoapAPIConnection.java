package com.beans.Api;

public class SoapAPIConnection implements APIConnection {
    private String data;

    public void makeRequest(String endpoint) {
        System.out.println("Conectando a SOAP API en: " + endpoint);
        this.data = "<message>Datos de SOAP API</message>";
    }

    public String getData() {
        return data;
    }
}