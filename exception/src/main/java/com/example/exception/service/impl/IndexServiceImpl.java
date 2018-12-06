package com.example.exception.service.impl;

import com.example.exception.excetpion.ExceptionAssert;
import com.example.exception.service.IndexService;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public String index() {
        File file = null;
        ExceptionAssert.assertIsNotNull(file, "资源文件不能为空");
        return "success";
    }

    @Override
    public String index1() {
//        int a = 1;
//        int b = 0;
//        a = a / b;

        String param = "";
        ExceptionAssert.assertIsNotEmpty(param, "参数非法");

        return "success";
    }
}
