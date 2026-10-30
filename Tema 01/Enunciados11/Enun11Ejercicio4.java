package Enunciados11;

import java.util.Arrays;
import java.util.Scanner;

public class Enun11Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        int array[];

        System.out.println("Dime la longitud");
        longitud = sc.nextInt();

        array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime los digitos");
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                System.out.println("Es un numero par");
            } else {
                System.out.println("No es un numero par");
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
