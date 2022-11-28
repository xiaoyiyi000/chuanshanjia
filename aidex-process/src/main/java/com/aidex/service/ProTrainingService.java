package com.aidex.service;

import com.aidex.common.core.service.BaseService;
import com.aidex.domain.ProTraining;

import java.util.List;

public interface ProTrainingService extends BaseService<ProTraining> {
    /*@Override
    public PageInfo<ProTraining> findPage(ProTraining proTraining);*/

    public List<ProTraining> findPage();
}
