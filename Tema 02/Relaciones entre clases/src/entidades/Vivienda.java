package entidades;

public class Vivienda {
public String localidad;
public String direccion;
public int codigoPostal;
public double area;
public int numeroResidentes;
public Propietario[] propietarios;

public Vivienda() {
}

public Vivienda(String localidad, String direccion, int codigoPostal, double area, int numeroResidentes,
        Propietario[] propietarios) {
    this.localidad = localidad;
    this.direccion = direccion;
    this.codigoPostal = codigoPostal;
    this.area = area;
    this.numeroResidentes = numeroResidentes;
    this.propietarios = propietarios;
}




}
