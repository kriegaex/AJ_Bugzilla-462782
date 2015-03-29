package com.hello;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AppConfig {

  @Aspect
  @Component
  public static class UnsupportedOperationAspect {

    @Before("execution(* com.hello.GreetingService.unsupportedMethod(..))")
    public void throwUnsupportedOperationOnGreetingServiceUnsupportedMethod() {
      throw new UnsupportedOperationException();
    }
  }
}
