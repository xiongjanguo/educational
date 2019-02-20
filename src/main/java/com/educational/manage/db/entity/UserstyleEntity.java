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
 * @date 20190220160029
 */
@TableName("userstyle")
public class UserstyleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色编号
	 */
	@TableId
	@NotEmpty(groups = {VG.Add.class,VG.Update.class,VG.Delete.class,VG.Get.class})
	@ApiModelProperty("角色编号")
	private String userstyleid;
	/**
	 * 角色名称
	 */
	@ApiModelProperty("角色名称")
	private String userstylename;
	/**
	 * 权限
	 */
	@ApiModelProperty("权限")
	private String permission;

	public void setUserstyleid(String userstyleid) {
		this.userstyleid = userstyleid;
	}

	public String getUserstyleid() {
		return userstyleid;
	}

	public void setUserstylename(String userstylename) {
		this.userstylename = userstylename;
	}

	public String getUserstylename() {
		return userstylename;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getPermission() {
		return permission;
	}
}
