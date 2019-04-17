package com.threebody.tbmall.controller;

import com.github.pagehelper.PageInfo;
import com.threebody.tbmall.base.ApiResult;
import com.threebody.tbmall.entity.param.AdminUserRetrieveParam;
import com.threebody.tbmall.entity.result.AdminUserResult;
import com.threebody.tbmall.service.AdminUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "AdminUserController", tags = {"后台管理-后台用户接口"})
@RestController(value = "AdminUserController")
@RequestMapping(value = "/admin/user")
public class AdminUserController extends BaseController{

    Logger logger =  LogManager.getLogger(AdminUserController.class);

    private AdminUserService adminUserService;

    @Autowired
    public AdminUserController(AdminUserService adminUserService){
        this.adminUserService = adminUserService;
    }

    @ApiOperation(value = "分页查询后台用户")
    @GetMapping(value = "/list")
    public ApiResult<PageInfo<AdminUserResult>> findPageAll(@ModelAttribute AdminUserRetrieveParam adminUserRetrieveParam){
        PageInfo<AdminUserResult> adminUsers = adminUserService.selectAllPage(adminUserRetrieveParam);
        if(null == adminUsers || null == adminUsers.getList() || adminUsers.getList().size() == 0){
            logger.info("没有数据返回");
            return ApiResult.fail();
        }
        return ApiResult.success(adminUsers);
    }

}
