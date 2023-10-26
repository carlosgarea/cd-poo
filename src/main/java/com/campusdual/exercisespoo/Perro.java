package com.campusdual.exercisespoo;

public class Perro {
    int altura;
    boolean esDePeloLargo;
    String raza;
    String nombre;
    String color;
    int peso;
    boolean estaDormido = false;

    public Perro(int altura, boolean esDePeloLargo, String raza, String nombre, String color, int peso) {
        this.altura = altura;
        this.esDePeloLargo = esDePeloLargo;
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
    }

    public void ladrar(){
        if (!this.estaDormido) {
            System.out.println(this.nombre + ": Guau! Guau!");
        } else {
            System.out.println(this.nombre + "está durmiendo...");
        }
    }

    public String tengoPeloLargo(){
        String mensaje;
        if (this.esDePeloLargo){
            mensaje = " y tengo el pelo largo";
        } else {
            mensaje = " y tengo el pelo corto";
        }
        return mensaje;
    }

    public void presentarse(){
        if (!this.estaDormido) {
            System.out.println(this.nombre + ": Me llamo " + this.nombre + ", soy un perro de la raza " + this.raza.toLowerCase() + ", mido " + this.altura + " cm de alto" + ", peso " + this.peso + " kg" + tengoPeloLargo() + " de color " + this.color.toLowerCase() + ".");
        } else {
            System.out.println(this.nombre + " está durmiendo...");
        }
    }

    public void grunhir(){
        if (!this.estaDormido){
            System.out.println("Grrr");
        } else {
            System.out.println(this.nombre + " está durmiendo...");
        }
    }

    public void levantarPatita(){
        if (!this.estaDormido){
            System.out.println(this.nombre + " ha levantado la patita");
        } else {
            System.out.println(this.nombre + " está durmiendo...");
        }
    }

    public void dormirse(){
        if (this.estaDormido){
            System.out.println(this.nombre + " ya está durmiendo");
        } else {
            this.estaDormido = true;
            System.out.println(this.nombre + " se ha puesto a dormir");
        }
    }

    public void despertarse(){
        if (this.estaDormido){
            this.estaDormido = false;
            System.out.println(this.nombre + " se despertó");
        } else {
            System.out.println(this.nombre + " ya está despierto");
        }
    }

}
