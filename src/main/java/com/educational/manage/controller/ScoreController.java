package com.educational.manage.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.educational.manage.db.entity.ScoreEntity;
import com.educational.manage.db.service.ScoreService;
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
 * @date 20190220155935
 */
@Api("")
@RestController
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    /**
    * 新增接口
    * @param scoreEntity
    * @return
    */
    @ApiOperation("新增接口")
    @PostMapping("/score/add")
    public R add(@RequestBody @Validated(VG.Add.class) ScoreEntity scoreEntity) {
        scoreService.insert(scoreEntity);
        return R.ok();
    }

    /**
     * 更新接口
     * @param scoreEntity
     * @return
     */
    @ApiOperation("更新接口")
    @PostMapping("/score/update")
    public R update(@RequestBody @Validated(VG.Update.class)ScoreEntity scoreEntity) {
        scoreService.updateById(scoreEntity);
        return R.ok();
    }

    /**
     * 删除接口
     * @param scoreEntity
     * @return
     */
    @ApiOperation("删除接口")
    @PostMapping("/score/delete")
    public R delete(@RequestBody @Validated(VG.Delete.class)ScoreEntity scoreEntity) {
        scoreService.deleteById(scoreEntity);
        return R.ok();
    }

    /**
     * 详情接口
     * @param scoreEntity
     * @return
     */
    @ApiOperation("详情接口")
    @PostMapping("/score/detail")
    public R detail(@RequestBody @Validated(VG.Get.class)ScoreEntity scoreEntity) {
        return R.ok().data(scoreService.selectById(scoreEntity));
    }

    /**
     * 列表接口
     * @param scoreEntity
     * @return
     */
    @ApiOperation("列表接口")
    @PostMapping("/score/list")
    public R list(@RequestBody @Validated(VG.List.class)ScoreEntity scoreEntity) {
        return R.ok().data(scoreService.selectList(new EntityWrapper<ScoreEntity>()
                 .like(!StringUtils.isEmpty(scoreEntity.getScid()),"Scid", scoreEntity.getScid())
                 .like(!StringUtils.isEmpty(scoreEntity.getId()),"id", scoreEntity.getId())
                 .like(!StringUtils.isEmpty(scoreEntity.getMuid()),"Muid", scoreEntity.getMuid())
                 .like(!StringUtils.isEmpty(scoreEntity.getEndgrade()),"Endgrade", scoreEntity.getEndgrade())
        ));
    }

}