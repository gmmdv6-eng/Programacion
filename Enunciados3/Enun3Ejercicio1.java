package Enunciados3;

import java.util.Scanner;

public class Enun3Ejercicio1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Dime un numero");
    num = sc.nextInt();
    if (num % 2 ==0 ){
        System.out.println("Es un numero par");
    }else{
        System.out.println("No es un numero par");
    }
}
}
