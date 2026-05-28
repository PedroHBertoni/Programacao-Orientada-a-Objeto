package com.bertoni.View;

import java.util.Scanner;

import com.bertoni.Controller.CadastroProdutosController;
import com.bertoni.Model.Perfil;
import com.bertoni.Model.Produto;

public class CadastroProdutosView {
    private CadastroProdutosController controller;
    private Scanner scan = new Scanner(System.in);

    public CadastroProdutosView(CadastroProdutosController controller) {
        this.controller = controller;
    }

    public void definirUsuario() {
        System.out.print("Digite 1 caso seu nível de usuário seja ADMIN : ");
        if (scan.nextInt() == 1) {
            controller.setPerfil(Perfil.ADMIN);
        } else {
            controller.setPerfil(Perfil.PADRAO);
        }
    }

    public void cadastrarProduto() {
        System.out.print("Digite o nome do Produto : ");
        String nome = scan.nextLine();
        System.out.print("Digite o preco do Produto : ");
        float preco = scan.nextFloat();
        controller.cadastrarProduto(new Produto(nome, preco));
    }

    public boolean encerrar() {
        System.out.print("Digite 0 para encerrar o Programa : ");
        return scan.nextInt() == 0;
    }

}