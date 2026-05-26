package com.bertoni.ex6;

public class Cracha {
    private String codigo;
    private String dataValidade;
    
    public Cracha(String codigo, String dataValidade) {
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }

    public String getCodigo() {
        return codigo; }
    public String getDataValidade() {
        return dataValidade; }    
}
