package Enunciados10;

import java.util.Scanner;

public class Enun10Ejercicio7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    String numero;
    int ceros;

    System.out.println("Dime un numero");
    num = sc.nextInt();
    sc.close();


    //transformas el string en numero
    numero = "" + num;
    // El numero de ceros para el primer digito menos 1

    ceros = numero.length() -1;

    // Empieza por izquierda siempre a pillar numeros
    for (int i = 0; i < numero.length(); i++) {
    char digito = numero.charAt(i);        

   // System.out.println(digito + ceros);


    System.out.println(digito + "0".repeat(ceros));
// otra opcion es qcon el metodo de la clase string 
// ejemplo "Hola".repeat(3)  --> HolaHOlaHola
// sout (digito + "0".repeat(ceros))
ceros --;
}
}
}
