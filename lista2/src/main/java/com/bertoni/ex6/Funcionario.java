package com.bertoni.ex6;

public class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;

    public Funcionario(String nome, String cargo, Cracha cracha) {
        this.nome = nome;
        this.cargo = cargo;
        this.cracha = cracha;
    }

    public String getNome() {
        return nome; }
    public String getCargo() {
        return cargo; }
    public Cracha getCracha() {
        return cracha; }

    public void exibirFuncionario() {
        System.out.println("Trabalhador : "+nome+" - "+cargo);
        System.out.println("Cracha : "+cracha.getCodigo()+", válido até "+cracha.getDataValidade());
    }
}
