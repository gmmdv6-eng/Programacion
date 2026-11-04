package Apuntes;

import java.util.Arrays;

public class RecorridoArrays {
public static void main(String[] args) {
    char [] chars = {'1', '$', 'B'};

    for (int i = 0; i < chars.length; i++) {
        System.out.println("Elemento nº " + i + " = " + chars[i]);
    }
System.out.println(Arrays.toString(chars));
}
}
