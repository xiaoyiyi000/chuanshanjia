package com.aidex.domain;

import com.aidex.common.annotation.Excel;
import com.aidex.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProTraining extends BaseEntity<ProTraining> {
    private static final long serialVersionUID = 1L;
    /**
     * 实训
     */
    @Excel(name = "实训编号", type = Excel.Type.IMPORT)
    private String traId;
    @Excel(name = "实训名称")
    private String traName;
    @Excel(name = "实训难度")
    private String traDifficulty;
    @Excel(name = "实训分数")
    private String traScore;
    @Excel(name = "实训类别")
    private String traCategory;
    @Excel(name = "实训解决数量")
    private String traSolved;

    private int traShow;

    @Excel(name = "实训地址")
    private String traUrl;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("traId", getTraId())
                .append("traName", getTraName())
                .append("traDifficulty", getTraDifficulty())
                .append("traScore", getTraScore())
                .append("traCategory", getTraCategory())
                .append("traSolved", getTraSolved())
                .append("traShow", getTraShow())
                .append("traUrl", getTraUrl())
                .toString();
    }
}
