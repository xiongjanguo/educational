package com.educational.manage.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.educational.manage.db.entity.MdteacherEntity;
import com.educational.manage.db.service.MdteacherService;
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
 * @date 20190220155834
 */
@Api("")
@RestController
public class MdteacherController {

    @Autowired
    MdteacherService mdteacherService;

    /**
    * 新增接口
    * @param mdteacherEntity
    * @return
    */
    @ApiOperation("新增接口")
    @PostMapping("/mdteacher/add")
    public R add(@RequestBody @Validated(VG.Add.class) MdteacherEntity mdteacherEntity) {
        mdteacherService.insert(mdteacherEntity);
        return R.ok();
    }

    /**
     * 更新接口
     * @param mdteacherEntity
     * @return
     */
    @ApiOperation("更新接口")
    @PostMapping("/mdteacher/update")
    public R update(@RequestBody @Validated(VG.Update.class)MdteacherEntity mdteacherEntity) {
        mdteacherService.updateById(mdteacherEntity);
        return R.ok();
    }

    /**
     * 删除接口
     * @param mdteacherEntity
     * @return
     */
    @ApiOperation("删除接口")
    @PostMapping("/mdteacher/delete")
    public R delete(@RequestBody @Validated(VG.Delete.class)MdteacherEntity mdteacherEntity) {
        mdteacherService.deleteById(mdteacherEntity);
        return R.ok();
    }

    /**
     * 详情接口
     * @param mdteacherEntity
     * @return
     */
    @ApiOperation("详情接口")
    @PostMapping("/mdteacher/detail")
    public R detail(@RequestBody @Validated(VG.Get.class)MdteacherEntity mdteacherEntity) {
        return R.ok().data(mdteacherService.selectById(mdteacherEntity));
    }

    /**
     * 列表接口
     * @param mdteacherEntity
     * @return
     */
    @ApiOperation("列表接口")
    @PostMapping("/mdteacher/list")
    public R list(@RequestBody @Validated(VG.List.class)MdteacherEntity mdteacherEntity) {
        return R.ok().data(mdteacherService.selectList(new EntityWrapper<MdteacherEntity>()
                 .like(!StringUtils.isEmpty(mdteacherEntity.getMuid()),"Muid", mdteacherEntity.getMuid())
                 .like(!StringUtils.isEmpty(mdteacherEntity.getId()),"Id", mdteacherEntity.getId())
                 .like(!StringUtils.isEmpty(mdteacherEntity.getMdid()),"Mdid", mdteacherEntity.getMdid())
        ));
    }

}