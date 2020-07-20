package cn.james.webapp_init.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_dept
 * @author 
 */
@Data
public class SysDept implements Serializable {
    private Integer id;

    private String dname;

    private static final long serialVersionUID = 1L;
}