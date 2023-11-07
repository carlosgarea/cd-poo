package com.campusdual.exercisespoo.exercise16;

public class Sandbox {
    public static void main(String[] args) {
        IMachine avion = new Plane("Boeing");
        avion.start();
        avion.stop();
        avion.maintenance();
////        avion.takeOff();
////        avion.fly();
////        avion.land();
////        System.out.println(avion.getDetails());

        IMachine tractor = new Tractor(1200);
        tractor.start();
        tractor.stop();
        tractor.maintenance();
////        tractor.forward();
////        tractor.backward();
////        System.out.println(tractor.getDetails());

        ((Plane)avion).fly();
        ((Tractor)tractor).forward();
    }
}
