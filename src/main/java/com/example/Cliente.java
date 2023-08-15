package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private int AnoNascimento;
    
    public double getRenda() {
        return renda;
    }
    
    public void setRenda(double renda) {
        if(renda >= 0)
            this.renda = renda;
        else
            System.out.println("A renda não pode ser negativa");
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        if(sexo == 'F' || sexo == 'M' || sexo == 'f' || sexo == 'm')
            this.sexo = sexo;
        else
            System.out.println("Sexo inválido");
    }
    
    public int getAnoNascimento() {
        return AnoNascimento;
    }
    
    public void setAnoNascimento(int AnoNascimento) {
        this.AnoNascimento = AnoNascimento;
    }
}
