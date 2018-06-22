package com.qhjys.fund.admin.controller;

import com.qhjys.fund.common.util.Response;
import com.qhjys.fund.service.FundUserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@RestController
@RequestMapping("/fund/user")
@Api(tags = "用户")
public class FundUserController {

    @Resource
    private FundUserService fundUserService;

//    @RequestMapping(value = "/fund/user", method = POST)
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "year", value = "年份", required = true, paramType = "query"),
//            @ApiImplicitParam(name = "month", value = "月份", required = true, paramType = "query")
//    })
//    public Response saveView(@RequestBody FundUserQo fundUserQo) {
//        try {
//            fundUserService.save(fundUserQo);
//        } catch (ValidationException e) {
//            return Response.create().error(e.getMessage());
//        }
//        return Response.create().success();
//    }

    @RequestMapping(value = "/fund/user", method = GET)
    public Response findUser() {
        return Response.create().body(fundUserService.find(0, 20));
    }

    @RequestMapping(value = "/hello", method = GET)
    public Response hello() {
        return Response.create().body("hello world");
    }
}
