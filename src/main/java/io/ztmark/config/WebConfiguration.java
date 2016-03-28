package io.ztmark.config;

import io.ztmark.handler.NoOpHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Author: Mark
 * Date  : 16/3/28
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new NoOpHandler());
    }
}
