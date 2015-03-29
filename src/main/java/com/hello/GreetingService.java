package com.hello;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.transaction.support.TransactionSynchronizationManager.getCurrentTransactionName;

@Service
class GreetingService {

  private String name = "Hello";
  private int id = 12345;

  void checkName() {
    if (name.length() < 20) {
      throw new IllegalArgumentException();
    }
  }

  @Transactional
  String sayHello(String message) {
    System.out.println("SimpleService : Method sayHello() : Hello! " + message);
    System.out.println("Current transaction name: " + getCurrentTransactionName());
    return message;
  }
}
