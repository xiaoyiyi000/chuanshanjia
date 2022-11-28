package com.aidex.mapper;

import com.aidex.common.core.mapper.BaseMapper;
import com.aidex.domain.ProColume;

import java.util.List;

public interface ProColumeMapper extends BaseMapper<ProColume> {
    public List<ProColume> findList();
}
