package Enunciados6;
import java.util.Scanner;

public class Ejercicio6_1 {
    public static void main(String[] args) {
        double saldoInicial = 541.83;
        double ingreso;
        double retiro;
        String nombre;
        int pin;
        int opcion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al cajero");
        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre + " debe introducir su pin ahora");
        pin = sc.nextInt();
        if (pin == 1234) {
            do {

                System.out.println("El pin es correcto que desea hacer ahora " + nombre + " ?");
                System.out.println("Dime que quiere hacer");
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Calcular efectivo");
                System.out.println("0. Salir del cajero");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Cuanto dinero quiere ingresar");
                        ingreso = sc.nextDouble();
                        if (ingreso > 0) {
                            saldoInicial += ingreso;
                            System.out.println("Su nuevo saldo es de " + saldoInicial + " euros");
                        } else {
                            System.out.println("Operacion invalida");
                        }
                        break;
                    case 2:
                        System.out.println("Cuanto dinero quiere retirar");
                        retiro = sc.nextDouble();
                        if (retiro > 0 && retiro <= saldoInicial) {
                            saldoInicial -= retiro;
                            System.out.println("Su nuevo saldo es de " + saldoInicial + " euros");
                        } else {
                            System.out.println("Operacion invalida");
                        }
                        break;
                    case 3:
                        double resto = saldoInicial;
                        int billete10 = 0;
                        int billete20 = 0;
                        int billete50 = 0;
                        while (resto >= 50) {
                            resto -= 50;
                            billete50++;
                        }
                        while (resto >= 20) {
                            resto -= 20;
                            billete20++;
                        }
                        while (resto >= 10) {
                            resto -= 10;
                            billete10++;
                        }
                        System.out.println("El calculo de su efectivo en total suma");
                        System.out.println(billete50 + " billetes de 50");
                        System.out.println(billete20 + " billetes de 20");
                        System.out.println(billete10 + " billetes de 10");
                        System.out.println("Dinero restante " + resto + " euros");
                        break;
                    case 0:
                        System.out.println("Programa acabado");
                        break;
                    default:
                        System.out.println("Intenta de nuevo");
                        break;
                }
            } while (opcion != 0);
            sc.close();
        } else {
            System.out.println("Pin incorrecto Sesion cerrada");
        }

    }
}