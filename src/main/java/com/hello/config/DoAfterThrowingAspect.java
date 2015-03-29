package com.hello.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoAfterThrowingAspect {

  @AfterThrowing(
      pointcut = "execution(* com.hello.GreetingService.checkName(..))",
      throwing = "error")
  public void doAfterThrowing(JoinPoint joinPoint, Throwable error) {
    System.out.println("***AspectJ*** DoAfterThrowing() intercepted " + joinPoint.getSignature().getName());
    System.out.println("Exception : " + error);
    System.out.println("******");
  }
}
