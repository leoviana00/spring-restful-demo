package io.leoviana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
    @GetMapping("/hello")
    public String helloWorld(){
        return "<h1 style=\"color: black; font-size: 40px; font: cursive;\">Hello World, Estudando Springboot 💻 </h1>";
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
