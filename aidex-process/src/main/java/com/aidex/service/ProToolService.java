package com.aidex.service;

import com.aidex.common.core.service.BaseService;
import com.aidex.domain.ProTool;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProToolService extends BaseService<ProTool> {
    //@Override
    //public PageInfo<ProTool> findPage(ProTool proTool);

    public List<ProTool> findPage();
}
