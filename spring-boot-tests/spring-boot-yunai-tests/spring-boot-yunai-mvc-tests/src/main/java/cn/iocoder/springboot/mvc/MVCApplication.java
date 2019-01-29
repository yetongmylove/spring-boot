package cn.iocoder.springboot.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;

@SpringBootApplication(exclude = {SpringApplicationAdminJmxAutoConfiguration.class},
    excludeName = "org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration1",
    scanBasePackages = "cn.iocoder")
public class MVCApplication {

    public static void main(String[] args) {
        SpringApplication.run(MVCApplication.class, args);
    }

}