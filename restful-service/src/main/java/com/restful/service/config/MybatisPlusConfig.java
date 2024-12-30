package com.k8s.service.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.k8s.service.mapper")
public class MybatisPlusConfig {}
