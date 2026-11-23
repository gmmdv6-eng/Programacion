package Main;

import java.util.Scanner;

import entidades.Coche;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Coche coche1 = new Coche();

        System.out.println("Dime la matricula del coche");
        coche1.matricula = sc.nextLine();
        System.out.println("Dime el numero de ruedas del coche");
        coche1.numRuedas = sc.nextInt();
        System.out.println("Dime las plazas del coche");
        coche1.numPlazas = sc.nextInt();
        System.out.println("Dime los km del coche");
        coche1.kilometrosRecorridos = sc.nextInt();
        sc.nextLine();
        System.out.println("Esta arrancado");
        coche1.encendido = sc.nextLine().equalsIgnoreCase("si") ? true : false;
        System.out.println("Dime la capacidad del deposito");
        coche1.capacidad = sc.nextInt();
        sc.close();
        System.out.println("matricula" + coche1.matricula + "\nRuedas" + coche1.numRuedas + "\nPlazas" + "\nKilometros "
                + coche1.kilometrosRecorridos + "\nEstado"
                + (coche1.encendido ? "encendido" : "apagado" + "\n Capacidad deposito" + coche1.capacidad));
    }
}
