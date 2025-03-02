package com.beans.Api;


public class GraphQLAPIConnection implements APIConnection {
    private String data;

    public void makeRequest(String endpoint) {
        System.out.println("Conectando a GraphQL API en: " + endpoint);
        this.data = "{\"message\": \"Datos de GraphQL API\"}";
    }

    public String getData() {
        return data;
    }
}