package Apuntes;

import java.util.Random;

public class MatrizAleatoria {
public static void main(String[] args) {
    int filas = 5;
    int columnas = 3;
    int [][] matriz = new int [filas][columnas];
    Random rand = new Random();

        //Relleno con numeros aleatorios
 for (int i = 0; i < matriz.length; i++) {

        for (int j = 0; j < matriz[i].length; j++) {
         matriz[i][j] = rand.nextInt(0, 10);        
        }
       
    }
         // Muesta matriz por defecto
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
       System.out.println(matriz[i][j] + " ");
        }
        System.out.println();
    }

}
}
