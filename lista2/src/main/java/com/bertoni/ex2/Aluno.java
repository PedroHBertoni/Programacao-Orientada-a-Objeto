package com.bertoni.ex2;

public class Aluno {
    private String nome;
    private String curso;
    private Carteirinha carteirinha;

    public String getNome() {
        return nome; }
    public void setNome(String nome) {
        this.nome = nome; }

    public String getCurso() {
        return curso; }
    public void setCurso(String curso) {
        this.curso = curso; }

    public Carteirinha getCarteirinha() {
        return carteirinha; }
    public void setCarteirinha(Carteirinha carteirinha) {
        this.carteirinha = carteirinha; }
    

    public void exibirDados() {
        System.out.println("Aluno : "+nome+", de "+curso);
    }
}
