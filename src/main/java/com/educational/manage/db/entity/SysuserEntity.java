package com.educational.manage.db.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import pub.codex.apix.annotations.*;
import pub.codex.apix.annotations.group.VG;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * 
 * 
 * @date 20190220160007
 */
@TableName("sysuser")
public class SysuserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户编号
	 */
	@TableId
	@NotEmpty(groups = {VG.Add.class,VG.Update.class,VG.Delete.class,VG.Get.class})
	@ApiModelProperty("用户编号")
	private String id;
	/**
	 * 班级编号
	 */
	@ApiModelProperty("班级编号")
	private String classesid;
	/**
	 * 角色编号
	 */
	@ApiModelProperty("角色编号")
	private String userstyleid;
	/**
	 * 用户名
	 */
	@ApiModelProperty("用户名")
	private String username;
	/**
	 * 密码
	 */
	@ApiModelProperty("密码")
	private String password;
	/**
	 * 性别
	 */
	@ApiModelProperty("性别")
	private String sex;
	/**
	 * 住址
	 */
	@ApiModelProperty("住址")
	private String address;
	/**
	 * 电话
	 */
	@ApiModelProperty("电话")
	private String phone;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setClassesid(String classesid) {
		this.classesid = classesid;
	}

	public String getClassesid() {
		return classesid;
	}

	public void setUserstyleid(String userstyleid) {
		this.userstyleid = userstyleid;
	}

	public String getUserstyleid() {
		return userstyleid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}
}
