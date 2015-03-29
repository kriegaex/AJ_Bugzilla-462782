package com.hello;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String... args) {
    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    GreetingService greetingService = context.getBean("greetingService", GreetingService.class);

    Greeting greeting = greetingService.get();
    System.out.println("GreetingService said " + greeting.getMessage());

    context.close();
  }
}
