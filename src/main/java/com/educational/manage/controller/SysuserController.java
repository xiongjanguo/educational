package com.educational.manage.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.educational.manage.db.entity.SysuserEntity;
import com.educational.manage.db.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @date 20190220160007
 */
@Api("")
@RestController
public class SysuserController {

    @Autowired
    SysuserService sysuserService;

    /**
    * 新增接口
    * @param sysuserEntity
    * @return
    */
    @ApiOperation("新增接口")
    @PostMapping("/sysuser/add")
    public R add(@RequestBody @Validated(VG.Add.class) SysuserEntity sysuserEntity) {
        sysuserService.insert(sysuserEntity);
        return R.ok();
    }

    /**
     * 更新接口
     * @param sysuserEntity
     * @return
     */
    @ApiOperation("更新接口")
    @PostMapping("/sysuser/update")
    public R update(@RequestBody @Validated(VG.Update.class)SysuserEntity sysuserEntity) {
        sysuserService.updateById(sysuserEntity);
        return R.ok();
    }

    /**
     * 删除接口
     * @param sysuserEntity
     * @return
     */
    @ApiOperation("删除接口")
    @PostMapping("/sysuser/delete")
    public R delete(@RequestBody @Validated(VG.Delete.class)SysuserEntity sysuserEntity) {
        sysuserService.deleteById(sysuserEntity);
        return R.ok();
    }

    /**
     * 详情接口
     * @param sysuserEntity
     * @return
     */
    @ApiOperation("详情接口")
    @PostMapping("/sysuser/detail")
    public R detail(@RequestBody @Validated(VG.Get.class)SysuserEntity sysuserEntity) {
        return R.ok().data(sysuserService.selectById(sysuserEntity));
    }

    /**
     * 列表接口
     * @param sysuserEntity
     * @return
     */
    @ApiOperation("列表接口")
    @PostMapping("/sysuser/list")
    public R list(@RequestBody @Validated(VG.List.class)SysuserEntity sysuserEntity) {
        return R.ok().data(sysuserService.selectList(new EntityWrapper<SysuserEntity>()
                 .like(!StringUtils.isEmpty(sysuserEntity.getId()),"Id", sysuserEntity.getId())
                 .like(!StringUtils.isEmpty(sysuserEntity.getClassesid()),"classesid", sysuserEntity.getClassesid())
                 .like(!StringUtils.isEmpty(sysuserEntity.getUserstyleid()),"Userstyleid", sysuserEntity.getUserstyleid())
                 .like(!StringUtils.isEmpty(sysuserEntity.getUsername()),"Username", sysuserEntity.getUsername())
                 .like(!StringUtils.isEmpty(sysuserEntity.getPassword()),"Password", sysuserEntity.getPassword())
                 .like(!StringUtils.isEmpty(sysuserEntity.getSex()),"Sex", sysuserEntity.getSex())
                 .like(!StringUtils.isEmpty(sysuserEntity.getAddress()),"Address", sysuserEntity.getAddress())
                 .like(!StringUtils.isEmpty(sysuserEntity.getPhone()),"Phone", sysuserEntity.getPhone())
        ));
    }

}