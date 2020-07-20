package cn.james.webapp_init.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_user_role
 * @author 
 */
@Data
public class SysUserRole implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}