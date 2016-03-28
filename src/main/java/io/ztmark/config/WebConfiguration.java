package io.ztmark.config;

import io.ztmark.handler.NoOpHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Author: Mark
 * Date  : 16/3/28
 */
//@EnableWebMvc
@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport /*WebMvcConfigurerAdapter*/ {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new NoOpHandler());
    }
}
