package com.qhjys.fund.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "用户Vo")
public class FundUserVo implements Serializable {

    private static final long serialVersionUID = -2363934824657632903L;

    @ApiModelProperty(required = true, value = "ID")
    private Long id;

    @ApiModelProperty(required = true, value = "账号")
    private String userName;

    @ApiModelProperty(required = true, value = "密码")
    private String password;

    @ApiModelProperty(required = true, value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createdDate;
}
