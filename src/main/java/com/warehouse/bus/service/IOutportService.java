package com.warehouse.bus.service;

import com.warehouse.bus.entity.Outport;
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
public interface IOutportService extends IService<Outport> {

    /**
     * 对商品进货进行退货处理
     * @param id    进货单ID
     * @param number    退货数量
     * @param remark    备注
     */
    void addOutport(Integer id, Integer number, String remark);
}
