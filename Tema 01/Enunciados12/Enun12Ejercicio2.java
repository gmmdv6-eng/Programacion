package Enunciados12;

import java.util.Scanner;

public class Enun12Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        System.out.println("Dime una palabra");
        cadena = sc.nextLine();

        // Comprobamos que la estructura de la cadena sea correcta
        if (cadena.matches("[A-Za-z]{3,7}[0-9]{1,2}\\$+")) {

            int contadorDolares = 0;
            int posicionFinal = cadena.length();

            // Contamos los simbolos $ desde el final
            while (posicionFinal > 0 && cadena.charAt(posicionFinal - 1) == '$') {
                contadorDolares++;
                posicionFinal--;
            }

            // Calculamos donde empieza el numero
            int inicioNumero = posicionFinal - 1;

            // Comprobamos si el numero tiene dos digitos
            if (inicioNumero > 0 && cadena.charAt(inicioNumero - 1) >= '0'
                    && cadena.charAt(inicioNumero - 1) <= '9') {
                inicioNumero--;
            }

            // Extraemos el numero y lo convertimos a entero
            int num = Integer.parseInt(cadena.substring(inicioNumero, posicionFinal));

            // Comprobamos que el numero coincida con los simbolos $
            if (num == contadorDolares) {
                System.out.println("La cadena es valida");
            } else {
                System.out.println("La cadena no es valida");
            }

        } else {
            System.out.println("La cadena no es valida");
        }

        sc.close();
    }
}