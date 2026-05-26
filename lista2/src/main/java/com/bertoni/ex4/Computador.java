package com.bertoni.ex4;

public class Computador {
    private String marca;
    private String processador;
    private PlacaMae placaMae;
    
    public Computador(String marca, String processador, PlacaMae placaMae) {
        this.marca = marca;
        this.processador = processador;
        this.placaMae = placaMae;
    }

    public String getMarca() {
        return marca; }
    public String getProcessador() {
        return processador; }
    public PlacaMae getPlacaMae() {
        return placaMae; }

    public void exibirConfiguracao() {
        System.out.println("Computador "+marca+", Processador "+processador);
        placaMae.exibirConfiguracao();
    }
}
