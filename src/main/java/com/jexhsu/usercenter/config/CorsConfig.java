package com.jexhsu.usercenter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // 允许cookies跨域
        config.addAllowedOrigin("http://localhost:8000"); // 允许的前端地址
        config.addAllowedHeader("*"); // 允许的请求头
        config.addAllowedMethod("*"); // 允许的HTTP方法
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
