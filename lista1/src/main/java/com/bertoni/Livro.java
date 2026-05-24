package com.bertoni;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado = false;


    public String getTitulo() {
        return titulo; }
    public void setTitulo(String titulo) {
        this.titulo = titulo; }

    public String getAutor() {
        return autor; }
    public void setAutor(String autor) {
        this.autor = autor; }

    
    public void emprestarLivro() {
        if (emprestado) {
            System.out.println("Livro " + titulo + " já emprestado. Operação negada.");
        } else {
            emprestado = true;
            System.out.println("Empréstimo realizado.");
        }
    }
    public void devolverLivro() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Devolução aceita.");
        } else {
            System.out.println("Livro " + titulo + " já presente. Operação negada.");
        }
    }
    public void verificarDisponibilidade() {
        if (emprestado) {
            System.out.println("Livro alugado.");
        } else {
            System.out.println("Livro disponível.");
        };
    }
}
