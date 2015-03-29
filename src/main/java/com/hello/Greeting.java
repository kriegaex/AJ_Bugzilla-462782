package com.hello;

import java.util.Objects;

public class Greeting {

  private final String message;

  public Greeting(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Greeting greeting = (Greeting) o;
    return Objects.equals(message, greeting.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }
}
