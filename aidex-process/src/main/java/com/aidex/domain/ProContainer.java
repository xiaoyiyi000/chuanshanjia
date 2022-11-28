package com.aidex.domain;

import com.aidex.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
public class ProContainer extends BaseEntity<ProContainer> {

    private String containerId;
    private String imageId;
    private String containerName;
    private String imageName;
    private String flag;
    private int localport;
    private int containerport;
    private String url;
    private int started;
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("containerId", getContainerId())
                .append("imageId", getImageId())
                .append("containerName", getContainerName())
                .append("imageName", getImageName())
                .append("flag", getFlag())
                .append("localport", getLocalport())
                .append("containerport", getContainerport())
                .append("url", getUrl())
                .append("url", getStarted())
                .toString();
    }
}
