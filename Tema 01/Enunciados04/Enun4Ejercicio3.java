package Enunciados4;

import java.util.Scanner;

public class Enun4Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        int opcion;

        System.out.println("Elige opciones");
        System.out.println("1. incrmentar");
        System.out.println("2. Disminuir");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                int contador = 0;
                System.out.println("Dime un numero");
                num = sc.nextInt();
                while (contador <= num) {
                    System.out.println(contador);
                    contador++;
                }
                break;
            case 2:
                int contador1 = 0;
                System.out.println("Dime un numero");
                num = sc.nextInt();
                while (num >= contador1) {
                    System.out.println(num);
                    num--;
                }
                break;

            default:
                System.out.println("Error");
                break;
        }
    }
}
