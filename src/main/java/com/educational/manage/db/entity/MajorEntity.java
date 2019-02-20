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
 * @date 20190220155914
 */
@TableName("major")
public class MajorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 课程编号
	 */
	@TableId
	@NotEmpty(groups = {VG.Add.class,VG.Update.class,VG.Delete.class,VG.Get.class})
	@ApiModelProperty("课程编号")
	private String mdid;
	/**
	 * 课程名称
	 */
	@ApiModelProperty("课程名称")
	private String mdname;
	/**
	 * 课程学分
	 */
	@ApiModelProperty("课程学分")
	private String mdcredit;
	/**
	 * 课程类型
	 */
	@ApiModelProperty("课程类型")
	private String mdstyle;

	public void setMdid(String mdid) {
		this.mdid = mdid;
	}

	public String getMdid() {
		return mdid;
	}

	public void setMdname(String mdname) {
		this.mdname = mdname;
	}

	public String getMdname() {
		return mdname;
	}

	public void setMdcredit(String mdcredit) {
		this.mdcredit = mdcredit;
	}

	public String getMdcredit() {
		return mdcredit;
	}

	public void setMdstyle(String mdstyle) {
		this.mdstyle = mdstyle;
	}

	public String getMdstyle() {
		return mdstyle;
	}
}
