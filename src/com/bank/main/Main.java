package com.bank.main;

import com.bank.model.Client;
import com.bank.model.AccountType;
import com.bank.service.BankService;


public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

       //Registrar cliente
        Client client = bankService.registerClient("Maria", "Camino", "12345678", "mariacamino@gmail.com");

        //Abrir cuenta
        bankService.openAccount(client, AccountType.SAVINGS);

        // Logica para Depositar y retirar

    }
}
