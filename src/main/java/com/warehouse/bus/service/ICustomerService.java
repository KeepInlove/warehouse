package com.warehouse.bus.service;

import com.warehouse.bus.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * InnoDB free: 9216 kB 服务类
 * </p>
 *
 * @author Guo
 * @creed: 少壮不努力, 以后卡卡西
 * @Date 2022/4/16 0:13
 */
public interface ICustomerService extends IService<Customer> {

    /**
     * 根据客户id删除客户
     * @param id    客户id
     */
    void deleteCustomerById(Integer id);
}
