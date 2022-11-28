package com.aidex.service;

import com.aidex.common.core.domain.entity.SysUser;
import com.aidex.common.core.service.BaseService;
import com.aidex.domain.ProCourse;
import com.aidex.domain.ProStu;
import org.springframework.transaction.annotation.Transactional;

public interface ProStuService extends BaseService<ProStu> {

    public ProStu selectStuByUserName(String userName);

    @Transactional(readOnly = false)
    public boolean insertStu(ProStu user);

    @Transactional(readOnly = false)
    public boolean updateStu(ProStu stu);


}
