package Enunciados10;

import java.util.Scanner;

public class Enun10Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena;
        int indice;
        int indice2;

        System.out.println("Dime una cadena de texto:");
        cadena = sc.nextLine();

        System.out.println("Dime el primer indice:");
        indice = sc.nextInt();

        System.out.println("Dime el segundo indice:");
        indice2 = sc.nextInt();

        // Comprobamos que los dos indices esten dentro de los limites de la cadena
        do {

            // Si alguno de los indices es negativo o supera la longitud de la cadena
            if (indice < 0 || indice >= cadena.length()
                    || indice2 < 0 || indice2 >= cadena.length()) {

                // Mostramos un mensaje de error y volvemos a pedir los dos indices
                System.out.println("Error: introduce dos indices validos.");
                indice = sc.nextInt();
                indice2 = sc.nextInt();
            }

        // Repetimos mientras alguno de los indices siga siendo incorrecto
        } while (indice < 0 || indice >= cadena.length()
                || indice2 < 0 || indice2 >= cadena.length());

        // Comprobamos si el primer indice es mayor que el segundo
        if (indice > indice2) {

            // Intercambiamos los indices utilizando una variable auxiliar
            int auxiliar = indice;
            indice = indice2;
            indice2 = auxiliar;
        }

        // Obtenemos el trozo de cadena comprendido entre los dos indices
        // Sumamos 1 al segundo indice porque substring no incluye la posicion final
        String resultado = cadena.substring(indice, indice2 + 1);

        System.out.println("El trozo de cadena comprendido entre los dos indices es: " + resultado);

        sc.close();
    }
}
