package Enunciados2;

import java.util.Scanner;

public class Enun2Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué edad tienes?");
        int edad = sc.nextInt();

        System.out.println("¿Es miércoles? (true/false)");
        boolean esMiercoles = sc.nextBoolean();

        int precioBase;

        // 1. Determinar el precio base
        if (edad < 12) {
            precioBase = 5;
        } else if (edad <= 17) {
            precioBase = 7;
        } else if (edad <= 64) {
            precioBase = 10;
        } else {
            precioBase = 6;
        }

        // 2. Calcular el precio final aplicando el descuento dependiendo
        int precioFinal = precioBase;

        if (esMiercoles) {
            precioFinal = precioBase - 2;
            if (precioFinal < 3) {
                precioFinal = 3;
            }
        }
        // 3. Mostramos el resultado final
        if (esMiercoles) {
            System.out.println("El precio base de tu entrada es " + precioBase + " €.");
            System.out.println("Por ser miércoles, el total a pagar es: " + precioFinal + " €.");
        } else {
            System.out.println("El precio de tu entrada es: " + precioFinal + " €.");
        }

        sc.close();

    }
}
