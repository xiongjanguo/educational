package com.educational.manage.db.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.educational.manage.db.entity.ClassesEntity;
import com.educational.manage.db.mapper.ClassesMapper;
import com.educational.manage.db.service.ClassesService;
import org.springframework.stereotype.Service;


@Service("classesService")
public class ClassesServiceImpl extends ServiceImpl<ClassesMapper, ClassesEntity> implements ClassesService {


}
