package com.educational.manage.db.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import pub.codex.apix.annotations.ApiModelProperty;
import pub.codex.apix.annotations.group.VG;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * 
 * 
 * @date 20190220140418
 */
@TableName("classroom")
public class ClassroomEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 教室编号
	 */
	@TableId
	@NotBlank(groups = {VG.Add.class,VG.Delete.class,VG.Get.class})
	@NotEmpty(groups = {VG.Update.class})
	@ApiModelProperty("教室编号")
	private String roomid;
	/**
	 * 教室名称
	 */
	@ApiModelProperty("教室名称")
	private String roomname;
	/**
	 * 面积
	 */
	@ApiModelProperty("面积")
	private String area;
	/**
	 * 最大人数
	 */
	@ApiModelProperty("最大人数")
	private String maxnum;

	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}

	public String getRoomid() {
		return roomid;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setMaxnum(String maxnum) {
		this.maxnum = maxnum;
	}

	public String getMaxnum() {
		return maxnum;
	}
}
