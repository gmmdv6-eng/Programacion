package Enunciados7;

import java.util.Scanner;

public class Enun7Ejercicio1 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int numInicial;
    int numInicialCopia;
    int invertido =0;
    int resto;

    System.out.println("Dime un numero");
    numInicial = sc.nextInt();
    numInicialCopia = numInicial;
    while (numInicial >0) {
        resto = numInicial % 10; //numInicial % 10 obtiene la última cifra del número
        invertido = invertido * 10 + resto; // invertido * 10 + resto añade esa cifra al número invertido.
        numInicial = numInicial /10; // numInicial / 10 elimina la última cifra del número original (porque estamos trabajando con enteros).
    }
    if (numInicialCopia==invertido) {
        System.out.println("Es capicua");
    }else{
        System.out.println("No es capicua");
    }
    } 
}
