package com.educational.manage.db.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.educational.manage.db.entity.UserstyleEntity;
import com.educational.manage.db.mapper.UserstyleMapper;
import com.educational.manage.db.service.UserstyleService;
import org.springframework.stereotype.Service;



@Service("userstyleService")
public class UserstyleServiceImpl extends ServiceImpl<UserstyleMapper, UserstyleEntity> implements UserstyleService {


}
