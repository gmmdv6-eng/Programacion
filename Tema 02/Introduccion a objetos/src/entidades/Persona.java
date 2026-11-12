package entidades;

import java.time.LocalDate;

// Esta es la definiciion de cualquier persona
public class Persona {
    // Atributos:
    public String nombre;   //  <----this. algo hace referencia a 
    public String apellido1;
    public String apellido2;
    public LocalDate nacimiento;
    public boolean casada;
    //"public es un modificador de acceso"
    // significa que se puede acceder a el
    // atributo para ver/ modificar siempre


    // Metodos:

    // Constructor
    public Persona(){

    }
        public Persona(String nombre, String apellido1, String apellido2, LocalDate nacimiento, boolean casada) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nacimiento = nacimiento;
        this.casada = casada;
    }{

    }
}
