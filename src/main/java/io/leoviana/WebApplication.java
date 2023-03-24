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
            System.out.println("Salvando clientes");
            clientes.salvar(new Cliente("Leonardo"));
            clientes.salvar(new Cliente("Thaynara"));

            List<Cliente> todosClientes =  clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("Atualizando clientes");
            todosClientes.forEach(c -> {
                c.setNome(c.getNome() + " atualizado.");
                clientes.atualizar(c);
            } );
            todosClientes =  clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("Buscando clientes");
            clientes.buscarPorNome("Tha").forEach(System.out::println);

/*            System.out.println("Deletando clientes");
            clientes.obterTodos().forEach(c ->{
                clientes.deletar(c);
            });*/

            todosClientes =  clientes.obterTodos();
            if (todosClientes.isEmpty()) {
                System.out.println("Nenhum cliente encontrado!");
            }else {
                todosClientes.forEach(System.out::println);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
