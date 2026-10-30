
package Enunciados3;

import java.util.Scanner;

public class Enun3Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4;

        System.out.println("Dime el numero 1");
        num1 = sc.nextInt();

        System.out.println("Dime el numero 2");
        num2 = sc.nextInt();

        System.out.println("Dime el numero 3");
        num3 = sc.nextInt();

        System.out.println("Dime el numero 4");
        num4 = sc.nextInt();

        // Primera pareja
        int menor1 = Math.min(num1, num2);
        int mayor1 = Math.max(num1, num2);

        // Segunda pareja
        int menor2 = Math.min(num3, num4);
        int mayor2 = Math.max(num3, num4);

        // Ordenamos los cuatro numeros
        int primero = Math.min(menor1, menor2);
        int cuarto = Math.max(mayor1, mayor2);

        int segundo = Math.min(
                Math.max(menor1, menor2),
                Math.min(mayor1, mayor2)
        );

        int tercero = Math.max(
                Math.max(menor1, menor2),
                Math.min(mayor1, mayor2)
        );

        System.out.println("De menor a mayor:");
        System.out.println(primero);
        System.out.println(segundo);
        System.out.println(tercero);
        System.out.println(cuarto);

        System.out.println("De mayor a menor:");
        System.out.println(cuarto);
        System.out.println(tercero);
        System.out.println(segundo);
        System.out.println(primero);

        sc.close();
    }
}
