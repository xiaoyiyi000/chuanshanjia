package com.aidex.service.impl;

import com.aidex.common.core.service.BaseServiceImpl;
import com.aidex.domain.ProColume;
import com.aidex.domain.ProNavigation;
import com.aidex.mapper.ProColumeMapper;
import com.aidex.mapper.ProNavigationMapper;
import com.aidex.service.ProColumeService;
import com.aidex.service.ProNavigationService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProNavigationServiceImpl extends BaseServiceImpl<ProNavigationMapper, ProNavigation> implements ProNavigationService {
    public List<ProNavigation> findPage(){
        return mapper.findList();
    }
}
