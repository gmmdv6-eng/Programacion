
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena;
        int contadorDigitos = 0;
        int suma = 0;
        int mayor = 0;
        int pares = 0;
        int impares = 0;

        // Pedimos una cadena hasta que cumpla las condiciones:
        // Debe contener únicamente números y tener entre 5 y 10 dígitos.
        do {
            System.out.print("Introduce una cadena valida: ");
            cadena = sc.nextLine();
        } while (!cadena.matches("[0-9]{5,10}"));

        System.out.println("Cadena correcta");

        // Recorremos todos los caracteres de la cadena.
        for (int i = 0; i < cadena.length(); i++) {

            // Obtenemos el carácter que se encuentra en la posición i.
            char c = cadena.charAt(i);

            // Convertimos el carácter numérico en un número entero.
            int digito = c - '0';

            // Sumamos el dígito al acumulador.
            suma += digito;

            // Comprobamos si el dígito es mayor que el máximo actual.
            if (digito > mayor)
                mayor = digito;

            // Comprobamos si el dígito es par o impar.
            if (digito % 2 == 0)
                pares++;
            else
                impares++;

            // Contamos la cantidad total de dígitos.
            if (c >= '0' && c <= '9') {
                contadorDigitos++;
            }
        }

        // Mostramos todos los resultados obtenidos.
        System.out.println("Tiene " + contadorDigitos + " digitos");
        System.out.println("Suma de los digitos: " + suma);
        System.out.println("Digito mayor: " + mayor);
        System.out.println("Digitos pares: " + pares);
        System.out.println("Digitos impares: " + impares);
    }
}
