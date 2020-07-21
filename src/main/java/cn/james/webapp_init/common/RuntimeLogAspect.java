package cn.james.webapp_init.common;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName: RuntimeLogAspect
 * @Desciption:
 * @author: James
 * @date: 2020-07-05 下午5:40
 * @version: 1.0
 */
@Component
@Aspect
public class RuntimeLogAspect {

    /**
     *
     * @Title: pointcut
     * @Description: 定义切入点表达式
     * @param: 参数说明
     * @return: void
     * 返回类型 @throws
     */
    @Pointcut("execution(public * cn.james.rpi.service.impl.*ServiceImpl.*(..))")
    private void pointcut01() {
    }

    /**
     *
     * @Title: beforeAdvice
     * @Description: 设定前置通知
     * @param: @param joinPoint 连接点
     * @return: void 返回类型
     * @throws
     */
    @Before("pointcut01()")
    public void beforeAdvice(JoinPoint joinPoint) {
        // 目标对象
        Object target = joinPoint.getTarget();
        // 获得目标方法的方法名
        String methodName = joinPoint.getSignature().getName();
        // 获得方法正在使用的参数
        Object[] args = joinPoint.getArgs();

        //-------------针对目标对象的类进行日志记录--------------
        Logger log = Logger.getLogger(target.getClass());

        System.out.println("前置通知，运行在目标方法执行之前！！！！");
        log.info(target.getClass() + " " + methodName + "() params=" + Arrays.toString(args));
    }

    /**
     *
     * @Title: afterReturningAdvice
     * @Description: 定义后置返回通知 ，它执行在目标方法正在执行，并返回结果以后
     * @param: @param joinPoint 连接点
     * @param: @param ret 目标方法的返回结果
     * @return: void 返回类型
     * @throws
     */
    @AfterReturning(value="pointcut01()",returning="result")
    public void afterReturningAdvice(JoinPoint joinPoint,Object result) {

        // 目标对象
        Object target = joinPoint.getTarget();
        // 获得目标方法的方法名
        String methodName = joinPoint.getSignature().getName();
        // 获得方法正在使用的参数
//		Object[] args = joinPoint.getArgs();

        //-------------针对目标对象的类进行日志记录--------------
        Logger log = Logger.getLogger(target.getClass());

        System.out.println("后置返回通知 ，它执行在目标方法正在执行，并返回结果以后！！！！");
        log.info(target.getClass() + " " + methodName + "() result=" + ((result == null) ? "" : result.toString()));


    }


    /**
     *
     * @Title: afterThrowingAdvice
     * @Description: 定义后置异常通知，它执行在目标方法抛出异常之后！！！！！！
     * @param: @param joinPoint
     * @param: @param exce 参数说明
     * @return: void 返回类型
     * @throws
     */
    @AfterThrowing(value="pointcut01()",throwing="exce")
    public void afterThrowingAdvice(JoinPoint joinPoint,Exception exce) {

        // 目标对象
        Object target = joinPoint.getTarget();
        // 获得目标方法的方法名
        String methodName = joinPoint.getSignature().getName();
        // 获得方法正在使用的参数
//		Object[] args = joinPoint.getArgs();

        //-------------针对目标对象的类进行日志记录--------------
        Logger log = Logger.getLogger(target.getClass());

        System.out.println("后置异常通知，它执行在目标方法抛出异常之后！！！！！！");

        log.error(target.getClass() + " " + methodName + "() exception:", exce);

    }

    /**
     *
     * @Title: afterAdvice
     * @Description: 后置通知，它运行在程序不管是否抛出异常，或者是否正常执行，该通知都会执行 (finally)
     *
     * final  finally  finalize()
     * @param:  参数说明
     * @param joinPoint 连接点
     * @return: void 返回类型
     * @throws
     */
    @After("pointcut01()")
    public void afterAdvice(JoinPoint joinPoint) {

        System.out.println("后置通知，它运行在程序不管是否抛出异常，或者是否正常执行，该通知都会执行 (finally)");

    }
}
