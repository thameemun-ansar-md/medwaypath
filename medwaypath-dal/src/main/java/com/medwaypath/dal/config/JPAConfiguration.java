package com.medwaypath.dal.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.medwaypath.dal.jpa")
@EntityScan(basePackages = "com.medwaypath.dal.entities")
public class JPAConfiguration {}
