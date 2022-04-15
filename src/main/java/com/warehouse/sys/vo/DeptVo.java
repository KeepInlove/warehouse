package com.warehouse.sys.vo;

import com.warehouse.sys.entity.Dept;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Guo
 * @creed: 少壮不努力, 以后卡卡西
 * @Date 2022/4/16 0:13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DeptVo extends Dept {

    private Integer page=1;
    private Integer limit=10;

}
