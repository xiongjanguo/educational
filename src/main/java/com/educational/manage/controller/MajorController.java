package com.educational.manage.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.educational.manage.db.entity.MajorEntity;
import com.educational.manage.db.service.MajorService;
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
 * @date 20190220155914
 */
@Api("")
@RestController
public class MajorController {

    @Autowired
    MajorService majorService;

    /**
    * 新增接口
    * @param majorEntity
    * @return
    */
    @ApiOperation("新增接口")
    @PostMapping("/major/add")
    public R add(@RequestBody @Validated(VG.Add.class) MajorEntity majorEntity) {
        majorService.insert(majorEntity);
        return R.ok();
    }

    /**
     * 更新接口
     * @param majorEntity
     * @return
     */
    @ApiOperation("更新接口")
    @PostMapping("/major/update")
    public R update(@RequestBody @Validated(VG.Update.class)MajorEntity majorEntity) {
        majorService.updateById(majorEntity);
        return R.ok();
    }

    /**
     * 删除接口
     * @param majorEntity
     * @return
     */
    @ApiOperation("删除接口")
    @PostMapping("/major/delete")
    public R delete(@RequestBody @Validated(VG.Delete.class)MajorEntity majorEntity) {
        majorService.deleteById(majorEntity);
        return R.ok();
    }

    /**
     * 详情接口
     * @param majorEntity
     * @return
     */
    @ApiOperation("详情接口")
    @PostMapping("/major/detail")
    public R detail(@RequestBody @Validated(VG.Get.class)MajorEntity majorEntity) {
        return R.ok().data(majorService.selectById(majorEntity));
    }

    /**
     * 列表接口
     * @param majorEntity
     * @return
     */
    @ApiOperation("列表接口")
    @PostMapping("/major/list")
    public R list(@RequestBody @Validated(VG.List.class)MajorEntity majorEntity) {
        return R.ok().data(majorService.selectList(new EntityWrapper<MajorEntity>()
                 .like(!StringUtils.isEmpty(majorEntity.getMdid()),"MDid", majorEntity.getMdid())
                 .like(!StringUtils.isEmpty(majorEntity.getMdname()),"Mdname", majorEntity.getMdname())
                 .like(!StringUtils.isEmpty(majorEntity.getMdcredit()),"Mdcredit", majorEntity.getMdcredit())
                 .like(!StringUtils.isEmpty(majorEntity.getMdstyle()),"Mdstyle", majorEntity.getMdstyle())
        ));
    }

}