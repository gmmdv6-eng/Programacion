package Main;

import java.util.Scanner;

import Atributos.Mascota;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Registro del constructor completo por Inicializado en codigo
        // NO por consola
        // Mascota mascota1 = new Mascota(null, null, 0, 0);
        Mascota mascota2 = new Mascota();

        int opciones;
        
        boolean continuar = true;

        // Registro de el objeto mascota2 en el constructor vacio

        System.out.println("Dime el nombre de la mascota");
        mascota2.nombre = sc.nextLine();
        System.out.println("Dime la especie de la mascota");
        mascota2.especie = sc.nextLine();
        System.out.println("Dime la edad de la mascota");
        mascota2.edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el peso de la mascota");
        mascota2.peso = sc.nextDouble();
        sc.nextLine();

   
            try {

                do {
                    System.out.println("Menu");
                    System.out.println("1. Mostrar informacion");
                    System.out.println("2. Crecer mascota");
                    System.out.println("3. Comer");
                    System.out.println("4. Salir");
                    opciones = sc.nextInt();

                    switch (opciones) {
                        case 1:
                            mascota2.mostrarInformacion();
                            break;
                        case 2:
                            int edadNueva;
                            System.out.println("Dime la edad nueva");
                            edadNueva = sc.nextInt();
                            mascota2.crecer(edadNueva);
                            break;
                        case 3:
                            double cantidad;
                            System.out.println("Dime el peso nuevo");
                            cantidad = sc.nextDouble();
                            mascota2.AumentarPeso(cantidad);
                            break;
                        case 4:
                            System.out.println("Saliendo del menú");
                            continuar = false;
                            break;

                        default:
                            System.out.println("Introduce un numero");
                            break;
                    }
                } while (continuar);
            } catch (Exception e) {
                System.out.println("error");
                sc.nextLine();
            }
        

        sc.close();
    }
}
