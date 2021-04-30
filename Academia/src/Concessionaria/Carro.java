package Concessionaria;

public class Carro {
    public Carro(String marca, String modelo, String cor, int portas, int lugares, boolean airbag) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.portas = portas;
        this.lugares = lugares;
        this.airbag = airbag;
    }    
    String marca;
    String modelo;
    String cor;
    int portas;
    int lugares;
    boolean airbag;
}
