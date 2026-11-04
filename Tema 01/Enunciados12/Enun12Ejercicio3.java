
package Enunciados12;

import java.util.Scanner;

public class Enun12Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha;

        // Pedimos una fecha al usuario
        System.out.println("Introduce una fecha (dd/mm/aaaa):");
        fecha = sc.nextLine();

        // Comprobamos que tenga dos digitos para el dia, dos para el mes y cuatro para el año
        if (fecha.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {

            // Separamos la fecha en tres partes utilizando la barra como separador
            String[] partes = fecha.split("/");

            // Convertimos cada parte de String a entero
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int anio = Integer.parseInt(partes[2]);

            // Variable que indica si la fecha es correcta
            boolean valida = false;

            // Comprobamos que el mes esté entre 1 y 12
            if (mes >= 1 && mes <= 12) {

                // Meses que tienen 31 dias
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                        || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >= 1 && dia <= 31) {
                        valida = true;
                    }

                // Meses que tienen 30 dias
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 1 && dia <= 30) {
                        valida = true;
                    }

                // Comprobamos febrero
                } else if (mes == 2) {

                    // Comprobamos si el año es bisiesto
                    if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
                        // Febrero tiene 29 dias si el año es bisiesto
                        if (dia >= 1 && dia <= 29) {
                            valida = true;
                        }
                    } else {
                        // Febrero tiene 28 dias si el año no es bisiesto
                        if (dia >= 1 && dia <= 28) {
                            valida = true;
                        }
                    }
                }
            }

            // Mostramos el resultado de las comprobaciones
            if (valida) {
                System.out.println("La fecha es valida");
            } else {
                System.out.println("La fecha no es valida");
            }

        } else {
            // Si no cumple el formato, no seguimos comprobando
            System.out.println("Formato incorrecto");
        }

        sc.close();
    }
}
