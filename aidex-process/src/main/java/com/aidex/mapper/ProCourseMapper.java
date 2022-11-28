package com.aidex.mapper;

import com.aidex.common.core.mapper.BaseMapper;
import com.aidex.domain.ProCourse;

import java.util.List;

public interface ProCourseMapper extends BaseMapper<ProCourse> {

    public List<ProCourse> findList();
}
