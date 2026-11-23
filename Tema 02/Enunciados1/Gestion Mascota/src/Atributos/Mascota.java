package Atributos;

public class Mascota {
public String nombre;
public String especie;
public int edad;
public double peso;



public Mascota() {
}



public Mascota(String nombre, String especie, int edad, double peso) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
    this.peso = peso;
}

public void mostrarInformacion (){
    System.out.println("El nombre es: " + nombre);
    System.out.println("La especie es: " + especie);
    System.out.println("Su edad es: " + edad);
    System.out.println("Su peso es: " + peso);
}

public void crecer (int años){
   edad += años;
}

public void AumentarPeso (double cantidad){
    peso += cantidad;
}

}
