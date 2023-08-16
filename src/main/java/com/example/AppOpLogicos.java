package com.example;

public class AppOpLogicos {

    boolean a (boolean valor){
        System.out.println("a");
        return valor;
    }

    boolean b (boolean valor){
        System.out.println("b");
        return valor;
    }

    boolean c (boolean valor){
        System.out.println("c");
        return valor;
    }

    //aqui dentro do construtor a gente pode ir mudando os valores pra ir "brincando" e vendo os resultados.
    //por ex., se o pc ver q todo os operadores sao || e ja viu q o primeiro é true ele nem ve os outros.
    //ou se o pc ve um && e ja de cara ve um false ele nem ve os outros ja coloca falso.
    //as funções a, b e c printam o proprio nome justamnete pra gente ver qual foi chamada e qual nem chegou a ser chamada por causa das explicações anteriores.
    AppOpLogicos(){
        System.out.println(a(false) || b(false) && c(false));
    }

    public static void main(String[] args) {
        new AppOpLogicos();
    }
}
