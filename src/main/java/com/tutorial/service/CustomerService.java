package com.tutorial.service;

import com.tutorial.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

  @Getter
  @Qualifier("normalCustomerRepository")
  @Autowired
  CustomerRepository normalCustomerRepository;

  @Getter
  @Qualifier("premiumCustomerRepository")
  @Autowired
  CustomerRepository premiumCustomerRepository;
}
