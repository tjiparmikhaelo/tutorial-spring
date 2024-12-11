package com.tutorial.event;

import com.tutorial.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {

  @Getter
  private final User user;

  public LoginSuccessEvent(User user) {
    super(user);
    this.user = user;
  }
}
