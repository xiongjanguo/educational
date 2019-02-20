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
 * @date 20190220155834
 */
@TableName("mdteacher")
public class MdteacherEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 授课编号
	 */
	@TableId
	@NotEmpty(groups = {VG.Add.class,VG.Update.class,VG.Delete.class,VG.Get.class})
	@ApiModelProperty("授课编号")
	private String muid;
	/**
	 * 用户编号
	 */
	@ApiModelProperty("用户编号")
	private String id;
	/**
	 * 课程编号
	 */
	@ApiModelProperty("课程编号")
	private String mdid;

	public void setMuid(String muid) {
		this.muid = muid;
	}

	public String getMuid() {
		return muid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setMdid(String mdid) {
		this.mdid = mdid;
	}

	public String getMdid() {
		return mdid;
	}
}
