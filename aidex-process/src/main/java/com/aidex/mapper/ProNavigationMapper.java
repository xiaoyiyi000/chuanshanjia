package com.aidex.mapper;

import com.aidex.common.core.mapper.BaseMapper;
import com.aidex.domain.ProCourse;
import com.aidex.domain.ProNavigation;

import java.util.List;

public interface ProNavigationMapper extends BaseMapper<ProNavigation> {

    public List<ProNavigation> findList();
}
