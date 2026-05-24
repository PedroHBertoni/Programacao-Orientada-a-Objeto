package com.bertoni;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo = 0.0;

    public String getNumero() {
        return numero; }
    public void setNumero(String numero) {
        this.numero = numero; }

    public String getTitular() {
        return titular; }
    public void setTitular(String titular) {
        this.titular = titular; }

    public double getSaldo() {
        return saldo; }


    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
        } else {
            System.out.println("Seu saque extrapola o saldo atual. Operação negada.");
        }
    }
    public void consultarSaldo() {
        System.out.println("Saldo : " + saldo);
    }
}   
