package io.ztmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class SpringBootRefApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRefApplication.class, args);
//        SpringApplication app = new SpringApplication(SpringBootRefApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
    }

}
