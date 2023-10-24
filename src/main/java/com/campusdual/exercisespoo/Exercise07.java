package com.campusdual.exercisespoo;

public class Exercise07 {
    // Mostrar los primeros 15 números natuales
    // Sumar los primeros 100 números naturales

    public static void showFirstNNumbers(int n){
        System.out.print("Los primeros "+n+" números son: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i)+" ");
        }
        System.out.println();
    }

    public static void sumFirstNNumbers (int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros "+n+" números es: "+sum);
    }

    public static void main(String[] args) {
        showFirstNNumbers(15);
        sumFirstNNumbers(100);
    }
}
