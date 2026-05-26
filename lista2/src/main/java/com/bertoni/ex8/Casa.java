package com.bertoni.ex8;

public class Casa {
    private String cor;
    private int quantidadeQuartos;
    private Endereco endereco;
    
    public Casa(String cor, int quantidadeQuartos, Endereco endereco) {
        this.cor = cor;
        this.quantidadeQuartos = quantidadeQuartos;
        this.endereco = endereco;
    }

    public String getCor() {
        return cor; }
    public int getQuantidadeQuartos() {
        return quantidadeQuartos; }
    public Endereco getEndereco() {
        return endereco; }
    
    public void exibirCasa() {
        System.out.println("Casa Cor de "+cor+", com "+quantidadeQuartos+" quartos.");
        System.out.println(endereco.getCidade()+", Bairro "+endereco.getBairro()+", Rua "+endereco.getRua()+" - "+endereco.getNumero());
    }
}
