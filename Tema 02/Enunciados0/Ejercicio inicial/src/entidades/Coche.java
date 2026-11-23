package entidades;

public class Coche {
    public String matricula;
    public int numRuedas;
    public int numPlazas;
    public int kilometrosRecorridos;
    public boolean encendido;
    public int capacidad;

    

    public Coche() {
    }



    public Coche(String matricula, int numRuedas, int numPlazas, int kilometrosRecorridos, boolean encendido,
            int capacidad) {
        this.matricula = matricula;
        this.numRuedas = numRuedas;
        this.numPlazas = numPlazas;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.encendido = encendido;
        this.capacidad = capacidad;
    }
}
