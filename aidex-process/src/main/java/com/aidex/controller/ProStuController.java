package com.aidex.controller;

import com.aidex.common.annotation.Log;
import com.aidex.common.core.controller.BaseController;
import com.aidex.common.core.domain.AjaxResult;
import com.aidex.common.core.domain.R;
import com.aidex.common.core.domain.entity.SysRole;
import com.aidex.common.core.domain.entity.SysUser;
import com.aidex.common.enums.BusinessType;
import com.aidex.common.utils.StringUtils;
import com.aidex.domain.ProStu;
import com.aidex.domain.ProStudentuser;
import com.aidex.service.ProCarouselService;
import com.aidex.service.ProStuService;
import com.aidex.system.domain.SysPost;
import com.aidex.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/process/student")
public class ProStuController extends BaseController {

    @Autowired
    private ProStuService proStuService;

    @Autowired
    private ISysUserService userService;

    @GetMapping(value = {"/", "/{userName}"})
    public AjaxResult getInfo(@PathVariable(value = "userName", required = false) String userName) {
        AjaxResult ajax = AjaxResult.success();

            //ajax.put(AjaxResult.DATA_TAG, proStuService.get(username));
            ajax.put("username", proStuService.selectStuByUserName(userName));
            //ajax.put("roleIds", roleService.selectRoleListByUserId(userId));

        return ajax;
    }

    //@PreAuthorize("@ss.hasPermi('system:user:add')")
    //@Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public R add(@Validated @RequestBody ProStudentuser user) {
        SysUser userpart=user.transUser();
        ProStu  stupart=user.transStu();
        R.status(proStuService.insertStu(stupart));
        return R.status(userService.insertUser(userpart));
    }

    @PostMapping("/information")
    public R update(@Validated @RequestBody ProStu stu) {
        //ProStu student=proStuService.selectStuByUserName(stu.getUserName());
        return R.status(proStuService.updateStu(stu));
    }


}
