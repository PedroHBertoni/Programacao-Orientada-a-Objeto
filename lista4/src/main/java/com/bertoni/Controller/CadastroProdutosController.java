package com.bertoni.Controller;

import java.util.ArrayList;
import com.bertoni.Model.*;

public class CadastroProdutosController {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Perfil perfil;

    public boolean cadastrarProduto(Produto produto) {
        if (perfil == Perfil.ADMIN) {
            produtos.add(produto);
        } return false;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos; }
    public Perfil getPerfil() {
        return perfil; }
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil; }
}
