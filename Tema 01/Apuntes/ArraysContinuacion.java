package Apuntes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysContinuacion {

    public static void main(String[] args) {
        boolean[] booleans = { true, false, true };
        int[] numeros;
        int longitud;

        Scanner sc = new Scanner(System.in);
        Random rad = new Random();

        System.out.println("Dime la longitud");
        longitud = sc .nextInt();
        sc.close();

        // Aqui se construye el array en base a lo
        // necesite el usuario
        // los valores se rellenan con el valor por defecto
        //     si es int -> sera 0
        //     si es double -> sera 0
        // en general para cualquier numero (incluido char) es 0
        // para boolean es false
        // para String es null
        numeros = new int [longitud];
// convierte array en string
        System.out.println(Arrays.toString(numeros));
// limite inferior incluido
// limite superior excluido
        for (int i =0; i< numeros.length; i++){
            numeros[i] = rad.nextInt(1, 11);
        }
    

        System.out.println(Arrays.toString(numeros));

    
    }

}
