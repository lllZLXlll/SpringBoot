package com.example.exception.excetpion;

import com.example.exception.excetpion.service.ParamException;
import com.example.exception.excetpion.service.ResourceNotFundException;

import java.io.File;

/**
 * 自定义断言
 * 用此类做参数校验，异常抛出，由全局异常处理类：GlobalExceptionHandler做处理。
 */
public class ExceptionAssert {

    public static void assertIsNotNull(File file, String msg) {
        if (file == null) {
            throw new ResourceNotFundException(msg);
        }
    }

    public static void assertIsNotEmpty(Object param, String msg) {
        if (param == null || param.toString().equals("")) {
            throw new ParamException(msg);
        }
    }

}
