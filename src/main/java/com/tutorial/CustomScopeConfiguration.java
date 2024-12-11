package com.tutorial;

import com.tutorial.data.Bar;
import com.tutorial.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class CustomScopeConfiguration {

  @Bean
  public CustomScopeConfigurer customScopeConfigurer() {

    CustomScopeConfigurer configurer = new CustomScopeConfigurer();
    configurer.addScope("doubleton", new  DoubletonScope());
    return configurer;
  }

  @Bean
  @Scope("doubleton")
  public Bar bar() {
    log.info("create new bar");
    return new Bar();
  }
}
