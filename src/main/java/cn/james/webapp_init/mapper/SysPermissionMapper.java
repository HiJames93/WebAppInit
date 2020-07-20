package cn.james.webapp_init.mapper;

import cn.james.webapp_init.entity.SysPermission;

import java.util.List;
import java.util.Set;

public interface SysPermissionMapper {

    List<SysPermission> selectAll();

    Set<String> selectPercodesByUid(Integer id);
}