package com.tutorial;

import com.tutorial.data.cyclic.CyclicA;
import com.tutorial.data.cyclic.CyclicB;
import com.tutorial.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {

  @Bean
  public CyclicA cyclicA(CyclicB cyclicB) {
    return new CyclicA(cyclicB);
  }

  @Bean
  public CyclicB cyclicB(CyclicC cyclicC) {
    return new CyclicB(cyclicC);
  }

  @Bean CyclicC cyclicC(CyclicA cyclicA) {
    return new CyclicC(cyclicA);
  }
}
