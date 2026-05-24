package com.bertoni;

public class Main {
    public static void main(String[] args) {
        
        //Atividade 1
        System.out.println("---- ATIVIDADE 1 ----");
        Pessoa Pes1 = new Pessoa();
        Pes1.setNome("Pedro H Bertoni");
        Pes1.setIdade(19);
        Pes1.exibirDados();


        System.out.println();


        //Atividade 2
        System.out.println("---- ATIVIDADE 2 ----");
        Produto Prod1 = new Produto();
        Prod1.setNome("Refrigerante - Fanta Uva");
        Prod1.setPreco(8.67);
        Produto Prod2 = new Produto();
        Prod2.setNome("Bolacha - Trakinas");
        Prod2.setPreco(4.67);

        Prod1.mostrarInformacoes();
        Prod2.mostrarInformacoes();


        System.out.println();


        //Atividade 3
        System.out.println("---- ATIVIDADE 3 ----");
        Aluno Alu1 = new Aluno();
        Alu1.setNome("Pedro H Bertas");
        Alu1.setMatricula("143345");

        Alu1.setNota1(0.0);
        Alu1.setNota2(6.8);
        System.out.println("Media : " + Alu1.calcularMedia());
        Alu1.verificarSituacao();

        System.out.println("Atualizando...");
        Alu1.setNota1(5.0);
        Alu1.setNota2(9.0);

        System.out.println("Media : " + Alu1.calcularMedia());
        Alu1.verificarSituacao();


        System.out.println();


        //Atividade 4
        System.out.println("---- ATIVIDADE 4 ----");
        Retangulo Ret1 = new Retangulo();
        Ret1.setAltura(2.0);
        Ret1.setBase(3.1);

        System.out.println("Área Retângulo: " + Ret1.calcularArea());
        System.out.println("Perimetro : " + Ret1.calcularPerimetro());


        System.out.println();


        //Atividade 5
        System.out.println("---- ATIVIDADE 5 ----");
        ContaBancaria CB1 = new ContaBancaria();
        CB1.setNumero("123.456.789");
        CB1.setTitular("Guilherme Shimano");

        CB1.consultarSaldo();

        CB1.sacar(5.0);

        CB1.depositar(5000.0);
        CB1.sacar(500.0);
        CB1.consultarSaldo();


        System.out.println();


        //Atividade 6
        System.out.println("---- ATIVIDADE 6 ----");
        Carro Car1 = new Carro();
        Car1.setMarca("Volkswagen");
        Car1.setModelo("Gol");

        Car1.frear();

        Car1.acelerar(); // +10
        Car1.acelerar(); // +10
        Car1.mostrarVelocidade(); 

        Car1.frear(); // -5
        Car1.mostrarVelocidade();


        System.out.println();


        //Atividade 7
        System.out.println("---- ATIVIDADE 7 ----");
        Funcionario Func1 = new Funcionario();
        Func1.setNome("Munir");
        Func1.setCargo("Vagabundo");
        Func1.setSalario(5000);
        Func1.exibirFuncionario();

        Func1.aumentarSalario(15.0);
        Func1.exibirFuncionario();


        System.out.println();


        //Atividade 8
        System.out.println("---- ATIVIDADE 8 ----");
        Livro Liv1 = new Livro();
        Liv1.setAutor("Machado de Assis");
        Liv1.setTitulo("Memórias Póstumas de Brás Cubas");
        Liv1.verificarDisponibilidade();
        Liv1.devolverLivro();
        System.out.println();

        Liv1.emprestarLivro();
        Liv1.emprestarLivro();
        Liv1.devolverLivro();


        System.out.println();


        //Atividade 9
        System.out.println("---- ATIVIDADE 9 ----");
        Celular Cel1 = new Celular();
        Cel1.setMarca("Xiaomi");
        Cel1.setModelo("Redmi Note 12");
        System.out.println("Bateria original : " + Cel1.getNivelBateria());
        Cel1.carregar(20);
        System.out.println("Bateria, 20 de carga : " + Cel1.getNivelBateria());
        Cel1.carregar(50);
        System.out.println("Bateria, 50 de carga : " + Cel1.getNivelBateria());
        Cel1.usar(200);
        System.out.println("Bateria, 200 de uso : " + Cel1.getNivelBateria());


        System.out.println();


        //Atividade 10
        System.out.println("---- ATIVIDADE 10 ----");
        Filme Fil1 = new Filme();
        Fil1.setDuracao(110);
        Fil1.setGenero("Terror");
        Fil1.setTitulo("Gente Grande");

        Fil1.exibirFichaTecnica();
        System.out.println();
        Fil1.alterarAvaliacao(6.7);
        Fil1.exibirFichaTecnica();

        
        System.out.println();


        //Atividade 11
        System.out.println("---- ATIVIDADE 11 ----");
        Paciente Pac1 = new Paciente();
        System.out.println("Índice de Massa corporal = " + Pac1.calcularIMC());
        


        System.out.println();


        //Atividade 12
        System.out.println("---- ATIVIDADE 12 ----");


        System.out.println();


        //Atividade 13
        System.out.println("---- ATIVIDADE 13 ----");


        System.out.println();


        //Atividade 14
        System.out.println("---- ATIVIDADE 14 ----");


        System.out.println();


        //Atividade 15
        System.out.println("---- ATIVIDADE 15 ----");
    }
}