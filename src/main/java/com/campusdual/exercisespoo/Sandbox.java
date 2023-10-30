package com.campusdual.exercisespoo;

public class Sandbox {
    public static void main(String[] args) {
        /*
        Perro perro1 = new Perro(90,false,"Husky","Balto","Blanco", 30);
        perro1.ladrar();
        perro1.presentarse();
        perro1.despertarse();

        System.out.println();

        Perro perro2 = new Perro(40, true, "Caniche", "Bobby", "Gris", 15);
        perro2.grunhir();
        perro2.presentarse();
        perro2.dormirse();
        perro2.levantarPatita();
        perro2.despertarse();
        perro2.levantarPatita();
*/
        Coche miCoche = new Coche("Nissan", "Qasqhai", 220, "Diesel");
        miCoche.arrancar();
        System.out.println("Velocidad actual: " + miCoche.acelerar(250) + " km/h");
        System.out.println("Velocidad actual: " + miCoche.frenar(300) + " km/h");
        miCoche.marchaAtras();
        System.out.println("Velocidad actual: " + miCoche.acelerar(10) + " km/h");
        miCoche.girarVolante(-15);
        System.out.println("Velocidad actual: " + miCoche.frenar(10) + "km/h");
        miCoche.apagar();
    }
}
