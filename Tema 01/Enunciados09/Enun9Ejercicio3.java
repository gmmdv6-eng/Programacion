import java.util.InputMismatchException;
import java.util.Scanner;

public class Enun9Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int numeroPico;

        try {
            System.out.println("Introduce un entero mayor que 4:");
            numero = sc.nextInt();

            if (numero <= 4) {
                System.out.println("Error: el numero debe ser mayor que 4.");
            } else {
                // aqui actualiza el numero pico si es mayor
                numeroPico = numero;

                System.out.println("-------");

                while (numero != 1) {

                    if (numero % 2 == 0) {
                        numero = numero / 2;
                    } else {
                        numero = numero * 3 + 1;
                    }
                    // si es mayor se actualiza
                    if (numero > numeroPico) {
                        numeroPico = numero;
                    }

                    System.out.println(numero);
                }

                System.out.println("Numero pico: " + numeroPico);
                System.out.println("Se ha alcanzado 4-2-1. Conjetura cumplida. Fin del programa.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir un numero entero.");
        }

        sc.close();
    }
}