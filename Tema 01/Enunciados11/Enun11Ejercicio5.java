package Enunciados11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Enun11Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int longitud;
        int array[];

        System.out.println("Dime la longitud");
        longitud = sc.nextInt();

        array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
             array[i] = rand.nextInt();   
        }
       System.out.println(Arrays.toString(array));
    }
}