package com.hello.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoAfterReturningAspect {

  @AfterReturning(pointcut = "execution(* com.hello.GreetingService.sayHello(..))", returning = "result")
  public void doAfterReturning(JoinPoint joinPoint, Object result) {

    System.out.println("***AspectJ*** DoAfterReturning() intercepted " + joinPoint.getSignature().getName());
    System.out.println("Method returned value is " + result);

  }

}
