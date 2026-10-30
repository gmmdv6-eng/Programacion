package Enunciados11;

import java.util.Scanner;

public class Enun11Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] matriz = new boolean[3][3];
        matriz[1][2] = true;
        matriz[2][2] = true;

        int intentos = 0;
        int fila;
        int columna;

        while (intentos <= 3) {
            System.out.println("Dime la fila");
            fila = sc.nextInt();
            System.out.println("Dime la columna");
            columna = sc.nextInt();
            if (fila < matriz.length || fila >= matriz.length || columna < matriz.length || fila > matriz.length) {
                System.out.println("Estas fuera de los limetes");
           break;
            }

            if (matriz[fila][columna]) {
                System.out.println("Has caido en una mina");
                break;
            } else {
                intentos++;
                System.out.println("No has caido en en mina te quedan " + intentos);
            }
            if (intentos == 3) {
                System.out.println("Ganaste");
            }
        }
    }
}
