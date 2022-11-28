package com.aidex.domain;

import com.aidex.common.annotation.Excel;
import com.aidex.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProStu extends BaseEntity<ProStu> {
    private static final long serialVersionUID = 1L;

    @Excel(name = "用户名", type = Excel.Type.IMPORT)
    private String userName;
    @Excel(name = "真实姓名")
    private String realName;
    @Excel(name = "学号")
    private String sno;
    @Excel(name = "性别")
    private int sex;
    @Excel(name = "生日")
    private String birthday;
    @Excel(name = "电子邮件")
    private String email;
    @Excel(name = "QQ")
    private String qq;
    @Excel(name = "手机")
    private String phone;
    @Excel(name = "地址")
    private String address;
    @Excel(name = "签名")
    private String signature;
    @Excel(name = "班级")
    private String xzclass;
    @Excel(name = "微信")
    private String wechat;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("userName", getUserName())
                .append("realName", getRealName())
                .append("sno", getSno())
                .append("sex", getSex())
                .append("birthday", getBirthday())
                .append("email", getEmail())
                .append("qq", getQq())
                .append("phone", getPhone())
                .append("address", getAddress())
                .append("signature", getSignature())
                .append("xzclass", getXzclass())
                .append("wechat", getWechat())
                .toString();
    }
}
