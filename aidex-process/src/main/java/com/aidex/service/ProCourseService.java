package com.aidex.service;

import com.aidex.common.core.service.BaseService;
import com.aidex.domain.ProCourse;

import java.util.List;

public interface ProCourseService extends BaseService<ProCourse> {

    /*@Override
    public PageInfo<ProCourse> findPage(ProCourse proCourse);*/

    public List<ProCourse> findPage();
}
