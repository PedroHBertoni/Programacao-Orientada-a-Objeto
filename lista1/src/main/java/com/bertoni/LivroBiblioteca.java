package com.bertoni;

public class LivroBiblioteca {
    private String titulo;
    private String autor;
    private String codigo;
    private boolean disponivel = true;

    public String getTitulo() {
        return titulo; }
    public void setTitulo(String titulo) {
        this.titulo = titulo; }

    public String getAutor() {
        return autor; }
    public void setAutor(String autor) {
        this.autor = autor; }

    public String getCodigo() {
        return codigo; }
    public void setCodigo(String codigo) {
        this.codigo = codigo; }

    public boolean isDisponivel() {
        return disponivel; }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Empréstimo de '" + titulo + "' aceito. Não esqueça da devolução!");
        } else {
            System.out.println("Livro indisponível...");
        }
    }
    public void devolver() {
        if (disponivel) {
            System.out.println("Livro já devolvido.");
        } else {
            disponivel = true;
            System.out.println("Devolução de '" + titulo + "' aceita. Muito obrigado pela preferência!");
        }
    }
    public void exibirInformacoes() {
        System.out.print("Livro : " + titulo + ", " + autor + "\nCode = " + codigo + ", ");
        if (disponivel) {
            System.out.println("Retirável.");
        } else {
            System.out.println("Aguardando devolução.");
        }
    }
}
