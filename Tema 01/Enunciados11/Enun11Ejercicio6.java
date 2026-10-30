package Enunciados11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Enun11Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        int fila;
        int columna;

   
        System.out.print("Dime las filas");
        fila = sc.nextInt();
        System.out.print("Dime las columnas");
        columna = sc.nextInt();

        int[][] matriz = new int[fila][columna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(-10, 10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
