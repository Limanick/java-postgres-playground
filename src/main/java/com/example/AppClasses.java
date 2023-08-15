package com.example;

public class AppClasses {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.setRenda(1300);
        cliente.setAnoNascimento(2001);
        cliente.setSexo('F');

        System.out.println("Ano de nascimento: " + cliente.getAnoNascimento());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());

    }
}
