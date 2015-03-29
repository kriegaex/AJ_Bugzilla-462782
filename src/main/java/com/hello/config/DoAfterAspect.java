package com.hello.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoAfterAspect {

  @After("execution(* com.hello.GreetingService.sayHello(..))")
  public void doAfter(JoinPoint joinPoint) {
    System.out.println("***AspectJ*** DoAfter() intercepted " + joinPoint.getSignature().getName());
  }
}
