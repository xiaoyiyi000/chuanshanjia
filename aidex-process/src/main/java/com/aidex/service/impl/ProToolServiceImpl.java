package com.aidex.service.impl;

import com.aidex.common.core.service.BaseServiceImpl;
import com.aidex.domain.ProTool;
import com.aidex.mapper.ProToolMapper;
import com.aidex.service.ProToolService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProToolServiceImpl extends BaseServiceImpl<ProToolMapper, ProTool> implements ProToolService {
    private static final Logger log = LoggerFactory.getLogger(ProToolServiceImpl.class);

    /*@Override
    //@DataScope(deptAlias = "a", userAlias = "b")
    public PageInfo<ProTool> findPage(ProTool proTool) {
        return super.findPage(proTool);
    }*/
   public List<ProTool> findPage(){
       return mapper.findList();
   }
}
