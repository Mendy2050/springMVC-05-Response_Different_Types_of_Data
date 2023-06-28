package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Mendy
 * @create 2023-06-28 16:12
 */

@Configuration
@ComponentScan("com.itheima.controller")
//Enable Automatic Conversion of JSON Data Types
@EnableWebMvc
public class SpringMvcConfig {
}

