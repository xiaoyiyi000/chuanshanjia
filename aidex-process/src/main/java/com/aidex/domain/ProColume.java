package com.aidex.domain;

import com.aidex.common.annotation.Excel;
import com.aidex.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProColume extends BaseEntity<ProColume> {
    private static final long serialVersionUID = 1L;
    /**
     * 栏目分类
     */

    @Excel(name = "栏目编号", type = Excel.Type.IMPORT)
    private String colId;
    @Excel(name = "栏目图标")
    private byte[] colIcon;
    @Excel(name = "栏目名称")
    private String colName;
    @Excel(name = "栏目介绍")
    private String colIntroduce;

    private int colShow;

    @Excel(name = "栏目地址")
    private String colUrl;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("colId", getColId())
                .append("colIcon", getColIcon())
                .append("colName", getColName())
                .append("colIntroduce", getColIntroduce())
                .append("colShow", getColShow())
                .append("colUrl", getColUrl())
                .toString();
    }

}
