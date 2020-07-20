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
    public static final ResultDto ADD_USER_FAILURE = new ResultDto(-1004, "添加用户失败");
    public static ResultDto UPLOAD_FILE_FAILURE = new ResultDto(-1003, "上传失败");
    public static ResultDto LOGIN_FAILURE = new ResultDto(-1001, "登录失败");
    public static ResultDto DELETE_USER_SUCCESS = new ResultDto(1002, "删除用户成功");
    public static ResultDto DELETE_USER_FAILURE = new ResultDto(-1002, "删除用户失败");
    public static ResultDto USER_EXITS = new ResultDto(-1004, "用户已存在");
    public static ResultDto USER_ADD_SUCCESS = new ResultDto(2001, "成功增加用户");
    public static ResultDto USER_ADD_FAILURE = new ResultDto(-2001, "增加用户失败");
    public static ResultDto ROLE_GRANT_SUCCESS = new ResultDto(2002, "分配角色成功");
    public static ResultDto ROLE_GRANT_FAILURE = new ResultDto(-2002, "分配角色失败");
    public static ResultDto RIGHT_GRANT_SUCCESS = new ResultDto(2003, "分配权限成功");
    public static ResultDto RIGHT_GRANT_FAILURE = new ResultDto(-2003, "分配权限失败");
    public static final ResultDto UPDATE_CUSTOMER_SUCCESS = new ResultDto(3001, "修改客户信息成功");
    public static final ResultDto UPDATE_CUSTOMER_FAILURE = new ResultDto(-3001, "修改客户信息失败");
    public static final ResultDto UPDATE_CUST_LINKMAN_SUCCESS = new ResultDto(3002, "修改联系人信息成功");
    public static final ResultDto UPDATE_CUST_LINKMAN_FAILURE = new ResultDto(-3002, "修改联系人信息失败");
    public static final ResultDto UPDATE_COMM_SUCCESS = new ResultDto(3003, "修改客户交往记录成功");
    public static final ResultDto UPDATE_COMM_FAILURE = new ResultDto(-3003, "修改客户交往记录失败");
    public static final ResultDto UPDATE_LOST_SAVE_SUCCESS = new ResultDto(3004, "暂缓流失成功");
    public static final ResultDto UPDATE_LOST_SAVE_FAILURE = new ResultDto(-3004, "暂缓流失失败");
    public static final ResultDto UPDATE_LOST_SUCCESS = new ResultDto(3005, "确认流失成功");
    public static final ResultDto UPDATE_LOST_FAILURE = new ResultDto(-3005, "确认流失失败");
    private int code;
    private String msg;
    private Object data;

    public ResultDto(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
