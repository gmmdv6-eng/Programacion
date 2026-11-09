package PruebaConApuntes;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int pas = 0, pad = 0;
        double pam;
        String nombre;
        boolean datoCorrecto = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        nombre = scanner.nextLine();

        while (datoCorrecto == false) {
            System.out.print("Introduce tu PAS: ");

            try {
                pas = scanner.nextInt();
                
                if (pas < 0) {
                    System.out.println("ERROR: valor negativo.");
                } else {
                    datoCorrecto = true;
                }

            } catch (Exception e) {
                System.out.println("ERROR: dato no correcto.");
                scanner.nextLine();
            }

        }

        datoCorrecto = false;

        while (datoCorrecto == false) {
            System.out.print("Introduce tu PAD: ");

            try {
                pad = scanner.nextInt();
                
                if (pad < 0) {
                    System.out.println("ERROR: valor negativo.");
                } else {
                    datoCorrecto = true;
                }

            } catch (Exception e) {
                System.out.println("ERROR: dato no correcto.");
                scanner.nextLine();
            }

        }

        scanner.close();

        pam = (pas + 2 * pad) / 3.0;

        System.out.println("Nombre: " + nombre);
        System.out.println("PAS: " + pas + " mmHg");
        System.out.println("PAD: " + pad + " mmHg");
        System.out.println("PAM: " + pam + " mmHg");
        System.out.print("Estado: ");

        if (pam < 70) {
            System.out.println("Hipotensión");
        } else if (pam > 105) {
            System.out.println("Hipertensión");
        } else {
            System.out.println("Normal");
        }

    }

}
