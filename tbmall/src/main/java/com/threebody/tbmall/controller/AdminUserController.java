package com.threebody.tbmall.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.threebody.tbmall.base.ApiResult;
import com.threebody.tbmall.entity.param.AdminUserRetrieveParam;
import com.threebody.tbmall.entity.result.AdminUserResult;
import com.threebody.tbmall.service.AdminUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(value = "AdminUserController", tags = {"后台管理-后台用户接口"})
@RestController(value = "AdminUserController")
@RequestMapping(value = "/admin/user")
public class AdminUserController extends BaseController{

    private AdminUserService adminUserService;

    @Autowired
    public AdminUserController(AdminUserService adminUserService){
        this.adminUserService = adminUserService;
    }

    @ApiOperation(value = "分页查询后台用户")
    @GetMapping(value = "/list")
    public ApiResult<PageInfo<AdminUserResult>> findPageAll(@ModelAttribute AdminUserRetrieveParam adminUserRetrieveParam){
        PageInfo<AdminUserResult> adminUsers = adminUserService.selectAllPage(adminUserRetrieveParam);
        if(null == adminUsers){
            return ApiResult.fail("没有数据返回");
        }
        return ApiResult.success(adminUsers);
    }

}
