
package Enunciados10;

import java.util.Scanner;

public class Enun10Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena;
        int indice;

        System.out.println("Dime una cadena de texto");
        cadena = sc.nextLine();

        System.out.println("Dime el indice");
        indice = sc.nextInt();

        // Comprobamos que el índice esté dentro de los límites de la cadena
        do {
            // Si el índice es negativo o igual/superior a la longitud, es incorrecto
            if (indice < 0 || indice >= cadena.length()) {

                // Mostramos un mensaje de error y volvemos a pedir el índice
                System.out.println("Error, introduce el indice correctamente");
                indice = sc.nextInt();
            }

        // Repetimos mientras el índice siga siendo incorrecto
        // cadena.length(): devuelve la cantidad de caracteres que tiene una cadena
        } while (indice < 0 || indice >= cadena.length());

        // Obtenemos el carácter de la posición indicada y lo guardamos como número
        // cadena.charAt(indice): devuelve el carácter que se encuentra en la posición indicada.
        int resultado = cadena.charAt(indice);

        // Mostramos el carácter seleccionado y su valor numérico
        System.out.println("La letra " + cadena.charAt(indice) + " corresponde a " + resultado);

        // Cerramos el Scanner
        sc.close();
    }
}