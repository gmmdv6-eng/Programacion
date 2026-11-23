package main;

import java.util.Scanner;

import entidades.CuentaBancaria;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria("Gabriel", "123456789", "Damtarde", 10000);
        int opcion;
        boolean continuar = true;

        do {
            System.out.println("Gestion Bancaria");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar datos de la cuenta");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Calcular devaluacion de dinero");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                cuenta1.ingresarDinero(200);
                    break;
                case 2:
                cuenta1.retirarDinero(100);
                    break;
                case 3:
                cuenta1.mostrarDatos();
                    break;
                case 4:
                
                    break;
                case 5:
                
                    break;
                case 6:
                System.out.println("Saliendo de el programa");
                continuar = false;
                    break;

                default:
                    break;
            }
        } while (continuar);
        sc.close();
    }
}
