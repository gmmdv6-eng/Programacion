package Enunciados7;

import java.util.Scanner;

public class Enun7Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        int intentos = 0;

        System.out.println("Introduce un numero");
        num = sc.nextInt();
        sc.close();

        // mientras la suma no de 1 hay que repetir
        while (suma != 1 && intentos <= 100) {
            // Reset de variable suma
            suma = 0;
            // Bucle para que realice la suma de las potencias
            while (num != 0) {
                int digito = num % 10; // Ultimo digito
                int potencia = (int) Math.pow(digito, 2);

                suma += potencia;

                num /= 10;
            }
            // comprobar que ha dado la suma
            System.out.println("Suma en intento " + intentos + ": " + suma);
            // se actualiza con la suma
            num = suma;

            intentos++;
        }
        if (suma == 1) {
            System.out.println("Es un numero feliz");
        } else {
            System.out.println("No es un numero feliz");
        }

    }
}
