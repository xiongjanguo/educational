package com.educational.manage.db.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.educational.manage.db.entity.MajorEntity;
import com.educational.manage.db.mapper.MajorMapper;
import com.educational.manage.db.service.MajorService;
import org.springframework.stereotype.Service;


@Service("majorService")
public class MajorServiceImpl extends ServiceImpl<MajorMapper, MajorEntity> implements MajorService {


}
