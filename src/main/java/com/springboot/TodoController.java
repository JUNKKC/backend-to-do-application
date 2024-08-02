package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
  @GetMapping("/")
  public String helloworld(){
    return "To-do Application!";
  }
}
