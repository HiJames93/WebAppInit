package cn.james.webapp_init.vo;

import cn.james.webapp_init.entity.SysPermission;
import lombok.Data;

@Data
public class PermissionVo extends SysPermission {
    private Integer page = 1;
    private Integer limit = 10;
}
