package com.sip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableDiscoveryClient
@SpringBootApplication
public class SipServerApplication {
    /*@Value("${url}")
    String url;

    @RequestMapping("/get")
    String hello() {
        return "Hello " + url + "!";
    }*/

    public static void main(String[] args) {
        SpringApplication.run(SipServerApplication.class, args);
    }
}
