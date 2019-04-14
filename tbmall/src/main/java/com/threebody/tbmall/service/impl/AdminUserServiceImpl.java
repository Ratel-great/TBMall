package com.threebody.tbmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.threebody.tbmall.entity.param.AdminUserCreateParam;
import com.threebody.tbmall.entity.param.AdminUserRetrieveParam;
import com.threebody.tbmall.entity.param.AdminUserUpdateParam;
import com.threebody.tbmall.entity.result.AdminUserResult;
import com.threebody.tbmall.mapper.AdminUserMapper;
import com.threebody.tbmall.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    private AdminUserMapper adminUserMapper;

    @Autowired
    public AdminUserServiceImpl(AdminUserMapper adminUserMapper){
        this.adminUserMapper = adminUserMapper;
    }

    @Override
    public Boolean delete(String id) {
        return false;
    }

    @Override
    public Boolean insert(AdminUserCreateParam record) {
        return false;
    }

    @Override
    public Boolean update(AdminUserUpdateParam record) {
        return false;
    }

    @Override
    public AdminUserResult selectByT(AdminUserRetrieveParam record) {
        return null;
    }

    @Override
    public List<AdminUserResult> selectAll(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PageInfo<AdminUserResult> selectAllPage(AdminUserRetrieveParam adminUserRetrieveParam) {
        PageHelper.startPage(adminUserRetrieveParam.getPageNum(), adminUserRetrieveParam.getPageSize());
        List<AdminUserResult> adminUserResultList = adminUserMapper.queryPageByParam(adminUserRetrieveParam);
        return new PageInfo<AdminUserResult>(adminUserResultList);
    }
}
