package com.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;

import static org.springframework.context.annotation.AdviceMode.ASPECTJ;

@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement(mode = ASPECTJ)
@ComponentScan("com.hello")
public class AppConfig {

  @Bean
  public PlatformTransactionManager transactionManager() {

    return new AbstractPlatformTransactionManager() {
      @Override
      protected Object doGetTransaction() throws TransactionException {
        System.out.println("PlatformTransactionManager doGetTransaction");
        return null;
      }

      @Override
      protected void doBegin(Object transaction, TransactionDefinition definition) throws TransactionException {
        System.out.println("PlatformTransactionManager doBegin");
      }

      @Override
      protected void doCommit(DefaultTransactionStatus status) throws TransactionException {
        System.out.println("PlatformTransactionManager doCommit");
      }

      @Override
      protected void doRollback(DefaultTransactionStatus status) throws TransactionException {
        System.out.println("PlatformTransactionManager doRollback");
      }
    };
  }
}
