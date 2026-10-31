
package Enunciados3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Enun3Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        try {
            System.out.println("Introduce un entero mayor que 4:");
            numero = sc.nextInt();

            if (numero <= 4) {
                System.out.println("Error: el numero debe ser mayor que 4.");
            } else {

                System.out.println("-------");

                while (numero != 1) {

                    if (numero % 2 == 0) {
                        numero = numero / 2;
                    } else {
                        numero = numero * 3 + 1;
                    }

                    System.out.println(numero);
                }

                System.out.println("Se ha alcanzado 4-2-1. Conjetura cumplida. Fin del programa.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir un numero entero.");

        }

        sc.close();
    }
}
