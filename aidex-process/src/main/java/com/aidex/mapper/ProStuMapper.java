package com.aidex.mapper;

import com.aidex.common.core.domain.entity.SysUser;
import com.aidex.common.core.mapper.BaseMapper;
import com.aidex.domain.ProTool;
import com.aidex.domain.ProStu;
import com.aidex.system.domain.SysUserPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProStuMapper extends BaseMapper<ProStu> {

    public ProStu selectStuByUserName(@Param("userName") String userName);

    public int insertStu(ProStu proStu);

    public int updateStu(ProStu proStu);
}
