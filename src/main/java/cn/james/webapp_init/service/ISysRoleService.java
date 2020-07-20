package cn.james.webapp_init.service;

import cn.james.webapp_init.common.BaseService;
import cn.james.webapp_init.entity.SysRole;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: SysRoleService
 * @Desciption:
 * @author: James
 * @date: 2020-07-18 下午12:23
 * @version: 1.0
 */
public interface ISysRoleService extends BaseService<SysRole, Integer> {
    List<SysRole> getAll(SysRole sysRole);
}
