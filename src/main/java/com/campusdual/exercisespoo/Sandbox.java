package com.campusdual.exercisespoo;

import com.campusdual.exercisespoo.exercise14.Doctor;
import com.campusdual.exercisespoo.exercise14.Person;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;
import com.campusdual.exercisespoo.exerciseHerencia.*;

public class Sandbox {
    public static void main(String[] args) {

//        Person p1 = new Person("Jonn", "Doe");
//        Teacher t1 = new Teacher("Maria", "Montesori", "Educación");
//        PoliceOfficer po1 = new PoliceOfficer("Jake", "Peralta", "B-99");
//        Doctor d1 = new Doctor("Gregory", "House", "Nefrología e infectología");
//
//        p1.getDetails();
//        t1.getDetails();
//        po1.getDetails();
//        d1.getDetails();

        Dog Balto = new Dog(80,30,14,"negro", "placentario",
                "canis familiaris", "Balto", "Alaska", "¡Guau guau!");
        Horse Spirit = new Horse(150, 570, 15, "marrón", "placentario",
                "equus ferus caballus", "Spirit", "Nevada", "¡Hiiiiiiii!");
        Hawk Fede = new Hawk(50, 1, 12, "blanco", 1000,
                "falco peregrinus", "Fede", "Uruguay", "¡Iii Iii!");
        Chicken Calimero = new Chicken(20, 1, 1, "negro", 0,
                "gallus gallus domesticus", "Calimero", "Italia", "¡Pio Pio!");
        Dolphin Flipper = new Dolphin(400, 90, 20, "salada", 280,
                "delphinidae", "Flipper", "Florida", "¡Tatatata iiiii!");
        Orca Willy = new Orca(730, 6000, 27, "salada", 260,
                "orcinus orca", "Willy", "Islandia", "¡Iaaaaa!");

        Balto.introduce();
        Spirit.introduce();
        Fede.introduce();
        Calimero.introduce();
        Flipper.introduce();
        Willy.introduce();
    }
}
