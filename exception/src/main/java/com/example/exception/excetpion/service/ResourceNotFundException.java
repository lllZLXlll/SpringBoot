package com.example.exception.excetpion.service;

/**
 * 资源找不到异常
 */
public class ResourceNotFundException extends RuntimeException {

    public ResourceNotFundException(String msg) {
        super(msg);
    }

}
