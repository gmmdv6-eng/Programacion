
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos un array para guardar 8 números enteros.
        int[] numeros = new int[8];

        // Expresión regular que permite números positivos y negativos.
        String patron = "-?[0-9]+";

        // Pedimos los 8 números y comprobamos que sean válidos.
        for (int i = 0; i < 8; i++) {
            String entrada;

            // Repetimos la petición mientras el número no sea válido.
            do {
                System.out.print("Introduce el numero " + (i + 1) + ": ");
                entrada = sc.nextLine();
            } while (!entrada.matches(patron));

            // Convertimos el String en un entero y lo guardamos en el array.
            numeros[i] = Integer.parseInt(entrada);
        }

        // Mostramos todos los números introducidos.
        System.out.println("Numeros introducidos ");

        for (int i = 0; i < 8; i++) {
            // Mostramos un espacio entre números, evitando el último.
            System.out.print(numeros[i] + (i < 7 ? " " : ""));
        }
        System.out.println();

        // Inicializamos el mayor y el menor con el primer elemento del array.
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el array desde la segunda posición para buscar
        // el número más grande y el más pequeño.
        for (int i = 1; i < 8; i++) {
            if (numeros[i] > mayor)
                mayor = numeros[i];

            if (numeros[i] < menor)
                menor = numeros[i];
        }

        // Mostramos el mayor y el menor.
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        // Calculamos la suma de todos los elementos del array.
        int suma = 0;

        for (int i = 0; i < 8; i++) {
            suma += numeros[i];
        }

        // Convertimos la suma a double para obtener decimales en la división.
        double media = (double) suma / 8;

        System.out.println("Media: " + media);

        // Creamos tres contadores para positivos, negativos y ceros.
        int positivos = 0, negativos = 0, ceros = 0;

        // Recorremos el array y clasificamos cada número.
        for (int i = 0; i < 8; i++) {
            if (numeros[i] > 0)
                positivos++;
            else if (numeros[i] < 0)
                negativos++;
            else
                ceros++;
        }

        // Mostramos la cantidad de positivos, negativos y ceros.
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        // Creamos una copia del array original para ordenarla sin modificarlo.
        int[] ordenado = numeros.clone();

        // Ordenamos la copia de menor a mayor mediante el método burbuja.
        for (int i = 0; i < ordenado.length - 1; i++) {

            // Comparamos elementos consecutivos del array.
            // En cada pasada se coloca el mayor al final.
            for (int j = 0; j < ordenado.length - 1 - i; j++) {

                // Si el elemento actual es mayor que el siguiente,
                // intercambiamos sus posiciones.
                if (ordenado[j] > ordenado[j + 1]) {
                    int aux = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = aux;
                }
            }
        }

        // Mostramos el array una vez terminado el ordenamiento.
        System.out.println("Numeros ordenados:");

        for (int i = 0; i < ordenado.length; i++) {
            System.out.print(ordenado[i] + " ");
        }
    }
}
