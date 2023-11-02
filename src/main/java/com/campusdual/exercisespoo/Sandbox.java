package com.campusdual.exercisespoo;

import com.campusdual.exercisespoo.exercise14.Doctor;
import com.campusdual.exercisespoo.exercise14.Person;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;

public class Sandbox {
    public static void main(String[] args) {
//        Perro perro1 = new Perro(90,false,"Husky","Balto","Blanco", 30);
//        perro1.ladrar();
//        perro1.presentarse();
//        perro1.despertarse();
//
//        System.out.println();
//
//        Perro perro2 = new Perro(40, true, "Caniche", "Bobby", "Gris", 15);
//        perro2.grunhir();
//        perro2.presentarse();
//        perro2.dormirse();
//        perro2.levantarPatita();
//        perro2.despertarse();
//        perro2.levantarPatita();

//        Coche miCoche = new Coche("Nissan", "Qasqhai", 220, "Diesel");
//        miCoche.arrancar();
//        miCoche.acelerar(250);
//        miCoche.frenar(300);
//        miCoche.marchaAtras();
//        miCoche.girarVolante(-150);
//        miCoche.acelerar(10);
//        miCoche.girarVolante(0);
//        miCoche.frenar(10);
//        miCoche.apagar();
        Person p1 = new Person("Jonn", "Doe");
        Teacher t1 = new Teacher("Maria", "Montesori", "Educación");
        PoliceOfficer po1 = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d1 = new Doctor("Gregory", "House", "Nefrología e infectología");

        p1.getDetails();
        t1.getDetails();
        po1.getDetails();
        d1.getDetails();
    }
}
