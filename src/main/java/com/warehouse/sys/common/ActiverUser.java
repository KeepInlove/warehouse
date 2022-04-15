package com.warehouse.sys.common;

import com.warehouse.sys.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Guo
 * @creed: 少壮不努力, 以后卡卡西
 * @Date 2022/4/16 0:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiverUser {

    private User user;

    private List<String> roles;

    private List<String> permission;

}
