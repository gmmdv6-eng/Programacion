package Enunciados3;

import java.util.Scanner;

public class Enun3Ejercicio4 {
    public static void main(String[] args) {

        int pan;
        int chocolate;
        int refresco;
        int pizza;

        double descuento1 = 0.05;
        double descuento2 = 0.10;

        int edad;

        double precioPan = 0.75;
        double precioChocolate = 1.5;
        double precioRefresco = 0.65;
        double precioPizza = 2.8;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cuantos panes quieres");
        pan = sc.nextInt();
        System.out.println("Dime cuantos chocolates quieres");
        chocolate = sc.nextInt();
        System.out.println("Dime cuantos refrescos quieres");
        refresco = sc.nextInt();
        System.out.println("Dime cuantas porciones de pizza quieres");
        pizza = sc.nextInt();
        System.out.println("Dime tu edad");
        edad = sc.nextInt();

        int cantidadTotal = (pan + chocolate + refresco + pizza);

        double precioFinalPan = (pan * precioPan);
        double precioFinalChocolate = (chocolate * precioChocolate);
        double precioFinalRefresco = (refresco * precioRefresco);
        double precioFinalPizza = (pizza * precioPizza);

        double precioFinalTotal = (precioFinalChocolate + precioFinalPan + precioFinalRefresco + precioFinalPizza);

        if (edad < 12) {
            System.out.println("Como eres menor de 12 años solo se aplica rebaja de 5% de " + (precioFinalTotal)
                    + " euros pasas a " + (precioFinalTotal - (precioFinalTotal * descuento1) + " euros"));
        }
        if (pan >= 1 && chocolate >= 1 && refresco >= 1 && pizza >= 1 && edad >= 12) {
            System.out.println("Se te aplica un 5% de descuento a tu compra de " + precioFinalTotal + " euros siendo "
                    + ((precioFinalTotal - (precioFinalTotal * descuento1))));
        } else if (precioFinalTotal > 10) {
            System.out.println("Como la compra es mayor de 10 euros se te aplica una rebaja del 10% pasas de "
                    + (precioFinalTotal) + " euros a " + (precioFinalTotal - (precioFinalTotal * descuento2)));
        } else {
            System.out.println("Su compra es de " + (precioFinalTotal) + "euros");
        }
        sc.close();
    }
}
