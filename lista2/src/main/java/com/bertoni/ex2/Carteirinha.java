package com.bertoni.ex2;

public class Carteirinha {
    private String numero;
    private String dataEmissao;

    public String getNumero() {
        return numero; }
    public void setNumero(String numero) {
        this.numero = numero; }
        
    public String getDataEmissao() {
        return dataEmissao; }
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao; }
    

    public void exibirDados() {
        System.out.println("Carteirinha : "+numero+", desde "+dataEmissao);
    }
}
