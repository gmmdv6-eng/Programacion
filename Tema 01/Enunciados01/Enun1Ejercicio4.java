import java.util.Scanner;

public class Enun1Ejercicio4 {
    public static void main(String[] args) {
        double radio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el radio de una circunferencia:");
        radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("La longitud de la circunferencia es: " + longitud + " cm");
        System.out.println("El área del círculo es: " + area + " cm²");

        sc.close();
    }
}
