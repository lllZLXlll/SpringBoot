package com.qhjys.fund.service.mapper;

import com.qhjys.fund.entity.FundUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FundUserMapper {

    void save(@Param("item") FundUser item);

    void update(@Param("item") FundUser item);

    void delete(@Param("id") Long id);

    FundUser getById(@Param("id") Long id);

    List<FundUser> find(@Param("page") int page, @Param("size") int size);

}
