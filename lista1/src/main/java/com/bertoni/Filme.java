package com.bertoni;

public class Filme {
    private String titulo;
    private String genero;
    private double duracao;
    private double avaliacao = 0.0;

    public String getTitulo() {
        return titulo; }
    public void setTitulo(String titulo) {
        this.titulo = titulo; }

    public String getGenero() {
        return genero; }
    public void setGenero(String genero) {
        this.genero = genero; }

    public double getDuracao() {
        return duracao; }
    public void setDuracao(double duracao) {
        this.duracao = duracao; }

    public double getAvaliacao() {
        return avaliacao; }

    
    public void exibirFichaTecnica() {
        System.out.println("FILME : " + titulo);
        System.out.println("Genero : " + genero + ", " + duracao + " min");
        System.out.println("Nota IMDb : " + avaliacao);
    }

    public void alterarAvaliacao(double novaAvaliacao) {
        if (novaAvaliacao >= 0 && novaAvaliacao <= 10) {
            avaliacao = novaAvaliacao;
        } else {
            System.out.println("Nota fora de escala! Entre 0 - 10.");
        }
    }
}
