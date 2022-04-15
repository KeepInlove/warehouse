package com.warehouse.bus.service;

import com.warehouse.bus.entity.Provider;
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
public interface IProviderService extends IService<Provider> {

    /**
     * 根据供应商ID删除供应商
     * @param id
     */
    void deleteProviderById(Integer id);
}
