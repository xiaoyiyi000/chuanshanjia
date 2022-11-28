package com.aidex.domain;


import com.aidex.common.annotation.Excel;
import com.aidex.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProNavigation extends BaseEntity<ProNavigation> {
    private static final long serialVersionUID = 1L;

    @Excel(name = "导航编号", type = Excel.Type.IMPORT)
    private String navId;
    @Excel(name = "导航中文名")
    private String navName;
    @Excel(name = "导航英文名")
    private String navEname;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("navId", getNavId())
                .append("navName", getNavName())
                .append("navEname", getNavEname())
                .toString();
    }

}
