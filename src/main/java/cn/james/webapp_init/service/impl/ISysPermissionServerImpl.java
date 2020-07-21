package cn.james.webapp_init.service.impl;

import cn.james.webapp_init.domain.TreeNode;
import cn.james.webapp_init.entity.SysPermission;
import cn.james.webapp_init.mapper.SysPermissionMapper;
import cn.james.webapp_init.service.ISysPermissionService;
import cn.james.webapp_init.util.TreeNodeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ISysPermissionServerImpl
 * @Desciption:
 * @author: James
 * @date: 2020-07-17 下午9:20
 * @version: 1.0
 */
@Service
public class ISysPermissionServerImpl implements ISysPermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public List<TreeNode> selectAll() {
        List<TreeNode> treeNodes=new ArrayList<>();
        List<SysPermission> permissionList=this.sysPermissionMapper.selectAll();
        for(SysPermission permission:permissionList){
            TreeNode treeNode=new TreeNode();
            treeNode.setId(permission.getId());
            treeNode.setPid(permission.getPid());
            treeNode.setTitle(permission.getName());
            treeNode.setIcon(permission.getIcon());
            treeNode.setHref(permission.getHref());
            treeNode.setSpread(permission.getOpen()==1?true:false);
            treeNodes.add(treeNode);
        }
        return TreeNodeBuilder.build(treeNodes,1);
    }
}
