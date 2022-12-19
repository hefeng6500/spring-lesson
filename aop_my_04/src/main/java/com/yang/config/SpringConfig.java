package com.yang.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.yang")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
