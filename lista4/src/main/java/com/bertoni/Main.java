package com.bertoni;

import com.bertoni.Controller.CadastroProdutosController;
import com.bertoni.View.CadastroProdutosView;

public class Main {
    public static void main(String[] args) {
        CadastroProdutosController controller = new CadastroProdutosController();
        CadastroProdutosView view = new CadastroProdutosView(controller);

        view.definirUsuario();
        do {
            view.cadastrarProduto();
        } while (view.encerrar());
    }
}