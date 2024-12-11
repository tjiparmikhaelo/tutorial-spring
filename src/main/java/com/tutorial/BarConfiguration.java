package com.tutorial;

import com.tutorial.data.Bar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BarConfiguration {

  @Bean
  public Bar bar() {
    log.info("created bar bean");
    return new Bar();
  }
}
