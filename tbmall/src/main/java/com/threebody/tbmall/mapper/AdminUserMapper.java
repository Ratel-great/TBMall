package com.threebody.tbmall.mapper;

import com.threebody.tbmall.entity.param.AdminUserRetrieveParam;
import com.threebody.tbmall.entity.result.AdminUserResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminUserMapper {

    List<AdminUserResult> queryPageByParam(AdminUserRetrieveParam adminUserRetrieveParam);
}
