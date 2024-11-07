package com.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private String dni;
    private String email;
    private List<BankAccount> accounts;

    // Constructor
    public Client(String firstName, String lastName, String dni, String email ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.email = email;
        this.accounts = new ArrayList<>();
    }
    // Metodos getters y setters

    // Metodo para agregar una cuenta
    public void addAccount(BankAccount account) {
       accounts.add(account);
    }

}
