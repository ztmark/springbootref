package io.ztmark.config;

import io.ztmark.domain.User;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;

/**
 * Author: Mark
 * Date  : 16/3/25
 */
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@Configuration
public class CustomizedConfiguration {

//    @Profile("test")
    @Bean(name = "user")
    public User randomUser() {
        return new User("mark", 23);
    }

    @Profile("prod")
    @Bean(name = "user")
    public User aUser() {
        return new User();
    }

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return container -> container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/error.html"));

    }
}
