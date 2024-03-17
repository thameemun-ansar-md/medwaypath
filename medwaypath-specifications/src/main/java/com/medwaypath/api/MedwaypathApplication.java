package com.medwaypath.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.medwaypath.api", "com.medwaypath.dal"})
public class MedwaypathApplication {
  public static void main(String[] args) {
    SpringApplication.run(MedwaypathApplication.class);
  }
}
