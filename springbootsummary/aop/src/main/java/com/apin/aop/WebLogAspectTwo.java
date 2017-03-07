package com.apin.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/2/17.
 */
@Aspect
@Order(5)
@Component
public class WebLogAspectTwo {

    private Logger logger= Logger.getLogger(getClass());

    ThreadLocal<Long> startTime=new ThreadLocal<>();

    @Pointcut("execution(public * com.apin.web..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void dobefore(JoinPoint joinPoint) throws Throwable{
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();

        startTime.set(System.currentTimeMillis());

        logger.info("TWO_URL:"+request.getRequestURL().toString());
        logger.info("TWO_HTTP_METHOD:"+request.getMethod());
        logger.info("TWO_IP:"+request.getRemoteAddr());
        logger.info("TWO_CLASS_METHOD:"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("TWO_ARGS:"+ Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning="ret",pointcut = "webLog()")
    public void deAfterReturning(Object ret) throws Throwable{
        logger.info("TWO_RESPONSE:"+ret);
        logger.info("TWO_SPEND_TIME:"+(System.currentTimeMillis()-startTime.get()));
    }

}
