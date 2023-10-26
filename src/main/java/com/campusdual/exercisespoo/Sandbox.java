package com.campusdual.exercisespoo;

public class Sandbox {
    public static void main(String[] args) {
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
    }
}
