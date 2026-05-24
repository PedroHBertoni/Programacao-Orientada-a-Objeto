package com.bertoni;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome; }
    public void setNome(String nome) {
        this.nome = nome; }

    public String getTelefone() {
        return telefone; }
    public void setTelefone(String telefone) {
        this.telefone = telefone; }

    public String getEmail() {
        return email; }
    public void setEmail(String email) {
        this.email = email; }

    public void exibirContato() {
        System.out.println("Contato : " + nome);
        System.out.println("Telefone (" + telefone + "), Email : " + email); }

    public void alterarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }
}
