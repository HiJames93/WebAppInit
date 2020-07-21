package cn.james.webapp_init.controller;

import cn.james.webapp_init.domain.TreeNode;
import cn.james.webapp_init.entity.SysUser;
import cn.james.webapp_init.service.ISysPermissionService;
import cn.james.webapp_init.service.ISysUserService;
import cn.james.webapp_init.util.ResultDto;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: SysController
 * @Desciption: 系统控制器
 * @author: James
 * @date: 2020-07-17 下午8:58
 * @version: 1.0
 */
@Controller
public class SysController {

    @Resource
    public ISysPermissionService ISysPermissionService;
    @Resource
    private ISysUserService userService;

    /**
     * @Title: toIndex
     * @Description: 显示首页
     * @param: []
     * @return: java.lang.String
     * @date: 2020/7/18 下午2:07
     * @throws
     **/
    @RequestMapping({"","/","index.do"})
    public String toIndex(){
        return "sys/index";
    }

    /**
     * @Title: showMain
     * @Description: 显示内嵌页
     * @param: []
     * @return: java.lang.String
     * @date: 2020/7/18 下午2:08
     * @throws
     **/
    @RequestMapping("showMain")
    public String showMain(){
        return "sys/main";
    }


    /**
     * @Title: showUserList
     * @Description: 显示用户管理页
     * @param: []
     * @return: java.lang.String
     * @date: 2020/7/18 下午2:27
     * @throws
     **/
    @RequestMapping("showUserList")
    public String showUserList(){
        return "sys/user/userList";
    }

    /**
     * 菜单树
     * @return
     */
    @ResponseBody
    @RequestMapping("/leftMenu.do")
    @ApiOperation("左侧菜单")
    public List<TreeNode> loadIndexLeftMenu() {
        List<TreeNode> treeNodes = ISysPermissionService.selectAll();
        return treeNodes;
    }

    @RequestMapping("login.html")
    public String showLogin(){
        return "login";
    }


    @ResponseBody
    @PostMapping(value = "/toLogin.do")
    @ApiOperation("登录")
    public ResultDto login(String telephone,
                           String passwd,
                           @RequestParam(value = "isRememberMe", defaultValue = "0") Integer isRememberMe,
                           HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(telephone, passwd);
        /*
        if(isRememberMe==1){
            token.setRememberMe(true);//如果设置参数为true，表示实现记住我的功能
        }*/
        try {
            subject.login(token);
            SysUser user = this.userService.findUserByTel(telephone);
            //获取Session对象
            Session session = subject.getSession();
            session.setAttribute("USER_SESSION", user);
            return ResultDto.LOGIN_SUCCESS;
        } catch (AuthenticationException e) {
            e.printStackTrace();
            request.setAttribute("error", "用户名或者密码有误");
            return ResultDto.LOGIN_ERROR_PWD;
        }
    }
}
