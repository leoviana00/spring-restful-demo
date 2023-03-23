package io.leoviana.service;

import io.leoviana.model.Cliente;
import io.leoviana.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarClinte(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //Aplica Validações
    }
}
