package com.bertoni;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidade = 0.0;

    public String getMarca() {
        return marca; }
    public void setMarca(String marca) {
        this.marca = marca; }

    public String getModelo() {
        return modelo; }
    public void setModelo(String modelo) {
        this.modelo = modelo; }
    
    public double getVelocidade() {
        return velocidade; }

        
    public void acelerar() {
        velocidade += 10.0;
    }
    public void frear() {
        if (velocidade > 5.0) {
            velocidade -= 5.0;
        } else {
            System.out.println("Carro parado, tu quer frear mais????? Operação negada.");
        }
    }
    public void mostrarVelocidade() {
        System.out.println("Velocidade : " + velocidade);
    }
}
