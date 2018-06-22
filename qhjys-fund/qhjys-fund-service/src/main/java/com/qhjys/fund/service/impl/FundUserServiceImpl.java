package com.qhjys.fund.service.impl;

import com.qhjys.fund.common.exception.ValidationException;
import com.qhjys.fund.common.qo.FundUserQo;
import com.qhjys.fund.common.vo.FundUserVo;
import com.qhjys.fund.entity.FundUser;
import com.qhjys.fund.service.FundUserService;
import com.qhjys.fund.service.mapper.FundUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class FundUserServiceImpl implements FundUserService {

    @Resource
    private FundUserMapper fundUserMapper;

    @Override
    public void save(FundUserQo item) throws ValidationException {
        if (StringUtils.isEmpty(item.getUserName())) {
            throw new ValidationException("用户名不能为空");
        }
        FundUser fundUser = new FundUser();
        BeanUtils.copyProperties(item, fundUser);
        fundUserMapper.save(fundUser);
    }

    @Override
    public void update(FundUserQo item) throws ValidationException {
        if (StringUtils.isEmpty(item.getUserName())) {
            throw new ValidationException("用户名不能为空");
        }
        FundUser fundUser = new FundUser();
        BeanUtils.copyProperties(item, fundUser);
        fundUserMapper.update(fundUser);
    }

    @Override
    public void delete(Long id) {
        fundUserMapper.delete(id);
    }

    @Override
    public FundUserVo getById(Long id) {
        FundUser fundUser = fundUserMapper.getById(id);
        FundUserVo fundUserVo = new FundUserVo();
        BeanUtils.copyProperties(fundUser, fundUserVo);
        return fundUserVo;
    }

    @Override
    public List<FundUserVo> find(int page, int size) {
        List<FundUser> fundUsers = fundUserMapper.find(page, size);
        List<FundUserVo> fundUserVos = new ArrayList<>();
        for (FundUser fundUser : fundUsers) {
            FundUserVo fundUserVo = new FundUserVo();
            BeanUtils.copyProperties(fundUser, fundUserVo);
            fundUserVos.add(fundUserVo);
        }
        return fundUserVos;
    }
}
