package com.aidex.mapper;

import com.aidex.common.core.mapper.BaseMapper;
import com.aidex.domain.ProCarousel;
import com.aidex.domain.ProColume;

import java.util.List;

public interface ProCarouselMapper extends BaseMapper<ProCarousel> {
    public List<ProCarousel> findList();
}
