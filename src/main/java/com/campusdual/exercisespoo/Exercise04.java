package com.campusdual.exercisespoo;

public class Exercise04 {
    // Sumar los primeros 5 números naturales
    // Sumar los primeros 20 números pares
    // Calcular el factorial de un número que queramos

    public static void main(String[] args) {
        System.out.print("El resultado de sumar los 5 primeros números es: ");
        System.out.println(sumarPrimeros());
        System.out.print("El resultado de sumar los 20 primeros pares es: ");
        System.out.println(sumarPares());
        System.out.print("El factorial de 7 es: ");
        System.out.println(factorial());
        // Con Loops
        sumarPrimerosLoop(5);
        sumarParesLoop(20);
        factorialLoop(7);
    }
    public static int sumarPrimeros(){
        int suma = 1+2+3+4+5;
        return suma;
    }
    public static int sumarPares(){
        int suma = 2+4+6+8+10+12+14+16+18+20+22+24+26+28+30+32+34+36+38+40;
        return suma;
    }
    public static int factorial(){
        int fact = 7*6*5*4*3*2*1;
        return fact;
    }
    public static void sumarPrimerosLoop(int n){
        int result = 0;
        for (int i=1; i<=n; i++){
            result += i;
        }
        System.out.println("Los primeros "+n+" números suman "+result);
    }
    public static void sumarParesLoop(int n){
        int result = 0;
        for (int i=1; i<=n*2; i++){
            if (i % 2 == 0){
                result += i;
            } else {
                result += 0;
            }
        }
        System.out.println("Los primeros "+n+" números pares suman "+result);
    }
    public static void factorialLoop(int n){
        int result = 1;
        for (int i=1; i<=n; i++){
            result = result * i;
        }
        System.out.println("El factorial de "+n+" es "+result);
    }
}
