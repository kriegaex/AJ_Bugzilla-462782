package com.hello;

import com.hello.config.AppConfig;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String... args) {
    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    GreetingService greetingService = context.getBean("greetingService", GreetingService.class);
    System.out.println("---------------");
    try {
      greetingService.checkName();
    } catch (Exception e) {
      System.out.println("checkName() : Exception thrown...");
    }
    System.out.println("---------------");
    greetingService.sayHello("Hi!");
    System.out.println("---------------");
    context.close();
  }
}
