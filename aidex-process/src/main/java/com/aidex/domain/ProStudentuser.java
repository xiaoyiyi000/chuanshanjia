package com.aidex.domain;

import com.aidex.common.annotation.Excel;
import com.aidex.common.annotation.Excels;
import com.aidex.common.core.domain.BaseEntity;
import com.aidex.common.core.domain.entity.SysDept;
import com.aidex.common.core.domain.entity.SysRole;
import com.aidex.common.core.domain.entity.SysUser;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class ProStudentuser extends BaseEntity<ProStudentuser> {

    @Excel(name = "部门编号", type = Excel.Type.IMPORT)
    private String deptId;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "英文名称")
    private String nameEn;
    @Excel(name = "用户编号")
    private String no;
    /**
     * 用户账号
     */
    @Excel(name = "登录名")
    private String userName;
    /**
     * 用户昵称
     */
    @Excel(name = "别称")
    private String nickName;
    @Excel(name = "用户类型", dictType = "sys_user_type")
    private String userType;
    /**
     * 用户邮箱
     */
    @Excel(name = "用户邮箱")
    private String email;
    /**
     * 手机号码
     */
    @Excel(name = "手机号码")
    private String phonenumber;
    /**
     * 用户性别
     */
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 密码
     */
    private String password;
    /**
     * 生日
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 民族
     */
    private String nation;
    /**
     * 籍贯
     */
    private String birthAddress;
    /**
     * 政治面貌
     */
    private String polity;
    /**
     * 职称
     */
    private String title;
    /**
     * 办公电话
     */
    private String officeTel;
    /**
     * 传真号
     */
    private String fax;
    /**
     * 工作地点
     */
    private String workSpace;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 工作地点
     */
    private String userPinyin;

    /**
     * 帐号状态（0正常 1停用）
     */
    @Excel(name = "帐号状态", readConverterExp = "0=正常,1=停用")
    private String status;
    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;
    /**
     * 最后登录IP
     */
    @Excel(name = "最后登录IP", type = Excel.Type.EXPORT)
    private String loginIp;
    /**
     * 最后登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "最后登录时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date loginDate;
    /**
     * 部门对象
     */
    @Excels({
            @Excel(name = "部门名称", targetAttr = "deptName", type = Excel.Type.EXPORT),
            @Excel(name = "部门负责人", targetAttr = "leader", type = Excel.Type.EXPORT)
    })
    private SysDept sysDept;
    /**
     * 角色对象
     */
    private List<SysRole> sysRoles;
    /**
     * 角色组
     */
    private String[] roleIds;
    /**
     * 岗位组
     */
    private String[] postIds;

    private String roleId;
    private String userNameOrName;


    private String xzclass;
    private String realName;



    public ProStu transStu(){
        ProStu s = new ProStu();
        s.setUserName(this.userName);
        s.setPhone(this.phonenumber);
        s.setXzclass(this.xzclass);
        s.setRealName(this.name);
        return s;
    }

    public SysUser transUser(){
        SysUser s = new SysUser();
        //s.setId(this.getId());
        s.setDeptId(this.deptId);
        s.setUserName(this.userName);
        s.setUserType(this.userType);
        s.setPostIds(this.postIds);
        s.setRoleIds(this.roleIds);
        s.setName(this.name);
        s.setNo(this.no);
        //s.setNickName(this.nickName);
        //s.setEmail(this.email);
        s.setPhonenumber(this.phonenumber);
        s.setSex(this.sex);
        //s.setAvatar(this.avatar);
        //s.setPassword(this.password);
        s.setStatus(this.status);
        //s.setDelFlag(this.delFlag);
        //s.setLoginIp(this.loginIp);
        //s.setLoginDate(this.loginDate);
        /*s.setCreateBy(this.CreateBy);
        s.setCreateTime(this.);
        s.setUpdateBy(this.);
        s.setUpdateTime(this.);
        s.setRemark(this.);
        s.setSysDept(this.);*/
        return s;
    }
}