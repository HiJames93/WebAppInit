package cn.james.webapp_init.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_permission
 * @author 
 */
@Data
public class SysPermission implements Serializable {
    private Integer id;

    private Integer pid;

    private String type;

    private String percode;

    private String name;

    private String icon;

    private String href;

    private Integer open;

    private static final long serialVersionUID = 1L;
}