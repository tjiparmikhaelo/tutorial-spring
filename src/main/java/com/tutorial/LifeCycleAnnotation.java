package com.tutorial;

import com.tutorial.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleAnnotation {

  @Bean(
//      initMethod = "start",
//      destroyMethod = "stop"
  )
  public Server server() {
    return new Server();
  }
}
