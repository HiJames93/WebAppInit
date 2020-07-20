package cn.james.webapp_init.service;

import cn.james.webapp_init.common.BaseService;
import cn.james.webapp_init.entity.SysUser;

import java.util.Set;

/**
 * @ClassName: ISysUserService
 * @Desciption:
 * @author: James
 * @date: 2020-07-18 下午1:04
 * @version: 1.0
 */
public interface ISysUserService extends BaseService<SysUser, Integer> {
    SysUser findUserByTel(String telephone);

    Set<String> selectRoleNamesByUid(Integer id);

    Set<String> selectPercodesByUid(Integer id);
}
