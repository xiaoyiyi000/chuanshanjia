package com.aidex.service;

import com.aidex.common.core.service.BaseService;
import com.aidex.domain.ProColume;

import java.util.List;

public interface ProColumeService extends BaseService<ProColume> {
    /*@Override
    public PageInfo<ProColume> findPage(ProColume proColume);*/

    public List<ProColume> findPage();
}
