package com.bertoni;

public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public String getNome() {
        return nome; }
    public void setNome(String nome) {
        this.nome = nome; }

    public double getPeso() {
        return peso; }
    public void setPeso(double peso) {
        this.peso = peso; }

    public double getAltura() {
        return altura; }
    public void setAltura(double altura) {
        this.altura = altura; }

    
    public double calcularIMC() {
        return peso/(altura*altura);
    }
    public void classificarIMC() {
        double IMC = calcularIMC();
        if (IMC < 30) {
            if (IMC < 25) {
                if (IMC < 18.5) {
                    System.out.println("Classificação : Baixo Peso");
                } else {
                    System.out.println("Classificação : Peso Normal");
                }
            } else {
                System.out.println("Classificação : Sobrepeso");
            }
        } else {
            if (IMC < 40) {
                if (IMC < 35) {
                    System.out.println("Classificação : Obesidade Grau I");
                } else {
                    System.out.println("Classificação : Obesidade Graus II");
                }
            } else {
                System.out.println("Classificação : Obesidade Mórbida");
            }
        }
    }
}
