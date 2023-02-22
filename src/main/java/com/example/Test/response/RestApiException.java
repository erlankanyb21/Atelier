package com.example.Test.response;

public class RestApiException extends RuntimeException{
    public RestApiException(String message) {
        super(message);
    }
}
