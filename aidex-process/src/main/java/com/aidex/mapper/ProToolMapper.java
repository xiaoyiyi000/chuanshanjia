package com.aidex.mapper;

import com.aidex.common.core.mapper.BaseMapper;
import com.aidex.domain.ProTool;

import java.util.List;

public interface ProToolMapper extends BaseMapper<ProTool> {
    public List<ProTool> findList();
}
