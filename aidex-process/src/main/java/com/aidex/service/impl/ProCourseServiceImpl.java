package com.aidex.service.impl;

import com.aidex.common.core.service.BaseServiceImpl;
import com.aidex.domain.ProCourse;
import com.aidex.mapper.ProCourseMapper;
import com.aidex.service.ProCourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProCourseServiceImpl extends BaseServiceImpl<ProCourseMapper, ProCourse> implements ProCourseService {

    private static final Logger log = LoggerFactory.getLogger(ProCourseServiceImpl.class);



    /*@Override
    //@DataScope(deptAlias = "a", userAlias = "b")
    public PageInfo<ProCourse> findPage(ProCourse proCourse) {
        PageDomain page = proCourse.getPage();
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        return new PageInfo(mapper.findList(proCourse));
    }*/
    public List<ProCourse> findPage(){
        return mapper.findList();
    }
}
