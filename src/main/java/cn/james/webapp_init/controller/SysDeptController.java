package cn.james.webapp_init.controller;

import cn.james.webapp_init.common.MyLog;
import cn.james.webapp_init.common.OptEnum;
import cn.james.webapp_init.entity.SysDept;
import cn.james.webapp_init.entity.SysRole;
import cn.james.webapp_init.service.ISysDeptService;
import cn.james.webapp_init.util.ResultDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: SysDeptController
 * @Desciption:
 * @author: James
 * @date: 2020-07-20 下午7:38
 * @version: 1.0
 */

@RestController
@RequestMapping("dept")
public class SysDeptController {

    private Logger logger = LoggerFactory.getLogger("SysRoleController");

    @Resource
    private ISysDeptService deptService;

    @ApiOperation("添加部门")
    @RequestMapping("addDept")
    @MyLog(menuName = "添加部门", optType = OptEnum.UPDATE)
    public ResultDto addDept(SysDept dept){
        try {
            deptService.save(dept);
            return ResultDto.DEP_ADD_SUCCESS;
        }catch (Exception e){
            logger.info("部门添加失败！",e);
            e.printStackTrace();
            return ResultDto.DEP_ADD_FAILURE;
        }
    }

    @ApiOperation("更新部门")
    @RequestMapping("updateDept")
    @MyLog(menuName = "更新部门", optType = OptEnum.UPDATE)
    public ResultDto updateDept(SysDept dept){
        try {
            deptService.update(dept);
            return ResultDto.DEP_UPDATE_SUCCESS;
        }catch (Exception e){
            logger.info("部门更新失败！",e);
            e.printStackTrace();
            return ResultDto.DEP_UPDATE_FAILURE;
        }
    }

    @ApiOperation("删除部门")
    @RequestMapping("delDept")
    @MyLog(menuName = "删除部门", optType = OptEnum.UPDATE)
    public ResultDto delDept(Integer id){
        try {
            deptService.delete(id);
            return ResultDto.DEP_DEL_SUCCESS;
        }catch (Exception e){
            logger.info("部门删除失败！",e);
            e.printStackTrace();
            return ResultDto.DEP_DEL_FAILURE;
        }
    }
}
