package Enunciados10;

import java.util.Scanner;

public class Enun10Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        String invertido = "";

        System.out.println("Dime una palabra");
        texto = sc.nextLine();
// texto.length() - 1: nos coloca en la última posición, porque las posiciones empiezan en 0.
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }
System.out.println("La cadena al reves es: " + invertido);

    }
}
