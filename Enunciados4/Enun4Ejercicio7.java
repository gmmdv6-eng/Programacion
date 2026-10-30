package Enunciados4;

import java.util.Scanner;

public class Enun4Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Dime primer numero");
        num1 = sc.nextInt();

        System.out.println("Dime segundo numero");
        num2 = sc.nextInt();

        

        if (num1 < num2) {
            num1++;
            while (num1 < num2) {
                int resultado = num1;
                System.out.println(num1 +" + " + num2 + " = "+ resultado);
                num1++; resultado = num1 +num2;
            }
        } else {

            num2++;
            while (num2 < num1) {
                System.out.println(num1 + " + " + num2 + " = ");
                num2++;
            }
        }
    }
}
