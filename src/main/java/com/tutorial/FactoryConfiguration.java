package com.tutorial;

import com.tutorial.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(
    PaymentGatewayClientFactoryBean.class
)
public class FactoryConfiguration {
}
