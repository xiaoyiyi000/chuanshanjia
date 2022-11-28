package com.aidex.domain;

import com.aidex.common.annotation.Excel;
import com.aidex.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProCarousel extends BaseEntity<ProCarousel> {

    private static final long serialVersionUID = 1L;

    @Excel(name = "轮播图编号", type = Excel.Type.IMPORT)
    private String crlId;
    @Excel(name = "轮播图图标")
    private byte[] crlPicture;
    @Excel(name = "轮播图跳转地址")
    private String crlURL;

    private int crlShow;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("crlId", getCrlId())
                .append("crlPicture", getCrlPicture())
                .append("crlURL", getCrlURL())
                .append("crlShow", getCrlShow())
                .toString();
    }
}
