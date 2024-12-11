package com.tutorial.configuration;

import com.tutorial.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerConfiguration {

  @Bean
  public CustomerRepository normalCustomerRepository() {
    return new CustomerRepository();
  }

  @Bean
  public CustomerRepository premiumCustomerRepository() {
    return new CustomerRepository();
  }
}
