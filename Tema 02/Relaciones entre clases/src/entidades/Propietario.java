package entidades;

public class Propietario {
public String dni;
public String nombre;
public String apellidos;
public String telefono;
public Vivienda[] viviendas;

public Propietario() {
}

public Propietario(String dni, String nombre, String apellidos, String telefono, Vivienda[] viviendas) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.viviendas = viviendas;
}





}
