package com.educational.manage.db.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.educational.manage.db.entity.SysuserEntity;
import com.educational.manage.db.mapper.SysuserMapper;
import com.educational.manage.db.service.SysuserService;
import org.springframework.stereotype.Service;


@Service("sysuserService")
public class SysuserServiceImpl extends ServiceImpl<SysuserMapper, SysuserEntity> implements SysuserService {


}
