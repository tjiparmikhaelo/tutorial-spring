package com.tutorial.factory;

import com.tutorial.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
  @Override
  public PaymentGatewayClient getObject() throws Exception {
    PaymentGatewayClient client = new PaymentGatewayClient();

    client.setEndpoint("https://google.com");
    client.setPrivateKey("slang");
    client.setPublicKey("null");

    return client;
  }

  @Override
  public Class<?> getObjectType() {
    return PaymentGatewayClient.class;
  }
}
