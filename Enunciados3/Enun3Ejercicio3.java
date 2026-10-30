package Enunciados3;

import java.util.Scanner;

public class Enun3Ejercicio3 {
    public static void main(String[] args) {
        double edad;
        double altura;
        double peso;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos años tienes");
        edad = sc.nextDouble();
        System.out.println("Dime tu altura");
        altura = sc.nextDouble();
        System.out.println("Dime tu peso");
        peso = sc.nextDouble();

        System.out.println(
                "La edad en años es " + edad + " y los meses es " + (edad * 12) + " meses y en dias " + (edad * 365));
        System.out.println("La altura es de " + altura + "m y los centimetros es " + (altura * 100)
                + "cm y en milimetros " + (altura * 1000) + "mm");
        System.out.println("El peso es de " + (peso) + "kg y el peso en gramos es de " + (peso * 1000) + "g");
    }
}
