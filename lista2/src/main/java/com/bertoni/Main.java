package com.bertoni;

import com.bertoni.ex2.*;
import com.bertoni.ex4.*;
import com.bertoni.ex6.*;
import com.bertoni.ex8.*;
import com.bertoni.ex10.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();  


        //Atividade 2
        System.out.println("---- ATIVIDADE 2 ----");
        Carteirinha Car = new Carteirinha();
        Car.setNumero("1234.5");
        Car.setDataEmissao("19/07/2026");
        Aluno Alu = new Aluno();
        Alu.setNome("Munir Berg");
        Alu.setCurso("Ciência da Computação");
        Alu.setCarteirinha(Car);
        
        Alu.exibirDados();
        Car.exibirDados();


        System.out.println();


        //Atividade 4
        System.out.println("---- ATIVIDADE 4 ----");
        PlacaMae Pla = new PlacaMae("Modelo de Placa", "Chipset de Placa");
        Computador Com = new Computador("Pichau Gamer", "Intel", Pla);
        Com.exibirConfiguracao();


        System.out.println();


        //Atividade 6
        System.out.println("---- ATIVIDADE 6 ----");
        Cracha Cra = new Cracha("123.32", "16/05/2026");
        Funcionario Fun = new Funcionario("Guilherme Shimano", "Programador", Cra);
        Fun.exibirFuncionario();


        System.out.println();


        //Atividade 8
        System.out.println("---- ATIVIDADE 8 ----");
        Endereco End = new Endereco("Colombo", 67, "Pindamonhangaba", "Ourizona");
        Casa Cas = new Casa("Amarelo", 4, End);
        Cas.exibirCasa();



        System.out.println();


        //Atividade 10
        System.out.println("---- ATIVIDADE 10 ---");
        Perfil Per = new Perfil("Gosto de Gatinhos Fofos", "Gato Peludo", "Privado");
        Usuario Usu = new Usuario("Gusta", "gusta@cesu.br", Per);
        Usu.exibirUsuario();

        System.out.println();
    }
}