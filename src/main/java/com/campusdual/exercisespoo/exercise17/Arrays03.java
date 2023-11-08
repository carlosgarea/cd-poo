package com.campusdual.exercisespoo.exercise17;

public class Arrays03 {

    public static void main(String[] args) {

        //Declaración e inicialización de array UNIDIMENSIONAL
        int[] intArrayUni = {1, 2, 3, 4, 5};

        //Declaración e inicialización de array BIDIMENSIONAL
        int[][] intArrayBi = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
        };

        //Declaración e inicialización de array TRIDIMENSIONAL
        int[][][] intArrayTri = {
                {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5}},
                {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5}},
                {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5}},
                {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5}},
                {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5}}
        };

        //Recorremos el array unidimensional con el for
        System.out.println("Array unidimensional");
        for (int i = 0; i < intArrayUni.length; i++) {
            System.out.print(intArrayUni[i] + " ");
        }

        //Recorremos el array biidimensional con dos for
        System.out.println("\n\nArray bidimensional");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(intArrayBi[i][j] + " ");
            }
            ;
            System.out.println();
        }

        //Recorremos el array tridimensional con tres for
        System.out.println("\n\nArray tridimensional");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = 0;
                for (int k = 0; k < 5; k++) {
                    val += intArrayTri[i][j][k];
                }
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
