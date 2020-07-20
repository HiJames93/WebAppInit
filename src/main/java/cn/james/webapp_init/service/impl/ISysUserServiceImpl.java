package cn.james.webapp_init.service.impl;

import cn.james.webapp_init.entity.SysUser;
import cn.james.webapp_init.mapper.SysPermissionMapper;
import cn.james.webapp_init.mapper.SysRoleMapper;
import cn.james.webapp_init.mapper.SysUserMapper;
import cn.james.webapp_init.service.ISysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @ClassName: ISysUserServiceImpl
 * @Desciption:
 * @author: James
 * @date: 2020-07-18 下午1:10
 * @version: 1.0
 */
@Service
public class ISysUserServiceImpl implements ISysUserService {

    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public SysUser findUserByTel(String telephone) {
        return this.sysUserMapper.selectUserByTel(telephone);
    }

    @Override
    public Set<String> selectRoleNamesByUid(Integer id) {
        return sysRoleMapper.selectRoleNamesByUid(id);
    }

    @Override
    public Set<String> selectPercodesByUid(Integer id) {
        return sysPermissionMapper.selectPercodesByUid(id);
    }

    @Override
    public void save(SysUser obj) {
        sysUserMapper.insertSelective(obj);
    }

    @Override
    public void update(SysUser obj) {
        sysUserMapper.updateByPrimaryKeySelective(obj);
    }

    @Override
    public void delete(Integer id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysUser getOne(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
