package com.tutorial.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

  @Override
  public void afterPropertiesSet() {
    log.info("finished creating bean");
  }

  @Override
  public void destroy() {
    log.info("destroyed bean");
  }
}
