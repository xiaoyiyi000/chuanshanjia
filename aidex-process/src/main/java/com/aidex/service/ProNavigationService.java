package com.aidex.service;

import com.aidex.common.core.service.BaseService;
import com.aidex.domain.ProColume;
import com.aidex.domain.ProNavigation;

import java.util.List;

public interface ProNavigationService extends BaseService<ProNavigation> {

    public List<ProNavigation> findPage();
}
