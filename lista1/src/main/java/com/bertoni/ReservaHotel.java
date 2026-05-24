package com.bertoni;

public class ReservaHotel {
    private String nomeHospede;
    private int quantidadeDiarias;
    private double valorReserva;

    public String getNomeHospede() {
        return nomeHospede; }
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede; }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias; }
    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias; }

    public double getValorReserva() {
        return valorReserva; }
    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva; }

    public double calcutarTotal() {
        return quantidadeDiarias * valorReserva;
    }

    public void exibirReserva() {
        System.out.println(nomeHospede + " : Reserva de " + quantidadeDiarias + " dias (" + valorReserva + " cada).");
        System.out.println("Preco total = " + calcutarTotal());
    }
}
