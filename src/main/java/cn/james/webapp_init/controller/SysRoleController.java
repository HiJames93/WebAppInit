package cn.james.webapp_init.controller;

import cn.james.webapp_init.common.MyLog;
import cn.james.webapp_init.common.OptEnum;
import cn.james.webapp_init.entity.SysRole;
import cn.james.webapp_init.service.ISysRoleService;
import cn.james.webapp_init.util.ResultDto;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: SysRoleController
 * @Desciption:
 * @author: James
 * @date: 2020-07-20 下午7:18
 * @version: 1.0
 */
@RestController
@RequestMapping("role")
public class SysRoleController {

    private Logger logger = LoggerFactory.getLogger("SysRoleController");

    @Resource
    private ISysRoleService sysRoleService;

    /**
     * @Title: updateRole
     * @Description: 更新角色
     * @param: [role]
     * @return: cn.james.webapp_init.util.ResultDto
     * @date: 2020/7/20 下午7:36
     * @throws
     **/
    @ApiOperation("分配角色")
    @RequestMapping("updateRole")
    @MyLog(menuName = "分配角色", optType = OptEnum.UPDATE)
    public ResultDto updateRole(SysRole role){
        try {
            sysRoleService.update(role);
            return ResultDto.ROLE_GRANT_SUCCESS;
        }catch (Exception e){
            logger.info("角色分配失败！",e);
            e.printStackTrace();
            return ResultDto.ROLE_GRANT_FAILURE;
        }
    }

    /**
     * @Title: addRole
     * @Description: 添加角色
     * @param: [role]
     * @return: cn.james.webapp_init.util.ResultDto
     * @date: 2020/7/20 下午7:37
     * @throws
     **/
    @ApiOperation("添加角色")
    @RequestMapping("addRole")
    @MyLog(menuName = "添加角色", optType = OptEnum.SAVE)
    public ResultDto addRole(SysRole role){
        try {
            sysRoleService.save(role);
            return ResultDto.ROLE_ADD_SUCCESS;
        }catch (Exception e){
            logger.info("角色添加失败！",e);
            e.printStackTrace();
            return ResultDto.ROLE_ADD_FAILURE;
        }
    }

    /**
     * @Title: delRole
     * @Description: 删除角色
     * @param: [role]
     * @return: cn.james.webapp_init.util.ResultDto
     * @date: 2020/7/20 下午7:37
     * @throws
     **/
    @ApiOperation("删除角色")
    @RequestMapping("delRole")
    @MyLog(menuName = "删除角色", optType = OptEnum.DELETE)
    public ResultDto delRole(SysRole role){
        try {
            sysRoleService.save(role);
            return ResultDto.ROLE_DEL_SUCCESS;
        }catch (Exception e){
            logger.info("角色删除失败！",e);
            e.printStackTrace();
            return ResultDto.ROLE_DEL_FAILURE;
        }
    }
}
