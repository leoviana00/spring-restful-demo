package io.leoviana;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class WebConfiguration {
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO EM AMBIENTE DE DESENVOLVIMENTO");
        };
    }
}
