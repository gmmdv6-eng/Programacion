
package Enunciados12;

import java.util.Scanner;

public class Enun12Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena;

        // Variables que indican si hemos encontrado cada tipo de caracter
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean especial = false;

        // Pedimos una contraseña
        System.out.println("Introduce una contraseña:");
        contrasena = sc.nextLine();

        // Recorremos todos los caracteres de la contraseña
        for (int i = 0; i < contrasena.length(); i++) {

            // Guardamos el caracter de la posicion actual
            char caracter = contrasena.charAt(i);

            // Comprobamos si es una letra mayuscula
            if (caracter >= 'A' && caracter <= 'Z') {
                mayuscula = true;

            // Comprobamos si es una letra minuscula
            } else if (caracter >= 'a' && caracter <= 'z') {
                minuscula = true;

            // Si no es un numero, una mayuscula o una minuscula, es un caracter especial
            } else if (!(caracter >= '0' && caracter <= '9')) {
                especial = true;
            }
        }

        // Comprobamos que tenga al menos 8 caracteres y los tres tipos necesarios
        if (contrasena.length() >= 8 && mayuscula && minuscula && especial) {
            System.out.println("La contraseña es segura");
        } else {
            System.out.println("La contraseña no es segura");
        }

        sc.close();
    }
}
