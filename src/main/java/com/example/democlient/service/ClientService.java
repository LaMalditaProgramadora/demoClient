package com.example.democlient.service;

import com.example.democlient.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> listAll();
    Client listById(int idClient);
    Client create(Client client);
    Client update(Client client);
    void deleteById(int idClient);
}
