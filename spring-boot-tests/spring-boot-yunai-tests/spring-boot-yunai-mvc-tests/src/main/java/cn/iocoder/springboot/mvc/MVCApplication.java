package cn.iocoder.springboot.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(exclude = {SpringApplicationAdminJmxAutoConfiguration.class},
    excludeName = "org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration1",
    scanBasePackages = "cn.iocoder")
public class MVCApplication {

    @Bean
    @Profile("prod")
    public Object prodObject() {
        return new Object();
    }

    @Bean
    @Profile("dev")
    public Object devObject() {
        return new Object();
    }

    public static void main(String[] args) {
        SpringApplication.run(MVCApplication.class, args);
    }

}