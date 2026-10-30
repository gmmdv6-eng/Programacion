package Enunciados7;

import java.util.Scanner;

public class Enun7Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int sumaDivs1 = 0;
        int sumaDivs2 = 0;

        System.out.println("Dime un numero");
        num1 = sc.nextInt();
        System.out.println("Dime otro");
        num2 = sc.nextInt();
        sc.close();

        for (int x = 1; x < num1; x++) {
            if (num1 % x == 0) {
                sumaDivs1 += x;
            }
        }

        for (int x = 1; x < num2; x++) {
            if (num2 % x == 0) {
                sumaDivs2 += x;
            }
        }

        if (sumaDivs1 == num2 && sumaDivs2 == num1) {
            System.out.println("Son amigos");
        } else {
            System.out.println("No son amigos");
        }

    }
}

