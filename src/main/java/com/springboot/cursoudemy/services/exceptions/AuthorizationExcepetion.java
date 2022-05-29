package com.springboot.cursoudemy.services.exceptions;

public class AuthorizationExcepetion extends RuntimeException{

    public AuthorizationExcepetion(String msg) {
        super(msg);
    }

    public AuthorizationExcepetion(String msg, Throwable cause) {
        super(msg, cause);
    }

}
