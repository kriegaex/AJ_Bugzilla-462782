package com.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.BDDAssertions.then;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class GreetingServiceTest {

  @Autowired
  private GreetingService greetingService;

  @Test(expected = UnsupportedOperationException.class)
  public void method1_triggersUnsupportedOperationAdvice() {
    greetingService.unsupportedMethod();
  }

  @Test
  public void method2_retrievesExpectedGreetingValue() {
    Greeting greeting = greetingService.methodUsingAutoValue();

    then(greeting).isEqualTo(Greeting.create("yo!"));
  }
}
