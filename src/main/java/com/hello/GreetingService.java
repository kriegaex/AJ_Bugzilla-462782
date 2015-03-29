package com.hello;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

  public Greeting get() {
    return new Greeting("yo!");
  }
}
