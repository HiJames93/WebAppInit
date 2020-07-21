package cn.james.webapp_init.common;

import cn.james.webapp_init.entity.OptLog;
import cn.james.webapp_init.service.IOptLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName: OptLogAspect
 * @Desciption:
 * @author: James
 * @date: 2020-07-05 下午5:33
 * @version: 1.0
 */
@Component
@Aspect
public class OptLogAspect {

    @Resource
    private IOptLogService optLogService;

    /**
     *
     * @Title: afterReturningAdvice
     * @Description: 后置返回通知
     * @param: @param joinPoint
     * @param: @param ret 参数说明
     * @return: void 返回类型
     * @throws
     */
    @AfterReturning(value="@annotation(myLog)",returning="ret")
    public void afterReturningAdvice(JoinPoint joinPoint, Object ret, MyLog myLog) {

        OptLog log = new OptLog();

        log.setUserName("系统管理员");
        log.setOptTime(String.valueOf(new Date()));

        log.setMenuName(myLog.menuName());
        log.setOptType(myLog.optType().getOptType());

        log.setOptData(Arrays.toString(joinPoint.getArgs()));

        optLogService.save(log);

    }
}
