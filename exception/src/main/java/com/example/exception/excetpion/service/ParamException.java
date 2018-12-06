package com.example.exception.excetpion.service;

/**
 * service: 业务异常，进行业务操作时产生的异常如：资源找不到、参数非法、类型转换...
 * system:  系统异常，除业务异常之外的异常如：连接数据库超时、相应web请求超时...
 *
 * 对异常进行细分，以便开发和运维人员在日志的异常信息中快速定位问题。
 *
 * 参数异常
 */
public class ParamException extends RuntimeException {

    public ParamException(String msg) {
        super(msg);
    }

}
