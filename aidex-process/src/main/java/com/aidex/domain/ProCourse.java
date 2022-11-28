package com.aidex.domain;

import com.aidex.common.annotation.Excel;
import com.aidex.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProCourse extends BaseEntity<ProCourse> {
    private static final long serialVersionUID = 1L;
    /**
     * 精品课程
     */

    @Excel(name = "课程编号", type = Excel.Type.IMPORT)
    private String couId;
    @Excel(name = "课程图标")
    private byte[] couPicture;
    @Excel(name = "课程名称")
    private String couName;
    @Excel(name = "课程章节数量")
    private String couChapNum;
    @Excel(name = "课程实训数量")
    private String couTrainNum;
    @Excel(name = "课程实验数量")
    private String couExpNum;
    @Excel(name = "课程课件数量")
    private String couPPTNum;
    @Excel(name = "课程类别")
    private String couCategory;

    private int couShow;

    @Excel(name = "课程地址")
    private String couURL;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("couId", getCouId())
                .append("couPicture", getCouPicture())
                .append("couName", getCouName())
                .append("couChapNum", getCouChapNum())
                .append("couTrainNum", getCouTrainNum())
                .append("couExpNum", getCouExpNum())
                .append("couPPTNum", getCouPPTNum())
                .append("couCategory", getCouCategory())
                .append("couShow", getCouShow())
                .append("couURL", getCouURL())
                .toString();
    }
}
