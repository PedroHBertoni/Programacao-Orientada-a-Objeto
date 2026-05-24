package com.bertoni;

public class Celular {
    private String marca;
    private String modelo;
    private int nivelBateria = 50;

    public String getMarca() {
        return marca; }
    public void setMarca(String marca) {
        this.marca = marca; }

    public String getModelo() {
        return modelo; }
    public void setModelo(String modelo) {
        this.modelo = modelo; }

    public int getNivelBateria() {
        return nivelBateria; }
    
    
    public void carregar(int valor) {
        nivelBateria += valor;
        if (nivelBateria >= 100) {
            nivelBateria = 100;
            System.out.println("Bateria carregada! Recomendado tirar da tomada.");
        }
    }
    public void usar(int valor) {
        nivelBateria -= valor;
        if (nivelBateria <= 0) {
            nivelBateria = 0;
            System.out.println("Carga zerada. Busque um carregador próximo.");
        }
    }
    
}
