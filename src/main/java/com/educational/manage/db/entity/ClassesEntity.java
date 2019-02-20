package com.educational.manage.db.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import pub.codex.apix.annotations.*;
import pub.codex.apix.annotations.group.VG;
import javax.validation.constraints.*;
import java.util.Date;

import java.io.Serializable;

/**
 * 
 * 
 * @date 20190220155804
 */
@TableName("classes")
public class ClassesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 班别编号
	 */
	@TableId
	@NotEmpty(groups = {VG.Add.class,VG.Update.class,VG.Delete.class,VG.Get.class})
	@ApiModelProperty("班别编号")
	private String classesid;
	/**
	 * 班别名称
	 */
	@ApiModelProperty("班别名称")
	private String classesname;
	/**
	 * 班别描述
	 */
	@ApiModelProperty("班别描述")
	private String classescontext;

	public void setClassesid(String classesid) {
		this.classesid = classesid;
	}

	public String getClassesid() {
		return classesid;
	}

	public void setClassesname(String classesname) {
		this.classesname = classesname;
	}

	public String getClassesname() {
		return classesname;
	}

	public void setClassescontext(String classescontext) {
		this.classescontext = classescontext;
	}

	public String getClassescontext() {
		return classescontext;
	}
}
