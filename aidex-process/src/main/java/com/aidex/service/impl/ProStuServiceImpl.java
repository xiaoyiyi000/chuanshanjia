package com.aidex.service.impl;

import com.aidex.common.core.domain.BaseEntity;
import com.aidex.common.core.domain.entity.SysUser;
import com.aidex.common.core.service.BaseServiceImpl;
import com.aidex.common.utils.PinYin4JCn;
import com.aidex.common.utils.SecurityUtils;
import com.aidex.common.utils.StringUtils;
import com.aidex.domain.ProStu;
import com.aidex.domain.ProTool;
import com.aidex.framework.cache.ConfigUtils;
import com.aidex.mapper.ProStuMapper;
import com.aidex.mapper.ProToolMapper;
import com.aidex.service.ProStuService;
import com.aidex.service.ProToolService;
import com.aidex.system.domain.SysUserPost;
import com.aidex.system.domain.SysUserRole;
import com.aidex.system.mapper.SysUserPostMapper;
import com.aidex.system.mapper.SysUserRoleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProStuServiceImpl extends BaseServiceImpl<ProStuMapper, ProStu> implements ProStuService {
    private static final Logger log = LoggerFactory.getLogger(ProStuServiceImpl.class);

    @Autowired(required = false)
    private ProStuMapper proStuMapper;

    public ProStu selectStuByUserName(String userName)
    {
        return mapper.selectStuByUserName(userName);
    }

    @Override
    @Transactional
    public boolean insertStu(ProStu user){
        proStuMapper.insertStu(user);
        //System.out.println("插入成功");
        return true;
    }

    @Override
    @Transactional
    public boolean updateStu(ProStu stu)
    {
        proStuMapper.updateStu(stu);
        // 删除用户与角色关联

        return true;
    }


}
