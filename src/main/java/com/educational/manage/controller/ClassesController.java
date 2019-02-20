package com.educational.manage.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.educational.manage.db.entity.ClassesEntity;
import com.educational.manage.db.service.ClassesService;
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
 * @date 20190220155804
 */
@Api("")
@RestController
public class ClassesController {

    @Autowired
    ClassesService classesService;

    /**
    * 新增接口
    * @param classesEntity
    * @return
    */
    @ApiOperation("新增接口")
    @PostMapping("/classes/add")
    public R add(@RequestBody @Validated(VG.Add.class) ClassesEntity classesEntity) {
        classesService.insert(classesEntity);
        return R.ok();
    }

    /**
     * 更新接口
     * @param classesEntity
     * @return
     */
    @ApiOperation("更新接口")
    @PostMapping("/classes/update")
    public R update(@RequestBody @Validated(VG.Update.class)ClassesEntity classesEntity) {
        classesService.updateById(classesEntity);
        return R.ok();
    }

    /**
     * 删除接口
     * @param classesEntity
     * @return
     */
    @ApiOperation("删除接口")
    @PostMapping("/classes/delete")
    public R delete(@RequestBody @Validated(VG.Delete.class)ClassesEntity classesEntity) {
        classesService.deleteById(classesEntity);
        return R.ok();
    }

    /**
     * 详情接口
     * @param classesEntity
     * @return
     */
    @ApiOperation("详情接口")
    @PostMapping("/classes/detail")
    public R detail(@RequestBody @Validated(VG.Get.class)ClassesEntity classesEntity) {
        return R.ok().data(classesService.selectById(classesEntity));
    }

    /**
     * 列表接口
     * @param classesEntity
     * @return
     */
    @ApiOperation("列表接口")
    @PostMapping("/classes/list")
    public R list(@RequestBody @Validated(VG.List.class)ClassesEntity classesEntity) {
        return R.ok().data(classesService.selectList(new EntityWrapper<ClassesEntity>()
                 .like(!StringUtils.isEmpty(classesEntity.getClassesid()),"Classesid", classesEntity.getClassesid())
                 .like(!StringUtils.isEmpty(classesEntity.getClassesname()),"Classesname", classesEntity.getClassesname())
                 .like(!StringUtils.isEmpty(classesEntity.getClassescontext()),"Classescontext", classesEntity.getClassescontext())
        ));
    }

}