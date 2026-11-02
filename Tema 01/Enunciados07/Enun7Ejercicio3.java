package Enunciados7;

import java.util.Scanner;

public class Enun7Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces;
        int num1 = 0;
        int num2 = 1;
        int siguiente;

        System.out.println("Cuantas veces quieres la secuencia");
        veces = sc.nextInt();

        for (int i = 0; i < veces; i++) {
            System.out.println(num1);

            siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
        sc.close();
    }
}