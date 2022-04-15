package com.warehouse.sys.service.impl;

import com.warehouse.sys.entity.Loginfo;
import com.warehouse.sys.mapper.LoginfoMapper;
import com.warehouse.sys.service.ILoginfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * InnoDB free: 9216 kB 服务实现类
 * </p>
 *
 * @author Guo
 * @creed: 少壮不努力, 以后卡卡西
 * @Date 2022/4/16 0:13
 */
@Service
@Transactional
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements ILoginfoService {

}
