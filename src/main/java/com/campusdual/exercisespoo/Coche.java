package com.campusdual.exercisespoo;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidadMaxima;
    public String tipoCombustible;
    public int velocimetro = 0;
    public int tacometro = 0;

    public Coche(String marca, String modelo, int velocidadMaxima, String tipoCombustible){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
    }
    public void arrancar(){
        this.tacometro = 1000;
    }
    public void apagar(){
        this.tacometro = 0;
    }
    public int acelerar(){
        this.velocimetro += 10;
        return this.velocimetro;
    }
    public int frenar(){
        this.velocimetro -= 10;
        return this.velocimetro;
    }
    public void girarVolante(int grados){
        if (grados < 0){
            System.out.println("Giro a la izquierda " + grados + " grados");
        } else {
            System.out.println("Giro a la derecha " + grados + " grados");
        }
    }
}
