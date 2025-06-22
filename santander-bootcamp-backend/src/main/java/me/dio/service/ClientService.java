package me.dio.service;


import jakarta.transaction.Transactional;
import me.dio.model.Client;

import java.util.List;

public interface ClientService {

    Client findById(Long id) throws NoSuchFieldException;


    Client getClientById(Long id);

    void createClient(Client clientToCreate);

    @Transactional
    void deleteClient(Long clientId);

    List<Client> listAllClients();

}
