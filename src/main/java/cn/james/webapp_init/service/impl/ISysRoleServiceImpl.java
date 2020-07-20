package cn.james.webapp_init.service.impl;

import cn.james.webapp_init.entity.SysRole;
import cn.james.webapp_init.mapper.SysRoleMapper;
import cn.james.webapp_init.service.ISysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: ISysRoleServiceImpl
 * @Desciption:
 * @author: James
 * @date: 2020-07-18 下午12:32
 * @version: 1.0
 */
@Service
public class ISysRoleServiceImpl implements ISysRoleService {

    @Resource
    SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> getAll(SysRole sysRole) {
        return sysRoleMapper.findAll(sysRole);
    }

    @Override
    public void save(SysRole obj) {
        sysRoleMapper.insertSelective(obj);
    }

    @Override
    public void update(SysRole obj) {
        sysRoleMapper.updateByPrimaryKeySelective(obj);
    }

    @Override
    public void delete(Integer id) {
        sysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysRole getOne(Integer id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }
}
