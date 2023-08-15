package com.example;

public class AppClasses {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.setRenda(1300);
        cliente.setAnoNascimento(2001);
        cliente.setSexo('F');

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Ano de nascimento: " + cliente.getAnoNascimento());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("É especial? " + cliente.isEspecial());
        System.out.println();

        Cliente cliente2 = new Cliente(16000, 'F');

        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Ano de nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("É especial? " + cliente2.isEspecial());

        

    }
}
