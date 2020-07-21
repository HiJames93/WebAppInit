package cn.james.webapp_init.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyLog {
    /**
     * @Description: 菜单名称
     */
    String menuName() default "";
    /**
     * @Description: 操作类型： 0-新增，1-修改，2-删除
     */
    OptEnum optType() default OptEnum.SAVE;
}
