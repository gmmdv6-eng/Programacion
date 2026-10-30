package Enunciados11;

import java.util.Random;
import java.util.Scanner;

public class Enun11Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int fila = 3;
        int columna = 3;
        int matriz[][] = new int[fila][columna];
        String opciones;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(0, 21);
            }
        }

        do {

            System.out.println("MENU");
            System.out.println("1. Para ver el elemento de una posicion buscando fila y columna");
            System.out.println("2. Cambiar elemneto en una posicion");
            System.out.println("3. Ver cuantos hay por encima de un valor");
            System.out.println("4. Salir del programa");
            System.out.println("Dime la opcion que quieres ");
            opciones = sc.nextLine();
            switch (opciones) {
                case "1":
                    System.out.print("Que fila quieres ver: ");
                    fila = sc.nextInt();
                    System.out.println("Que columna quieres ver");
                    columna = sc.nextInt();
                    System.out.println(
                            "La fila  " + fila + " y la columna " + columna + " muestran " + matriz[fila][columna]);
                    break;
                case "2":
                    int nuevovalor;
                    System.out.print("Que fila quieres ver: ");
                    fila = sc.nextInt();
                    System.out.println("Que columna quieres ver");
                    columna = sc.nextInt();
                    System.out.println("Dime el nuevo valor para cambiarlo");
                    nuevovalor = sc.nextInt();
                    matriz[fila][columna] = nuevovalor;
                    break;
                case "3":
                    int peticion;
                    System.out.println("introduce un valor y te digo cuantos numeros hay por encima");
                    peticion = sc.nextInt();
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {

                            if (peticion < matriz[i][j]) {
                                System.out.println(matriz[i][j]);
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (!opciones.equals("4"));
        System.out.println("Fin del programa");
    }
}
