package com.warehouse.bus.service.impl;

import com.warehouse.bus.entity.Goods;
import com.warehouse.bus.mapper.GoodsMapper;
import com.warehouse.bus.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * InnoDB free: 9216 kB; (`providerid`) REFER `warehouse/bus_provider`(`id`) 服务实现类
 * </p>
 *
 * @author Guo
 * @creed: 少壮不努力, 以后卡卡西
 * @Date 2022/4/16 0:13
 */
@Service
@Transactional
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Override
    public boolean save(Goods entity) {
        return super.save(entity);
    }

    @Override
    public boolean updateById(Goods entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public Goods getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public void deleteGoodsById(Integer id) {
        //根据商品id删除商品销售信息
        this.getBaseMapper().deleteSaleByGoodsId(id);
        //根据商品id删除商品销售退货信息
        this.getBaseMapper().deleteSaleBackByGoodsId(id);
        //根据商品id删除商品进货信息
        this.getBaseMapper().deleteInportByGoodsId(id);
        //根据商品id删除商品退货信息
        this.getBaseMapper().deleteOutportByGoodsId(id);
        //删除商品信息
        this.removeById(id);
    }

    /**
     * 查询所有库存预警商品
     * @return
     */
    @Override
    public List<Goods> loadAllWarning() {
        List<Goods> goods = baseMapper.loadAllWarning();
        return goods;
    }
}
