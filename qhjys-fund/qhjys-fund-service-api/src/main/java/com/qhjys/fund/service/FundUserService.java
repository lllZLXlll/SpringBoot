package com.qhjys.fund.service;

import com.qhjys.fund.common.exception.ValidationException;
import com.qhjys.fund.common.qo.FundUserQo;
import com.qhjys.fund.common.vo.FundUserVo;

import java.util.List;

public interface FundUserService {

    void save(FundUserQo item) throws ValidationException;

    void update(FundUserQo item) throws ValidationException;

    void delete(Long id);

    FundUserVo getById(Long id);

    List<FundUserVo> find(int page, int size);

}
