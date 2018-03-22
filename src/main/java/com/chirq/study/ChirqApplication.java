package com.chirq.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 *
 *
 * @author CliveYuan
 * @date Apr 20, 2017 2:32:54 PM
 */

@ComponentScan("com.chirq")
@EnableAutoConfiguration
// @PropertySource("classpath:config/gateway.properties")
@PropertySources(value = { @PropertySource("classpath:application.properties") })
@ImportResource(locations = { "classpath:spring/*.xml" })
public class ChirqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChirqApplication.class, args);
    }
}
