package io.ztmark;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootRefApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRefApplication.class, args);
//        SpringApplication app = new SpringApplication(SpringBootRefApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
    }

}
