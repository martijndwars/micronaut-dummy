package dummy.controller;

import dummy.entity.Dog;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("hello")
public class HelloController {

  @Get
  public String index() {
    Dog bob = Dog.builder().name("Bob").build();
    return bob.getName();
  }
}
