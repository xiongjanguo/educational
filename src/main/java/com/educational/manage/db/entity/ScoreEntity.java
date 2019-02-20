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
 * @date 20190220155935
 */
@TableName("score")
public class ScoreEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 选课成绩编号
	 */
	@TableId
	@NotEmpty(groups = {VG.Add.class,VG.Update.class,VG.Delete.class,VG.Get.class})
	@ApiModelProperty("选课成绩编号")
	private String scid;
	/**
	 * 用户名称
	 */
	@ApiModelProperty("用户名称")
	private String id;
	/**
	 * 课程编号
	 */
	@ApiModelProperty("课程编号")
	private String muid;
	/**
	 * 期末成绩
	 */
	@ApiModelProperty("期末成绩")
	private String endgrade;

	public void setScid(String scid) {
		this.scid = scid;
	}

	public String getScid() {
		return scid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setMuid(String muid) {
		this.muid = muid;
	}

	public String getMuid() {
		return muid;
	}

	public void setEndgrade(String endgrade) {
		this.endgrade = endgrade;
	}

	public String getEndgrade() {
		return endgrade;
	}
}
