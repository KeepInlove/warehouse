package com.warehouse.sys.service;

import com.warehouse.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * InnoDB free: 9216 kB; (`deptid`) REFER `warehouse/sys_dept`(`id`) ON UPDATE CASC 服务类
 * </p>
 *
 * @author Guo
 * @creed: 少壮不努力, 以后卡卡西
 * @Date 2022/4/16 0:13
 */
public interface IUserService extends IService<User> {

    /**
     * 保存用户和角色的关系
     * @param uid 用户的ID
     * @param ids 用户拥有的角色的ID的数组
     */
    void saveUserRole(Integer uid, Integer[] ids);

    /**
     * 查询当前用户是否是其他用户的直属领导
     * @param userId
     * @return
     */
    Boolean queryMgrByUserId(Integer userId);
}
