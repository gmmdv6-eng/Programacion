package Enunciados5;

import java.util.Scanner;

public class Enun5Ejercicio1 {
    public static void main(String[] args) {

        int num;
        int divisor = 2;
        boolean primo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num = sc.nextInt();

        if (num <= 1) {
            primo = false;
        } else {
            while (divisor < num) {
                if (num % divisor == 0) {
                    primo = false;
                }
                divisor++;
            }
            if (primo) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }
        }
    }
}
