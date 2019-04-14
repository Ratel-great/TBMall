package com.threebody.tbmall.service;

import com.threebody.tbmall.base.BaseCRUDService;
import com.threebody.tbmall.entity.param.AdminUserCreateParam;
import com.threebody.tbmall.entity.param.AdminUserRetrieveParam;
import com.threebody.tbmall.entity.param.AdminUserUpdateParam;
import com.threebody.tbmall.entity.result.AdminUserResult;

public interface AdminUserService extends BaseCRUDService<AdminUserCreateParam, AdminUserUpdateParam, AdminUserRetrieveParam, AdminUserResult> {

}
