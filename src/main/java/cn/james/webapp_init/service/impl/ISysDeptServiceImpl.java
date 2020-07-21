package cn.james.webapp_init.service.impl;

import cn.james.webapp_init.entity.SysDept;
import cn.james.webapp_init.mapper.SysDeptMapper;
import cn.james.webapp_init.service.ISysDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @ClassName: ISysDeptServiceImpl
 * @Desciption:
 * @author: James
 * @date: 2020-07-20 下午8:06
 * @version: 1.0
 */
@Service
public class ISysDeptServiceImpl implements ISysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public void save(SysDept obj) {
        sysDeptMapper.insertSelective(obj);
    }

    @Override
    public void update(SysDept obj) {
        sysDeptMapper.updateByPrimaryKeySelective(obj);
    }

    @Override
    public void delete(Integer id) {
        sysDeptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysDept getOne(Integer id) {
        return sysDeptMapper.selectByPrimaryKey(id);
    }
}
