package com.bertoni.ex10;

public class Perfil {
    private String bio;
    private String foto;
    private String visibilidade;
    
    public Perfil(String bio, String foto, String visibilidade) {
        this.bio = bio;
        this.foto = foto;
        this.visibilidade = visibilidade;
    }

    public String getBio() {
        return bio; }
    public String getFoto() {
        return foto; }
    public String getVisibilidade() {
        return visibilidade; }
}
