package com.example;

import java.util.ArrayList;
import java.util.List;

public class AppListas {
    public static void main(String[] args) {

        //listas não recebem tipos primitivos, só classes, por isso passamos nossa classe Cliente como tipo
        List<Cliente> listaClientes = new ArrayList<>();

        var cliente1 = new Cliente();
        cliente1.setNome("nick");
        cliente1.setAnoNascimento(2001);

        var cliente2 = new Cliente();
        cliente2.setNome("lis");
        cliente2.setAnoNascimento(2000);

        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);

        //remove o valor do indice 0 e o indice 1 vira o novo indice 0
        listaClientes.remove(0);

        //remove o primeiro cliente1 que encontar
        listaClientes.remove(cliente1);

        //remove o ultimo elemento
        int i = listaClientes.size() - 1;
        listaClientes.remove(i);

        for (var cliente : listaClientes){
            System.out.println(cliente);
        }

    }
}
