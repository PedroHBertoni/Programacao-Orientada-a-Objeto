package com.bertoni;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;


    public String getNome() {
        return nome; }
    public void setNome(String nome) {
        this.nome = nome; }

    public String getCargo() {
        return cargo; }
    public void setCargo(String cargo) {
        this.cargo = cargo; }

    public double getSalario() {
        return salario; }
    public void setSalario(double salario) {
        this.salario = salario; }

    
    public void aumentarSalario(double percentual) {
        salario *= ((100 + percentual) / 100);
    }
    public void exibirFuncionario() {
        System.out.println(cargo + " : " + nome);
        System.out.println("Salario : " + salario);
    }
}
