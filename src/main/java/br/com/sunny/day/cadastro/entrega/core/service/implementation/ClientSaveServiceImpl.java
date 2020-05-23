package br.com.sunny.day.cadastro.entrega.core.service.implementation;

import br.com.sunny.day.cadastro.entrega.core.domain.orm.Client;
import br.com.sunny.day.cadastro.entrega.repository.ClientRepository;
import br.com.sunny.day.cadastro.entrega.core.service.ClientSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientSaveServiceImpl implements ClientSaveService {

    @Autowired
    private ClientRepository repository;

    @Override
    public void save(Client client) {
        repository.save(client);
    }
}