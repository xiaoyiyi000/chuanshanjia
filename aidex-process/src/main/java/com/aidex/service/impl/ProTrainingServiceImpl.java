package com.aidex.service.impl;

import com.aidex.common.core.service.BaseServiceImpl;
import com.aidex.domain.ProTraining;
import com.aidex.mapper.ProTrainingMapper;
import com.aidex.service.ProTrainingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProTrainingServiceImpl extends BaseServiceImpl<ProTrainingMapper, ProTraining> implements ProTrainingService {
    private static final Logger log = LoggerFactory.getLogger(ProColumeServiceImpl.class);


    /*@Override
    //@DataScope(deptAlias = "a", userAlias = "b")
    public PageInfo<ProTraining> findPage(ProTraining proTraining) {
        return super.findPage(proTraining);
    }*/
    //@DataScope(deptAlias = "a", userAlias = "b")
    public List<ProTraining> findPage(){
        return mapper.findList();
    }
}
