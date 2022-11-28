package com.aidex.domain;

import com.aidex.common.annotation.Excel;
import com.aidex.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProTool extends BaseEntity<ProTool> {
    private static final long serialVersionUID = 1L;
    /**
     * 实训
     */
    @Excel(name = "工具编号", type = Excel.Type.IMPORT)
    private String toolId;
    @Excel(name = "工具名字")
    private String toolName;
    @Excel(name = "工具地址")
    private String toolUrl;


    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("toolId", getToolId())
                .append("toolName", getToolName())
                .append("toolUrl", getToolUrl())
                .toString();
    }
}
