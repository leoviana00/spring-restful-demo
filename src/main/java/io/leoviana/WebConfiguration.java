package io.leoviana;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
    @Bean(name = "webApplicationName")
    public String webApllicationName(){
        return "<h1 style=\"color: black; font-size: 40px; font: cursive;\">Utilizando o Bean para realizar configurações 💻 </h1>";
    }
}
