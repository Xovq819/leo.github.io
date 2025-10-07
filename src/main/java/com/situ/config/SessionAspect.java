/*package com.situ.config;

public class SessionAspect {
}*/

package com.situ.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;

@Aspect
@Component
public class SessionAspect {

    @Pointcut("execution(* com.situ.serviceimpl.*.*(..))")
    public void executeService() {
    }
    @Around(value="executeService()")//好的
    public Object doAroundAdvice(ProceedingJoinPoint joinPoint)throws  Throwable{
        long TIME= System.currentTimeMillis();
        System.out.println("前置处理");
        Object target=joinPoint.getTarget();
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest();
        HttpSession session=request.getSession();
        try {
            Field f= target.getClass().getSuperclass().getDeclaredField("current");
            f.setAccessible(true);
            f.set(target,session.getAttribute("user"));
        }catch (Exception e) {
            e.printStackTrace();
        }
        Object obj = joinPoint.proceed();//执行主体
        System.out.println("后置处理:"+(System.currentTimeMillis()-TIME));
        return obj;
    }
}

