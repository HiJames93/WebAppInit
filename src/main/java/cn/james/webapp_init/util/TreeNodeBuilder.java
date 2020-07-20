package cn.james.webapp_init.util;



import cn.james.webapp_init.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeBuilder {
    public static List<TreeNode> build(List<TreeNode> treeNodes, int topId) {
        List<TreeNode> treeNodesList = new ArrayList<>();
        for (TreeNode n1 : treeNodes) {
            if (n1.getPid() == topId) {
                treeNodesList.add(n1);
            }
            for (TreeNode n2 : treeNodes) {
                if (n1.getId() == n2.getPid()) {
                    n1.getChildren().add(n2);
                }
            }
        }
        return treeNodesList;
    }
}
