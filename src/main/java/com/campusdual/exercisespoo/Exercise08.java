package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        //mostrarSaludo();
        //pedirNumero();
        mostrarSaludoConUtils();
        pedirNumeroConUtils();
    }

    public static void pedirNumeroConUtils() {
        int numeroParaMostrar;
        do {
            numeroParaMostrar = Utils.integer("Introduce un número mayor que 5: ");
        } while (numeroParaMostrar <= 5);
        System.out.println("El número que has escrito es: " + numeroParaMostrar);
    }

    public static void mostrarSaludoConUtils() {
        String nombreUsuario = Utils.string("Introduce tu nombre: ");
        System.out.println("Hola " + nombreUsuario + "! ¿Cómo estás?");
    }

    public static void mostrarSaludo() {
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;
        System.out.println("Intoduce tu nombre:\n");
        nombreUsuario = scan.next();
        System.out.println("Hola " + nombreUsuario + "! ¿Cómo estás?");
    }
    public static void pedirNumero() {
        Scanner scan = new Scanner(System.in);
        int numeroParaMostrar;

        do {
            System.out.println("Introduce un número mayor que 5:\n");
            numeroParaMostrar = scan.nextInt();
        } while (numeroParaMostrar < 5);
        System.out.println("El número que has escrito es: " + numeroParaMostrar);
    }
}
