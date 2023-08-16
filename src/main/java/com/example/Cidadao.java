package com.example;

import java.time.LocalDate;

public class Cidadao {
    private LocalDate dataNasc;

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int idade(){
        return LocalDate.now().getYear() - dataNasc.getYear();
    }

    //nao precisa do else ja que caso ele encontre uma condição verdadeira ele retorna o valor do if e não execulta a outra, então não tem...
    //... o erro de ele poder execultar varios if por não estar encadeado
    public String eleitor(){
        int idade = idade();
        if(idade < 16)
            return "Não é eleitor";
        
        if(idade > 15 && idade < 18 || idade >= 70)
            return "Eleitor facultativo";
        
        return "Eleitor obrigatório";
    }
}
