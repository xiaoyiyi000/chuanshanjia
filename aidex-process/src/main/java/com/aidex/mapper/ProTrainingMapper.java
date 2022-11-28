package com.aidex.mapper;

import com.aidex.common.core.mapper.BaseMapper;
import com.aidex.domain.ProTraining;

import java.util.List;

public interface ProTrainingMapper extends BaseMapper<ProTraining> {
    public List<ProTraining> findList();
}
