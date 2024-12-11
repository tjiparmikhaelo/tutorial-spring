package com.tutorial;

import com.tutorial.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(
    MerchantServiceImpl.class
)
public class InheritanceConfiguration {
}
