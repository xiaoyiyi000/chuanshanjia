package com.aidex.service.impl;

import com.aidex.common.core.service.BaseServiceImpl;
import com.aidex.domain.ProColume;
import com.aidex.mapper.ProColumeMapper;
import com.aidex.service.ProColumeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProColumeServiceImpl extends BaseServiceImpl<ProColumeMapper, ProColume> implements ProColumeService {
    /*@Override
    //@DataScope(deptAlias = "a", userAlias = "b")
    public PageInfo<ProColume> findPage(ProColume proColume) {
        PageDomain page = proColume.getPage();
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        return new PageInfo(mapper.findList(proColume));
    }*/
    public List<ProColume> findPage(){
        return mapper.findList();
    }
}
