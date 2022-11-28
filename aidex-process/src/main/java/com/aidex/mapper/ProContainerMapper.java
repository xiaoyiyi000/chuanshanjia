package com.aidex.mapper;

import com.aidex.common.core.mapper.BaseMapper;
import com.aidex.domain.ProCarousel;
import com.aidex.domain.ProContainer;
import com.aidex.domain.ProStu;
import org.apache.ibatis.annotations.Param;

public interface ProContainerMapper extends BaseMapper<ProContainer> {
    public ProContainer selectContainerById(@Param("containerid") String containerid);

    public int insertContainer(ProContainer proContainer);

    public boolean deleteContainerById(String containerId);
}
