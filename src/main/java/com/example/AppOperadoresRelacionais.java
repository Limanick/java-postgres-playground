package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente0 = new Cliente();
        cliente0.setAnoNascimento(2001);

        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(1973);

        if(cliente0.getAnoNascimento() > cliente1.getAnoNascimento() ){
            System.out.println("Cliente 0 é mais novo");
        } else if(cliente0.getAnoNascimento() < cliente1.getAnoNascimento()) {
            System.out.println("Cliente 0 é mais velho");
        } else {
            System.out.println("Os 2 tem a mesma idade");
        }

        //como boa pratica (clean code) o operador do if deve ser sempre positivo e o do else negativo, como é no código a seguir

        if(cliente0.getAnoNascimento() == cliente1.getAnoNascimento()){
            System.out.println("Mesma idade");
        } else {
            System.out.println("idade diferente");
        }

        //veja que, a igualdade, ou seja, o operador afirmativo, vem antes. isso serve para deixar o código menos confuso, como seria no caso da negação (!=) vindo primeiro.
        //o != vindo antes é contra intuitivo e confuso.

    }
}
