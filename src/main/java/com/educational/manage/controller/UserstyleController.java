package com.educational.manage.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.educational.manage.db.entity.UserstyleEntity;
import com.educational.manage.db.service.UserstyleService;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import pub.codex.apix.annotations.*;
import pub.codex.common.models.R;
import pub.codex.apix.annotations.group.VG;

/**
 * 
 *
 * @date 20190220160029
 */
@Api("")
@RestController
public class UserstyleController {

    @Autowired
    UserstyleService userstyleService;

    /**
    * 新增接口
    * @param userstyleEntity
    * @return
    */
    @ApiOperation("新增接口")
    @PostMapping("/userstyle/add")
    public R add(@RequestBody @Validated(VG.Add.class) UserstyleEntity userstyleEntity) {
        userstyleService.insert(userstyleEntity);
        return R.ok();
    }

    /**
     * 更新接口
     * @param userstyleEntity
     * @return
     */
    @ApiOperation("更新接口")
    @PostMapping("/userstyle/update")
    public R update(@RequestBody @Validated(VG.Update.class)UserstyleEntity userstyleEntity) {
        userstyleService.updateById(userstyleEntity);
        return R.ok();
    }

    /**
     * 删除接口
     * @param userstyleEntity
     * @return
     */
    @ApiOperation("删除接口")
    @PostMapping("/userstyle/delete")
    public R delete(@RequestBody @Validated(VG.Delete.class)UserstyleEntity userstyleEntity) {
        userstyleService.deleteById(userstyleEntity);
        return R.ok();
    }

    /**
     * 详情接口
     * @param userstyleEntity
     * @return
     */
    @ApiOperation("详情接口")
    @PostMapping("/userstyle/detail")
    public R detail(@RequestBody @Validated(VG.Get.class)UserstyleEntity userstyleEntity) {
        return R.ok().data(userstyleService.selectById(userstyleEntity));
    }

    /**
     * 列表接口
     * @param userstyleEntity
     * @return
     */
    @ApiOperation("列表接口")
    @PostMapping("/userstyle/list")
    public R list(@RequestBody @Validated(VG.List.class)UserstyleEntity userstyleEntity) {
        return R.ok().data(userstyleService.selectList(new EntityWrapper<UserstyleEntity>()
                 .like(!StringUtils.isEmpty(userstyleEntity.getUserstyleid()),"Userstyleid", userstyleEntity.getUserstyleid())
                 .like(!StringUtils.isEmpty(userstyleEntity.getUserstylename()),"Userstylename", userstyleEntity.getUserstylename())
                 .like(!StringUtils.isEmpty(userstyleEntity.getPermission()),"Permission", userstyleEntity.getPermission())
        ));
    }

}