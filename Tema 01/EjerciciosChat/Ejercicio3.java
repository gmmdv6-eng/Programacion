import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double celsius = 0; // recuerda inicializar variables que se comprueben
        boolean esCorrecto = false;

        System.out.println("Dime tu nombre: ");
        nombre = sc.nextLine();

        // con el try-catch nos aseguramos que
        // el usuario ponga lo que ponga invalido
        // le hacemos repetir haasta que lo haga bien
        // es una condicion para fallo
        while (esCorrecto == false) {
            System.out.println("Introduce lo grados celsius");
            try {
                celsius = sc.nextDouble();
                if (celsius <= 0) {
                    System.out.println("Error no puede ser negativo ");
                } else {
                    esCorrecto = true;
                }
            } catch (Exception e) {
                System.out.println("Error no es valido");
                sc.nextLine();
            }
        }

        // Esto es simplemente cumplir con
        // las condiciones del de temperatura
        double fahrenhein = ((celsius * 1.8) + 32);
        if (celsius < 36) {
            System.out.println(nombre);
            System.out.println(celsius);
            System.out.println(fahrenhein);
            System.out.println("temperatura baja");
        } else if (celsius > 37.5) {
            System.out.println(nombre);
            System.out.println(celsius);
            System.out.println(fahrenhein);
            System.out.println("temperatura elevada");
        } else {
            System.out.println(nombre);
            System.out.println(celsius);
            System.out.println(fahrenhein);
            System.out.println("temperatura normal");
        }
        sc.close();
    }
}
