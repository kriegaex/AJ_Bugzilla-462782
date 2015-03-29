package com.hello;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Greeting {

  static Greeting create(String message) {
    return new AutoValue_Greeting(message);
  }

  abstract String getMessage();
}
