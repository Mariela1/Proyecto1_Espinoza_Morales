
package com.bank.service;

import com.bank.model.Client;
import com.bank.model.BankAccount;
import com.bank.model.AccountType;

import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<String, Client> clients = new HashMaps<>();

    public Client registerClient(String firstName, String lastName, String dni, String email) {
        if (clients.containsKey(dni)) {
            throw new IllegalArgumentException("DNI already exists");
        }
        Client client = new Client(firstName, lastName, dni, email);
        clients.put(dni, client);
        return client;
    }
 // Metodo para abrir una cuenta
    public BankAccount openAccunt(Client client, AccountType type) {
        String accountNumber = generateAccountNumber();
        BankAccount account = new BankAccount(accountNumber, type);
        client.addAccount(account);
        return account;
    }
    private String generateAccountNumber() {

        return "ACC" + System.currentTimeMillis();
    }

    // Metodo para depositar dinero
    // Metodo para retirar dinero

}
