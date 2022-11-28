package com.aidex.service;

import com.aidex.common.core.service.BaseService;
import com.aidex.domain.ProCarousel;
import com.aidex.domain.ProColume;

import java.util.List;

public interface ProCarouselService extends BaseService<ProCarousel> {
    public List<ProCarousel> findPage();
}
