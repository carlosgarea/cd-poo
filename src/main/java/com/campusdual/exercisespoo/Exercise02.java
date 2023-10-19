package com.campusdual.exercisespoo;

public class Exercise02 {

    public static void main(String[] args) {
        //Área de un círculo = PI * r^2
        //Longitud de una circunferencia = PI * 2*r
        //Área de un cuadrado = lado^2

        double r = 7;
        double lado = 2.15;

        System.out.print("Área del círculo: ");
        System.out.println(Math.PI*Math.pow(r,2));
        System.out.print("Longitud de la circunferencia: ");
        System.out.println(Math.PI*2*r);
        System.out.print("Área del cuadrado: ");
        System.out.println(Math.pow(lado,2));

    }
}
