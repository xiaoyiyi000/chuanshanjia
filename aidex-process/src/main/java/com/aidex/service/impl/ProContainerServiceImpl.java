package com.aidex.service.impl;

import com.aidex.common.core.service.BaseServiceImpl;
import com.aidex.domain.ProContainer;
import com.aidex.domain.ProStu;
import com.aidex.mapper.ProContainerMapper;
import com.aidex.mapper.ProStuMapper;
import com.aidex.service.ProContainerService;
import com.aidex.service.ProStuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProContainerServiceImpl extends BaseServiceImpl<ProContainerMapper,ProContainer> implements ProContainerService {
    private static final Logger log = LoggerFactory.getLogger(ProContainerServiceImpl.class);

    @Autowired(required = false)
    private ProContainerMapper proContainerMapper;


    public ProContainer selectContainerById(String containerid)
    {
        return proContainerMapper.selectContainerById(containerid);
    }

    @Override
    @Transactional
    public boolean insertContainer(ProContainer proContainer){
        proContainerMapper.insertContainer(proContainer);
        System.out.println("插入成功");
        return true;
    }

    @Override
    @Transactional
    public boolean deleteContainerById(String containerId){
        proContainerMapper.deleteContainerById(containerId);
        System.out.println("删除成功");
        return true;
    }
}
