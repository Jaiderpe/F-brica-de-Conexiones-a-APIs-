package com.beans.Factory;
import com.beans.Api.APIConnection;
import com.beans.Api.GraphQLAPIConnection;

public class GraphQLAPIFactory implements APIFactory {
    public APIConnection createConnection() {
        return new GraphQLAPIConnection();
    }
}