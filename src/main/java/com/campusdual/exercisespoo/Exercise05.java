package com.campusdual.exercisespoo;

public class Exercise05 {
    // Comprobar si un número es positivo o negativo. Mayor o menor que 0.
    // Comprobar si un número es múltiplo de otro. Resto de la división es 0.
    // Comprobar si un número es menor a otro. Mayor que el otro.
    public static void main(String[] args) {
        System.out.print("Comprobar si el número es positivo o negativo: ");
        esPositivo(0);
        System.out.print("Comprobar si un número es múltiplo de otro: ");
        esMultiplo(15, 5);
        System.out.print("Comprobar si un número es menor que otro: ");
        esMenor(5, 4);
    }
    public static void esPositivo(int numero){
        if (numero >= 0) {
            System.out.println("Es un número positivo");
        }else {
            System.out.println("Es un número negativo");
        }
    }
    public static void esMultiplo(int num1, int num2){
        if (num1 % num2 == 0) {
            System.out.println(num1+" es múltiplo de "+num2);
        } else {
            System.out.println(num1+" no es múltiplo de "+num2);
        }
    }
    public static void esMenor(int num1, int num2){
        if (num1 < num2) {
            System.out.println(num1+" es menor que "+num2);
        } else {
            System.out.println(num1+" no es menor que "+num2);
        }
    }
}
