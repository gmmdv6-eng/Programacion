
package Enunciados12;

import java.util.Scanner;

public class Enun12Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        // Esta variable indica si los numeros estan ordenados
        boolean ordenada = true;

        // Pedimos una cadena de numeros
        System.out.println("Introduce una cadena de numeros:");
        cadena = sc.nextLine();

        // Comprobamos que solo contenga digitos y que tenga al menos uno
        if (cadena.matches("[0-9]+")) {

            // Recorremos la cadena comparando cada digito con el siguiente
            // No llegamos hasta length() porque comparamos con i + 1
            for (int i = 0; i < cadena.length() - 1; i++) {

                // Si el digito actual es mayor o igual que el siguiente, no esta ordenada
                if (cadena.charAt(i) >= cadena.charAt(i + 1)) {
                    ordenada = false;
                }
            }

            // Mostramos si la cadena esta ordenada o no
            if (ordenada) {
                System.out.println("La cadena esta ordenada");
            } else {
                System.out.println("La cadena no esta ordenada");
            }

        } else {
            // Si contiene letras, espacios u otros simbolos, no es valida
            System.out.println("Solo puedes introducir numeros");
        }

        sc.close();
    }
}
