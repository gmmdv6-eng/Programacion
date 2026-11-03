package Enunciados11;

import java.util.Scanner;

public class Enun11Ejercicio8 {
   public static void main(String[] args) {
        int filas = 3, columnas = 3;
        boolean[][] mapa = new boolean[filas][columnas];
        int minas = 2;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String intentosPrevios = "";

        // Generar minas aleatoriamente
        while (minas != 0) {
            // 1. Elegir una posición con mina
            int fila = rand.nextInt(0, filas);
            int columna = rand.nextInt(0, columnas);

            if (mapa[fila][columna] == false) {
                mapa[fila][columna] = true;
                // muestro para probar puedo eliminarlo despues
                System.out.println("Mina en: " + fila + ", " + columna);

                // 2. Decrementar el contador de minas
                minas--;
            }
            
        }

        // Momento de elegir celdas
        for (int intento = 1; intento <= 4; intento++) {
            int fila;
            int columna;

            System.out.print("Introduce la fila: ");
            fila = sc.nextInt();
            System.out.print("Introduce la columna: ");
            columna = sc.nextInt();
            // intentos previos sirve para no repetir numeros 
            if (intentosPrevios.contains("(" + fila + "," + columna + ")")) {
                System.out.println("Intento ya realizado.");
                intento--;// resta un intento porque sino si cuenta
            } else if (mapa[fila][columna] == false) {
                intentosPrevios += "(" + fila + "," + columna + ")";
                System.out.println("Celda sin mina");

                if (intento == 4) {
                    System.out.println("Has ganado!");
                }

            } else {
                System.out.println("Celda con mina! Has perdido");
                // Cuando se haga "intento++" valdrá 5 y no cumple
                intento = 4;
            }

        }

        sc.close();
    }
}
