package Enunciados11;

import java.util.Arrays;

public class Enun11Ejercicio3 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 5, 6, 8, 9 };
        int[] arrayVacia = new int[4];


       for (int i = 0; i < array1.length; i++) {
         arrayVacia[i] = array1[i] + array2[i];
        }
        System.out.println(Arrays.toString(arrayVacia));
    }
}
