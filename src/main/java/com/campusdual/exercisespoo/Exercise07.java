package com.campusdual.exercisespoo;

public class Exercise07 {
    // Mostrar los primeros 15 números natuales
    // Sumar los primeros 100 números naturales
    // Mostrar por pantala los 30 primeros números pares PERO USANDO SOLO FOR
    // Calcular el cuadrado de los 20 primeros números naturales
    // Construye un método que recibiendo por parámetro una letra del abecedario muestre por pantala cuántas letras faltan hasta llegar a la Z
    // Escribir el abecedario e ir quitando la primera letra por cada línea

    public static void showFirstNNumbers(int n) {
        System.out.print("Los primeros "+n+" números son: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i)+" ");
        }
        System.out.println();
    }
    public static void sumFirstNNumbers (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros "+n+" números es: "+sum);
    }

    public static void mostrarNNumerosPares(int n) {
        System.out.print("Los primeros "+n+" números pares son: ");
        for(int i = 2; i <= n*2; i+=2) {
            System.out.print((i)+" ");
        }
        System.out.println();
    }

    public static void cuadradoNNumeros(int n) {
        System.out.print("El cuadrado de los primeros "+n+" números son: ");
        for(int i = 1; i <= n; i++) {
            System.out.print((i*i)+" ");
        }
        System.out.println();
    }

    public static void contarLetras(char letra) {
        int contador = 0;
        for(char i = letra; i < 'Z'; i++) {
            contador++;
        }
        System.out.println("La cantidad de letras que hay entre la " + letra + " y la Z es " + contador);
    }

    public static void contarLetras2(char letra) {
        int valorDeLetra = Integer.valueOf('Z' - letra);
        System.out.println(valorDeLetra);
    }

    public static void mostrarAbecedario() {
        for(char letra = 'A'; letra <= 'Z'; letra++) {
            for(char y = letra; y <= 'Z'; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        showFirstNNumbers(15);
        sumFirstNNumbers(100);
        mostrarNNumerosPares(30);
        cuadradoNNumeros(20);
        contarLetras('V');
        contarLetras2('V');
        mostrarAbecedario();
    }
}
