package com.tutorial.application;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import com.tutorial.listener.AppStartingListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Slf4j
@SpringBootApplication
public class FooApplication {

  @Bean
  public Foo foo() {
    return new Foo();
  }

//  public static void main(String[] args) {
//    ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//
//    Foo foo = applicationContext.getBean(Foo.class);
//    System.out.println(foo);
//  }

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(FooApplication.class);
    log.info("creating application context");
    application.setBannerMode(Banner.Mode.OFF);
    application.setListeners(List.of(new AppStartingListener()));

    ConfigurableApplicationContext context = application.run(args);

    Foo foo = context.getBean(Foo.class);
    System.out.println(foo);
  }
}
