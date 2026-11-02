
package Enunciados9;

import java.util.Scanner;

public class Enun9Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int limite;
        int numeroEscalon = 1;

        System.out.println("Dime un numero mayor que 0");
        limite = sc.nextInt();

        if (limite > 0) {

            do {
                for (int j = 0; j < numeroEscalon; j++) {
                    System.out.print(j + 1);
                }// j escribe los números sin saltar de línea

                System.out.println();
                numeroEscalon++;// aumenta la cantidad de números del siguiente escalón

            } while (numeroEscalon <= limite);

        } else {
            System.out.println("El numero debe ser mayor que 0");
        }

        sc.close();
    }
}
