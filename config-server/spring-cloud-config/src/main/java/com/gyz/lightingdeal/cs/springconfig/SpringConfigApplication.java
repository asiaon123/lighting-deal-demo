package com.gyz.lightingdeal.cs.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author YaZhou.Gu 2019/6/11
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigApplication.class, args);
    }

}
