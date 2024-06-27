package com.example.democontroller;

public class User {
    public User(String nome, String provincia, String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

    public String nome;
    public String provincia;
    public String saluto;
}
