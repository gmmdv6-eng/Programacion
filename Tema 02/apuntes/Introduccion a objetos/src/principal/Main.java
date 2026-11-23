package principal;

import java.time.LocalDate;

// Al estar "Persona.java" en otro paquete
// Hay que importarla
import entidades.Persona;

public class Main {

    public static void main(String[] args) {
        Persona per1 = new Persona();
        LocalDate nacimientoPer2 = LocalDate.of(1997, 11, 8);
        Persona per2 = new Persona("Maria", "Lopez", "Sanz", nacimientoPer2, true);

        // Si intentamos ver los valores de los atributos
        // al no haber establecido ninguno tendran el
        // valor por defecto segunsu tipo
        // int double (numeros) sera 0
        // boolean sera false
        // char sera 0
        // cualquier clase sera null

        System.out.println("Nombre " + per1.nombre);
        System.out.println("Apellido 1 " + per1.apellido1);
        System.out.println("Apellido 2 " + per1.apellido2);
        System.out.println("Nacimiento " + per1.nacimiento);
        System.out.println("Casada " + per1.casada);

        // ponemos datos
        per1.nombre = "Juan";
        per1.apellido1 = "Garcia";
        per1.apellido2 = "Perez";
        per1.nacimiento = LocalDate.of(2000, 3, 20);
        per1.casada = false;

        System.out.println("Nombre " + per1.nombre);
        System.out.println("Apellido 1 " + per1.apellido1);
        System.out.println("Apellido 2 " + per1.apellido2);
        System.out.println("Nacimiento " + per1.nacimiento);
        System.out.println("Casada " + per1.casada);

        System.out.println("Nombre " + per2.nombre);
        System.out.println("Apellido 1 " + per2.apellido1);
        System.out.println("Apellido 2 " + per2.apellido2);
        System.out.println("Nacimiento " + per2.nacimiento);
        System.out.println("Casada " + per2.casada);

    }
}