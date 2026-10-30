package Enunciados5;

import java.util.Scanner;

public class Enun5Ejercicio2 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 1;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        sc.close();

        for (int cont = 2; cont < num; cont++) {

            if (num % cont == 0) { // Divisor encontrado
                suma += cont; // Se acumula el divisor
            }

        }

        if (suma == num) {
            System.out.println("El número " + num + " es perfecto");
        } else {
            System.out.println("El número " + num + " NO es perfecto");
        }

    }
}
