package Enunciados9;

import java.util.Scanner;

public class Enun9Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int espacios;

        System.out.print("Introduce la cantidad: ");
        max = sc.nextInt();
        sc.close();
        espacios = max - 1;

        // bucle para pintar las filas de la mitad superior
        // 1 fila tiene: primero espacios segundo asteriscos

        for (int i = 1; i <= max; i++) {

            // imprime los espacios
            // 1 tendara max - 1 espacios
            // tendra max - 2 espacios
            // ....
            for (int e = 1; e <= espacios; e++) {
                System.out.print(" ");
            }

            // imprime los asteriscos
            // En la primera vuelta i = 1 -> 1 asteriscos
            // En la segunda vuelta i = 2 -> 2 asteriscos
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
            espacios--;
        }

        // recupero
        espacios = max - 1;

        // bucle para pintar las filas de la mitad inferior
        // 1 fila tiene: primero espacios segundo asteriscos

        for (int i = max - 1; i >= 1; i--) {

            // imprime los espacios

            for (int e = max - 1; e >= espacios; e--) {
                System.out.print(" ");
            }

            // imprime los asteriscos
            for (int a = i; a >= 1; a--) {
                System.out.print("* ");
            }
            System.out.println();
            espacios--;
        }

    }
}