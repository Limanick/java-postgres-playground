package com.example;

import java.time.LocalDate;

public class AppEleitor {
    public static void main(String[] args) {
        var cidadao = new Cidadao();

        cidadao.setDataNasc(LocalDate.of(2012, 12, 14));
        System.out.println(cidadao.idade());
        System.out.println(cidadao.eleitor());

    }
}
