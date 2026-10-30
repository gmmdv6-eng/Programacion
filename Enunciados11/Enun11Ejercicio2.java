package Enunciados11;

public class Enun11Ejercicio2 {
    public static void main(String[] args) {
        int numEnteros[] = { 5, 3, 9, 8 };

        int max = numEnteros[0];
        int min = numEnteros[0];

        for (int i = 0; i < numEnteros.length; i++) {
            if (numEnteros[i] > max) {
                max = numEnteros[i];
            }
            if (numEnteros[i] < min) {
                min = numEnteros[i];
            }
        }

        System.out.println("El número más grande es: " + max);
        System.out.println("El número más pequeño es: " + min);
    }

}
/*
 * for (int i = 0; i < nunEnteros.length; i++) {
 * System.out.println(Math.max(nunEnteros[nunEnteros]));
 * System.out.println(Math.min(nunEnteros[nunEnteros]));
 * }
 */

// Primera pareja
/*
 * int menor1 = Math.min(nunEnteros[0], nunEnteros[1]);
 * int mayor1 = Math.max(nunEnteros[0], nunEnteros[1]);
 * 
 * // Segunda pareja
 * int menor2 = Math.min(nunEnteros[2], nunEnteros[3]);
 * int mayor2 = Math.max(nunEnteros[2], nunEnteros[3]);
 * 
 * // Ordenamos los cuatro numeros
 * int primero = Math.min(menor1, menor2);
 * int cuarto = Math.max(mayor1, mayor2);
 * 
 * System.out.println("El mas pequeño es");
 * System.out.println(primero);
 * 
 * System.out.println("El mas grande es");
 * System.out.println(cuarto);
 */
