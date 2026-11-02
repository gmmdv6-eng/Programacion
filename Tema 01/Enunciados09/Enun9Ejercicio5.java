
package Enunciados9;

import java.util.Scanner;

public class Enun9Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int totalNumeros = 0;
        int sumaTotal = 0;
        double mediaAritmetica;
        int mayor;
        int menor;

        System.out.println("Introduce un numero");
        num = sc.nextInt();

        if (num >= 0) {

            // Inicializar mayor y menor con el primer numero
            mayor = num;
            menor = num;

            do {
                // Contador
                // Contar el numero
                totalNumeros++;
                // Acumulador
                // Sumar el numero
                sumaTotal = sumaTotal + num;
                // Comparador
                // Comprobar si es mayor
                if (num > mayor) {
                    mayor = num;
                }
                // Comparador
                // Comprobar si es menor
                if (num < menor) {
                    menor = num;
                }

                System.out.println("Dime otro numero");
                num = sc.nextInt();

            } while (num >= 0);

            // Calcular la media
            mediaAritmetica = (double) sumaTotal / totalNumeros;

            // Mostrar resultados
            System.out.println("Total de numeros: " + totalNumeros);
            System.out.println("Suma total: " + sumaTotal);
            System.out.println("Media: " + mediaAritmetica);
            System.out.println("Numero mayor: " + mayor);
            System.out.println("Numero menor: " + menor);

        } else {
            System.out.println("No has introducido ningun numero valido");
        }

        sc.close();
    }
}
