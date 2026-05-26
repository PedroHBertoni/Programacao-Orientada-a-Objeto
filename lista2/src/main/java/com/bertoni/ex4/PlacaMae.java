package com.bertoni.ex4;

public class PlacaMae {
    private String modelo;
    private String chipset;
    
    public PlacaMae(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo; }
    public String getChipset() {
        return chipset; }

    public void exibirConfiguracao() {
        System.out.println("PlacaMãe "+modelo+", Chipset "+chipset);
    }
}
