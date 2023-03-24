package io.leoviana;

import io.leoviana.domain.entity.Cliente;
import io.leoviana.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class WebApplication {
    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {
            clientes.salvar(new Cliente("Leonardo"));
            clientes.salvar(new Cliente("Thaynara"));

            List<Cliente> todosClientes =  clientes.obterTodos();
            todosClientes.forEach(System.out::println);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
