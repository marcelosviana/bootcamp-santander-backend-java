package me.dio.service;

import jakarta.transaction.Transactional;
import me.dio.model.Client;
import me.dio.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private  final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findById(Long id) throws NoSuchFieldException {
        return clientRepository.findById(id).orElseThrow(NoSuchFieldException::new);
    }


    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void createClient(Client clientToCreate) {
        if (clientRepository.existsById(clientToCreate.getId())) {
            throw new IllegalArgumentException("Usuário já existente");
        }
        clientRepository.save(clientToCreate);
    }

    @Override
    @Transactional
    public void deleteClient(Long clientId) {
        if (!clientRepository.existsById(clientId)) {
            throw new IllegalArgumentException("Usuário não encontrado");
        }
        clientRepository.deleteById(clientId);
    }

    @Override
    public List<Client> listAllClients() {
        return clientRepository.findAll();
    }
}