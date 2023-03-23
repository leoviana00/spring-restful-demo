package io.leoviana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApplication {
    @Autowired
    @Qualifier("webApplicationName")
    private String webApplicationName;
    @GetMapping("/hello")
    public String helloWorld(){
        return webApplicationName;
    }
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
