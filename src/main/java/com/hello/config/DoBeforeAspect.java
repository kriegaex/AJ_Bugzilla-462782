package com.hello.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoBeforeAspect {

  @Before("execution(* com.hello.GreetingService.sayHello(..))")
  public void doBefore(JoinPoint joinPoint) {
    System.out.println("***AspectJ*** DoBefore() intercepted " + joinPoint.getSignature().getName());
  }
}
