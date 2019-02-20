package com.educational.manage.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.educational.manage.db.entity.ClassroomEntity;
import com.educational.manage.db.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pub.codex.apix.annotations.Api;
import pub.codex.apix.annotations.ApiOperation;
import pub.codex.apix.annotations.group.VG;
import pub.codex.common.models.R;

/**
 * 
 *
 * @date 20190220140418
 */
@Api("")
@RestController
public class ClassroomController {

    @Autowired
    ClassroomService classroomService;

    /**
    * 新增接口
    * @param classroomEntity
    * @return
    */
    @ApiOperation("新增接口")
    @PostMapping("/classroom/add")
    public R add(@RequestBody @Validated(VG.Add.class) ClassroomEntity classroomEntity) {
        classroomService.insert(classroomEntity);
        return R.ok();
    }

    /**
     * 更新接口
     * @param classroomEntity
     * @return
     */
    @ApiOperation("更新接口")
    @PostMapping("/classroom/update")
    public R update(@RequestBody @Validated(VG.Update.class) ClassroomEntity classroomEntity) {
        classroomService.updateById(classroomEntity);
        return R.ok();
    }

    /**
     * 删除接口
     * @param classroomEntity
     * @return
     */
    @ApiOperation("删除接口")
    @PostMapping("/classroom/delete")
    public R delete(@RequestBody @Validated(VG.Delete.class) ClassroomEntity classroomEntity) {
        classroomService.deleteById(classroomEntity);
        return R.ok();
    }

    /**
     * 详情接口
     * @param classroomEntity
     * @return
     */
    @ApiOperation("详情接口")
    @PostMapping("/classroom/detail")
    public R detail(@RequestBody @Validated(VG.Get.class) ClassroomEntity classroomEntity) {
        return R.ok().data(classroomService.selectById(classroomEntity));
    }

    /**
     * 列表接口
     * @param classroomEntity
     * @return
     */
    @ApiOperation("列表接口")
    @PostMapping("/classroom/list")
    public R list(@RequestBody @Validated(VG.List.class) ClassroomEntity classroomEntity) {
        return R.ok().data(classroomService.selectList(new EntityWrapper<ClassroomEntity>()
                 .like(!StringUtils.isEmpty(classroomEntity.getRoomid()),"Roomid", classroomEntity.getRoomid())
                 .like(!StringUtils.isEmpty(classroomEntity.getRoomname()),"Roomname", classroomEntity.getRoomname())
                 .like(!StringUtils.isEmpty(classroomEntity.getArea()),"Area", classroomEntity.getArea())
                 .like(!StringUtils.isEmpty(classroomEntity.getMaxnum()),"Maxnum", classroomEntity.getMaxnum())
        ));
    }

}