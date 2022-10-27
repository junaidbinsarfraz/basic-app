package com.basic.exception;

import org.springframework.http.HttpStatus;

public class BasicAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public BasicAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public BasicAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
