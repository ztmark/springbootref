package io.ztmark.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;

/**
 * Author: Mark
 * Date  : 16/3/25
 */
@Component
public class CustomBean implements CommandLineRunner, DisposableBean {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("========================================");
        System.out.println("in CustomBean run");
        System.out.println(Arrays.toString(args));
        System.out.println("========================================");
    }

//    @PreDestroy
    @Override
    public void destroy() throws Exception {
        System.out.println("==================================");
        System.out.println("Destroy......");
        System.out.println("==================================");
    }
}
