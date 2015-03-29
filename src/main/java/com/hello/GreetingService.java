package com.hello;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

  public void method1() {
    // nothing to do
  }

  public Greeting method2() {
    return new Greeting("yo!");
  }
}
