package Enunciados10;

import java.util.Scanner;

public class Enun10Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cifra;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.println("Dime los numeros de tu DNI");
        cifra = sc.nextInt();

        do {
            if (cifra > 99999999 || cifra < 0) {
                System.out.println("Error, introduce un numero de hasta 8 cifras");
                cifra = sc.nextInt();
            }
        } while (cifra > 99999999 || cifra < 0);

        // Calculamos el resto de dividir el DNI entre 23
        int resto = cifra % 23;

        // Utilizamos el resto como posicion para obtener la letra
        char letra = letras.charAt(resto);

        System.out.println("Te corresponde la letra " + letra);

        sc.close();
    }
}
