package cn.james.webapp_init.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sys_user
 * @author 
 */
@Data
public class SysUser implements Serializable {
    private Integer id;

    private String telephone;

    private String passwd;

    private String realname;

    private Date birthday;

    private String headimg;

    private Integer available;

    private Integer did;

    private static final long serialVersionUID = 1L;
}