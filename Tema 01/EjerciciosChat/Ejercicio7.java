import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoInicial = 750.50;
        int opcion;
        boolean continuar = true;
        // Las variables de operaciones del menu han de estar fuera del bucle
        // sino me dan error

        double saldo = 0;
        saldo = saldo + saldoInicial;

        double ingreso = 0;
        int contadorIngreso = 0;

        double retiro = 0;
        int contadorRetiro = 0;

        double totalIngresado = 0;
        double totalRetirado = 0;

        while (continuar) {
            try {
                System.out.println("Menu");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Ingresar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Mostrar estadisticas");
                System.out.println("5. Salir");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Tu saldo es " + saldo + " euros");
                        break;
                    case 2:
                        System.out.println("Cuanto quieres ingresar");
                        ingreso = sc.nextDouble();
                        if (ingreso <= 0) {
                            System.out.println("Error");
                        } else {
                            saldo = saldo + ingreso;
                            totalIngresado = totalIngresado + ingreso;

                            contadorIngreso++;
                        }
                        break;
                    case 3:
                        System.out.println("Cuanto quieres retirar");
                        retiro = sc.nextDouble();
                        if (retiro <= 0 || retiro > saldo) {
                            System.out.println("Error");
                        } else {
                            saldo = saldo - retiro;
                            totalRetirado = totalRetirado + retiro;

                            contadorRetiro++;
                        }
                        break;
                    case 4:
                        System.out.println("Has hecho " + contadorIngreso + " ingresos");
                        System.out.println("Has hecho " + contadorRetiro + " retiros");
                        System.out.println("Has ingresado " + totalIngresado + " euros");
                        System.out.println("Has retirado en total " + totalRetirado + " euros");
                        break;
                    case 5:
                        System.out.println("Saliendo del programa");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error");
                // esto me limpia el bucle infinito si alguien escribe cosas por el teclado
                sc.nextLine();
            }
        }
        sc.close();
    }
}
