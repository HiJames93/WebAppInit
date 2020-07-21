package cn.james.webapp_init.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 定义返回结果的格式的Bean
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDto {
    public static final ResultDto LOGIN_SUCCESS = new ResultDto(200, "登录成功");
    public static final ResultDto LOGIN_ERROR_PWD = new ResultDto(1001, "用户名或密码不正确");
    public static final ResultDto UPLOAD_IMAGE_ERROR = new ResultDto(1003, "上传图片失败");
    public static final ResultDto ADD_USER_SUCCESS = new ResultDto(1004, "添加用户成功");
    public static final ResultDto ADD_USER_FAILURE = new ResultDto(-1004, "修改用户失败");
    public static final ResultDto UPDATE_USER_SUCCESS = new ResultDto(1009, "修改用户成功");
    public static final ResultDto UPDATE_USER_FAILURE = new ResultDto(-1009, "添加用户失败");

    public static final ResultDto UPLOAD_FILE_FAILURE = new ResultDto(-1003, "上传失败");
    public static final ResultDto LOGIN_FAILURE = new ResultDto(-1001, "登录失败");
    public static final ResultDto DELETE_USER_SUCCESS = new ResultDto(1002, "删除用户成功");
    public static final ResultDto DELETE_USER_FAILURE = new ResultDto(-1002, "删除用户失败");
    public static final ResultDto USER_EXITS = new ResultDto(-1004, "用户已存在");
    public static final ResultDto USER_ADD_SUCCESS = new ResultDto(2001, "成功增加用户");
    public static final ResultDto USER_ADD_FAILURE = new ResultDto(-2001, "增加用户失败");


    public static final ResultDto ROLE_ADD_SUCCESS = new ResultDto(2004, "添加角色成功");
    public static final ResultDto ROLE_ADD_FAILURE = new ResultDto(-2004, "添加角色失败");
    public static final ResultDto ROLE_DEL_SUCCESS = new ResultDto(2004, "删除角色成功");
    public static final ResultDto ROLE_DEL_FAILURE = new ResultDto(-2004, "删除角色失败");
    public static final ResultDto ROLE_GRANT_SUCCESS = new ResultDto(2002, "分配角色成功");
    public static final ResultDto ROLE_GRANT_FAILURE = new ResultDto(-2002, "分配角色失败");
    public static final ResultDto RIGHT_GRANT_SUCCESS = new ResultDto(2003, "分配权限成功");
    public static final ResultDto RIGHT_GRANT_FAILURE = new ResultDto(-2003, "分配权限失败");

    public static final ResultDto DEP_ADD_SUCCESS = new ResultDto(3001, "添加部门成功");
    public static final ResultDto DEP_ADD_FAILURE = new ResultDto(-3001, "添加部门失败");
    public static final ResultDto DEP_DEL_SUCCESS = new ResultDto(-1009, "删除部门成功");
    public static final ResultDto DEP_DEL_FAILURE = new ResultDto(-1009, "删除部门失败");
    public static final ResultDto DEP_UPDATE_SUCCESS = new ResultDto(3002, "更新部门成功");
    public static final ResultDto DEP_UPDATE_FAILURE = new ResultDto(-3002, "更新部门失败");
    public static final ResultDto DEP_REMOVE_SUCCESS = new ResultDto(3003, "移除部门成功");
    public static final ResultDto DEP_REMOVE_FAILURE = new ResultDto(-3003, "移除部门失败");



    private int code;
    private String msg;
    private Object data;

    public ResultDto(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
