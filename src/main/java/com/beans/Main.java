package com.beans;
import com.beans.Api.APIConnection;
import com.beans.Factory.*;

public class Main {
    public static void main(String[] args) {
        // Cambiar la fábrica según el tipo de API requerida
        APIFactory factory = new RestAPIFactory(); // Cambiar a GraphQLAPIFactory o SoapAPIFactory
        APIConnection api = factory.createConnection();
        
        api.makeRequest("https://api.example.com/data");
        System.out.println("Datos obtenidos: " + api.getData());
    }
}
