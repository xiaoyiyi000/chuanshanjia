package com.aidex.service.impl;

import com.aidex.common.core.service.BaseServiceImpl;
import com.aidex.domain.ProCarousel;
import com.aidex.domain.ProColume;
import com.aidex.mapper.ProCarouselMapper;
import com.aidex.mapper.ProColumeMapper;
import com.aidex.service.ProCarouselService;
import com.aidex.service.ProColumeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProCarouselServiceImpl extends BaseServiceImpl<ProCarouselMapper, ProCarousel> implements ProCarouselService {
    public List<ProCarousel> findPage(){
        return mapper.findList();
    }
}
