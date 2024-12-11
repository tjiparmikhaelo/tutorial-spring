package com.tutorial.client;

import lombok.Data;

@Data
public class PaymentGatewayClient {
  private String endpoint;
  private String publicKey;
  private String privateKey;
}
