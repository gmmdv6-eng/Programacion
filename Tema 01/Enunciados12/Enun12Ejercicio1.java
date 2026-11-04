package Enunciados12;

import java.util.Scanner;

public class Enun12Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int letras = 0;
        int digitos = 0;

        System.out.println("Dime una palabra");
        cadena = sc.nextLine();

        // Contamos las letras y los digitos
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter >= 'A' && caracter <= 'Z') {
                letras++;
            } else if (caracter >= '0' && caracter <= '9') {
                digitos++;
            }
        }

        // Comprobamos las dos condiciones
        if (cadena.matches("[A-Z0-9]+") && letras > digitos) {
            System.out.println("La palabra es valida");
        } else {
            System.out.println("No vale");
        }

        System.out.println("Hay " + letras + " letras");
        System.out.println("Hay " + digitos + " digitos");

        sc.close();
    }
}