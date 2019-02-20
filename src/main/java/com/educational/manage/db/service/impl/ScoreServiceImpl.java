package com.educational.manage.db.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.educational.manage.db.entity.ScoreEntity;
import com.educational.manage.db.mapper.ScoreMapper;
import com.educational.manage.db.service.ScoreService;
import org.springframework.stereotype.Service;


@Service("scoreService")
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, ScoreEntity> implements ScoreService {


}
