package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private int AnoNascimento;
    private boolean especial;
    private String nome;
    private String CPF;

    public Cliente(){
        double rdm = Math.random();

        if(rdm > 0.5)
            especial = true;
    }

    public Cliente(double renda, char sexo){
        this();

        this.renda = renda;
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }


    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEspecial() {
        return especial;
    }


    public void setEspecial(boolean especial) {
        this.especial = especial;
    }



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

    public String toString(){
        return "Cliente: " + nome + " Ano de nascimento: " + AnoNascimento;
    }
}
