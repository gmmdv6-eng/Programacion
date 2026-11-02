package soluciones_enunciados_9;

import java.util.Random;
import java.util.Scanner;

public class Enun9Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIntento;
        Random rand = new Random();
        int numAleatorio = rand.nextInt(0, 101);

        do {
            System.out.print("Introduce el intento: ");
            numIntento = sc.nextInt();
            
            if (numAleatorio > numIntento) {
                System.out.println("El número secreto está por encima");
            } else if (numAleatorio < numIntento) {
                System.out.println("El número secreto está por debajo");
            } else {
                System.out.println("HAS ACERTADO!");
            }

        } while (numIntento != numAleatorio);

        sc.close();
    }

}
