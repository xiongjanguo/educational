package com.educational.manage.db.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.educational.manage.db.entity.MdteacherEntity;
import com.educational.manage.db.mapper.MdteacherMapper;
import com.educational.manage.db.service.MdteacherService;
import org.springframework.stereotype.Service;


@Service("mdteacherService")
public class MdteacherServiceImpl extends ServiceImpl<MdteacherMapper, MdteacherEntity> implements MdteacherService {


}
