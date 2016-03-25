package io.ztmark.config;

import io.ztmark.domain.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Mark
 * Date  : 16/3/25
 */
@Configuration
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class CustomizedConfiguration {

    @Bean(name = "user")
    public User randomUser() {
        return new User("Mark", 23);
    }


}
