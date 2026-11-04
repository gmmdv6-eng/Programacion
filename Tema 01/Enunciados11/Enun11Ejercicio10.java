
package Enunciados11;

import java.util.Random;

public class Enun11Ejercicio10 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] numeros = new int[9];

        // Rellenar el array aleatoriamente
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(0, 21);
        }

        // Mostrar el array original
        System.out.println("Array original:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Algoritmo de la burbuja
        for (int i = 0; i < numeros.length - 1; i++) { // repite las pasadas por el array

            for (int j = 0; j < numeros.length - 1 - i; j++) { // compara los numeros que estan juntos

                if (numeros[j] > numeros[j + 1]) {

                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;

                }
            }
        }

        // Mostrar el array ordenado
        System.out.println("\nArray ordenado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
