package com.bertoni;

public class Jogador {
    private String nome;
    private int pontuacao = 0;
    private int nivel = 0;

    public String getNome() {
        return nome; }
    public void setNome(String nome) {
        this.nome = nome; }

    public double getPontuacao() {
        return pontuacao; }

    public int getNivel() {
        return nivel; }

    public void adicionarPontos(int valor) {
        pontuacao += valor;
        subirNivel();
    }

    public void subirNivel() {
        while (nivel < pontuacao /100) {
            nivel++;
        }
    }
}
