package com.aidex.service;

import com.aidex.common.core.service.BaseService;
import com.aidex.domain.ProContainer;
import com.aidex.domain.ProStu;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ProContainerService extends BaseService<ProContainer> {
    public ProContainer selectContainerById(String containerid);

    @Transactional(readOnly = false)
    public boolean insertContainer(ProContainer proContainer);

    @Transactional(readOnly = false)
    public boolean deleteContainerById(String containerId);
}
