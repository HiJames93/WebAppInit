package cn.james.webapp_init.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * sys_role
 * @author 
 */
@Data
public class SysRole implements Serializable {
    private Integer id;

    private String rolename;

    private static final long serialVersionUID = 1L;

}