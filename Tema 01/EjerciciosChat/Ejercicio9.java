import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion;

        double importeTotalVentas = 0;
        int totalVentas = 0;

        while (continuar) {
            try {
                System.out.println("MENU");
                System.out.println("1. Registrar una venta");
                System.out.println("2. Mostrar total ventas ");
                System.out.println("3. Mostrar estadisticas");
                System.out.println("4. Salir");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        double importe;
                        System.out.println("Dime el importe que vas a hacer");
                        importe = sc.nextDouble();
                        if (importe > 0) {
                            System.out.println("Guardado correctamente");
                            importeTotalVentas = importeTotalVentas + importe;
                            totalVentas++;
                        } else {
                            System.out.println("Error");
                        }
                        break;
                    case 2:
                        System.out
                                .println("El importe total acumulado de ventas es de " + importeTotalVentas + " euros");
                        break;
                    case 3:
                        System.out.println("Has hecho un total de " + totalVentas + " ventas");
                        System.out.println("El importe total vendido es de " + importeTotalVentas + " euros");
                        if (totalVentas > 0) {
                            double media = importeTotalVentas / totalVentas;
                            System.out.println("El importe medio de ventas es " + media + " euros");
                        } else {
                            System.out.println("Todavia no se han realizado ventas");
                        }
                        break;
                    case 4:
                        System.out.println("Saliendo del programa");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Error introduce un numero");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error no es valido");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
