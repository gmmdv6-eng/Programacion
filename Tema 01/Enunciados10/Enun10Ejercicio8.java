
package Enunciados10;

import java.util.Scanner;

public class Enun10Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra1;
        String palabra2;

        // Pedimos las dos palabras
        System.out.println("Dime una palabra:");
        palabra1 = sc.nextLine();

        System.out.println("Dime otra palabra:");
        palabra2 = sc.nextLine();

        // Comprobamos si la primera contiene a la segunda
        if (palabra1.contains(palabra2)) {
            System.out.println("La palabra '" + palabra2 + "' esta contenida en '" + palabra1 + "'");

        // Comprobamos si la segunda contiene a la primera
        } else if (palabra2.contains(palabra1)) {
            System.out.println("La palabra '" + palabra1 + "' esta contenida en '" + palabra2 + "'");

        // Si ninguna contiene a la otra
        } else {
            System.out.println("Ninguna de las dos palabras esta contenida en la otra");
        }

        sc.close();
    }
}
