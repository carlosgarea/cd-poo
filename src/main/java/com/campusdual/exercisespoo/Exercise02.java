package com.campusdual.exercisespoo;

public class Exercise02 {

    public static double calcularAreaCirculo(double radio){
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    public static double calcularLongitudCircunferencia(double radio){
        double longitud = Math.PI * 2 * radio;
        return longitud;
    }

    public static void calcularAreaCuadrado(double lado){
        System.out.print("Área de un cuadrado: ");
        System.out.println(Math.pow(lado,2));
    }

    public static void main(String[] args) {
        //Área de un círculo = PI * r^2
        //Longitud de una circunferencia = PI * 2*r
        //Área de un cuadrado = lado^2

        double r = 7;
        double lado = 2.15;

        System.out.print("Área del círculo: ");
        System.out.println(calcularAreaCirculo(r));
        System.out.print("Longitud de la circunferencia: ");
        System.out.println(calcularLongitudCircunferencia(r));
        calcularAreaCuadrado(lado);

    }
}
