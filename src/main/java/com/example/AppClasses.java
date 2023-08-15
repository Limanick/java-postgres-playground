package com.example;

import java.util.Scanner;

public class AppClasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente cliente = new Cliente();
        
        System.out.println("Digite o nome: ");
        cliente.setNome(input.nextLine());

        System.out.println("Digite o ano de nascimento: ");
        cliente.setAnoNascimento(input.nextInt());

        input.nextLine();
        System.out.println("Digite o CPF: ");
        cliente.setCPF(input.nextLine());

        System.out.println("Digite a renda: ");
        cliente.setRenda(input.nextDouble());

        input.nextLine();
        System.out.println("Digite o sexo: ");
        String sexo = input.nextLine();
        cliente.setSexo(sexo.charAt(0));

        



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
