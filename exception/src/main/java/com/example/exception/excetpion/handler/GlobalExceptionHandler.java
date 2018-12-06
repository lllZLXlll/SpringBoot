package com.example.exception.excetpion.handler;

import com.example.exception.excetpion.service.ParamException;
import com.example.exception.excetpion.service.ResourceNotFundException;
import com.example.exception.excetpion.system.SystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * 全局的的异常拦截器（拦截所有的控制器）（带有@RequestMapping注解的方法上都会拦截）
 */
@ControllerAdvice
@Order(-1)
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(ResourceNotFundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String exception_404(ResourceNotFundException e) {
        String result = "{'state': 404, msg: '" + e.getMessage() + "'}";
        log.error(e.getMessage(), e);
        return result;
    }

    @ExceptionHandler(SystemException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String exception_500(RuntimeException e) {
        String result = "{'state': 500, msg: '" + e.getMessage() + "'}";
        return result;
    }

    @ExceptionHandler(ParamException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ResponseBody
    public String exception_403(ParamException e) {
        String result = "{'state': 403, msg: '" + e.getMessage() + "'}";
        return result;
    }

}
