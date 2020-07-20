package cn.james.webapp_init.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_role_permission
 * @author 
 */
@Data
public class SysRolePermission implements Serializable {
    private Integer id;

    private Integer rid;

    private Integer perid;

    private static final long serialVersionUID = 1L;
}