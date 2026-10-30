package Enunciados2;

import java.util.Scanner;

public class Enun2Ejercicio2 {
public static void main(String[] args) {
    double nota;
    Scanner sc = new Scanner(System.in);

    System.out.println("Dime tu nota");
    nota = sc.nextDouble();

    if (nota >= 0 && nota <4.9 ){
        System.out.println("Suspenso");
    }else if (nota >= 5 && nota <6.9 ){
        System.out.println("Aprobado");
    }else if (nota >= 7 && nota <8.9 ){
        System.out.println("Notable");
    }else if (nota >= 9 && nota <=10 ){
        System.out.println("Sobresaliente");
    }else {
        System.out.println("Introduce una nota valida");
    }
}
}
