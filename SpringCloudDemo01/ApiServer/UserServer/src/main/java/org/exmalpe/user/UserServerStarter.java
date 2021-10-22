package org.exmalpe.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServerStarter {
    public static void main(String[] args) {
        SpringApplication.run(UserServerStarter.class,args);
    }
}
