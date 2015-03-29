package com.hello;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

  public void unsupportedMethod() {
    // nothing to do
  }

  public Greeting methodUsingAutoValue() {
    return Greeting.create("yo!");
  }
}
