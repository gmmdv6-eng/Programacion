
import java.util.Scanner;

public class Enun9Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int peticion;
        int acumulador = 0;
        int intentos = 0;

        do {
            System.out.println("Dime un numero");
            peticion = sc.nextInt();

            acumulador = acumulador + peticion;
            intentos++;

            if (acumulador == 100) {
                System.out.println("100 alcanzado!");
                break;
            }

            if (acumulador > 100) {
                System.out.println("100 sobrepasado");
                break;
            }

        } while (intentos < 10);

        if (acumulador < 100 && intentos == 10) {
            System.out.println("100 no alcanzado");
        }

        sc.close();
    }
}
