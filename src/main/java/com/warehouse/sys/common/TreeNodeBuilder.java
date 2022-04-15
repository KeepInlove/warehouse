package com.warehouse.sys.common;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Guo
 * @creed: 少壮不努力, 以后卡卡西
 * @Date 2022/4/16 0:13
 */
public class TreeNodeBuilder {
    public static List<TreeNode> build(List<TreeNode> treeNodes, Integer topPid) {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        for (TreeNode n1 : treeNodes) {
            if (n1.getPid()==topPid){
                nodes.add(n1);
            }
            for (TreeNode n2 : treeNodes) {
                if (n1.getId()==n2.getPid()){
                    n1.getChildren().add(n2);
                }
            }
        }
        return nodes;
    }
}
