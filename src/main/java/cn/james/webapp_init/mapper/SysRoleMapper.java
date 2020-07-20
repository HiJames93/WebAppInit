package cn.james.webapp_init.mapper;

import cn.james.webapp_init.entity.SysRole;

import java.util.List;
import java.util.Set;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> findAll(SysRole sysRole);

    Set<String> selectRoleNamesByUid(Integer id);
}