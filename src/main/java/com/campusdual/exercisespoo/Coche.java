package com.campusdual.exercisespoo;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidadMaxima;
    public String tipoCombustible;
    public int velocimetro = 0;
    public int tacometro = 0;
    public int giro = 0;

    public Coche(String marca, String modelo, int velocidadMaxima, String tipoCombustible){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
    }
    public void arrancar(){
        if (this.tacometro == 0){
            this.tacometro = 1000;
            System.out.println("Motor encendido");
        } else {
            System.out.println("¡El coche ya está arrancado!");
        }
    }
    public void apagar(){
        if (this.velocimetro == 0){
            this.tacometro = 0;
            System.out.println("Motor apagado");
        } else {
            System.out.println("¡El coche no está parado!");
        }
    }
    public int acelerar(int aumentoVelocidad){
        if (this.tacometro == 0){
            System.out.println("¡El coche no está encendido!");
        } else if ((this.velocimetro + aumentoVelocidad) > this.velocidadMaxima) {
            this.velocimetro = this.velocidadMaxima;
            System.out.println("¡Se ha alcanzado la velocidad máxima! ¡El coche no puede acelerar más!");
        } else {
            this.velocimetro += aumentoVelocidad;
        }
        return this.velocimetro;
    }
    public int frenar(int disminucionVelocidad) {
        if (this.tacometro == 0) {
            System.out.println("¡El coche no está encendido!");
        } else if ((this.velocimetro - disminucionVelocidad) < 0) {
            this.velocimetro = 0;
            System.out.println("El coche se ha detenido");
        } else {
            this.velocimetro -= disminucionVelocidad;
        }
        return this.velocimetro;
    }
    public void girarVolante(int grados){
        if (grados < 0){
            if (grados < -45){
                grados = -45;
            }
            System.out.println("Giro a la izquierda de " + -grados + " grados");
        } else if (grados > 0){
            if (grados > 45){
                grados = 45;
            }
            System.out.println("Giro a la derecha de " + grados + " grados");
        } else {
            System.out.println("Ruedas rectas");
        }
        this.giro = grados;
    }
    public void marchaAtras(){
        if (this.tacometro == 0){
            System.out.println("¡El coche no está encendido!");
        } else if (this.velocimetro != 0){
            System.out.println("¡El coche no está parado!");
        } else {
            System.out.println("Marcha atrás puesta");
        }
    }
    public void mostrarDetalle(){
        System.out.println(this.marca + " " + this.modelo + " " + this.tipoCombustible + " Máx.: " + this.velocidadMaxima + " km/h");
        System.out.println("Vel.: " + this.velocimetro + " km/h - " + "Rev.: " + this.tacometro + " rpm - " + this.giro + "º de giro");
        }
}
