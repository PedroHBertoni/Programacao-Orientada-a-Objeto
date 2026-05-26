package com.bertoni.ex8;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    
    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua; }
    public int getNumero() {
        return numero; }
    public String getBairro() {
        return bairro; }
    public String getCidade() {
        return cidade; }
}
