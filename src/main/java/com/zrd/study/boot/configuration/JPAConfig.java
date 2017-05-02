package com.zrd.study.boot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.zrd.study.boot.dao")
public class JPAConfig {

}
