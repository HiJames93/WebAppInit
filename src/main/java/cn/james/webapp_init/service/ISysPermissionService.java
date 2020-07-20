package cn.james.webapp_init.service;

import cn.james.webapp_init.domain.TreeNode;

import java.util.List;

/**
 * @ClassName: ISysPermissionService
 * @Desciption:
 * @author: James
 * @date: 2020-07-17 下午8:54
 * @version: 1.0
 */
public interface ISysPermissionService {
    List<TreeNode> selectAll();
}
