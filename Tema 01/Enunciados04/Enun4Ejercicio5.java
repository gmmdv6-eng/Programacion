package Enunciados4;

import java.util.Scanner;

public class Enun4Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tope;
        int intervalo;

        System.out.println("Dime tope");
        tope = sc.nextInt();
        System.out.println("Dime intervalo ");
        intervalo = sc.nextInt();

        if (intervalo <= 0) {
            System.out.println("El intervalo es mayor que 0");
        } else {
            int contador = 0;
            while (contador <= tope) {
                System.out.println(contador);
                contador += intervalo;
            }
        }

    }
}
