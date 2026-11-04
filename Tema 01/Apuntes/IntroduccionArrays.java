package Apuntes;

public class IntroduccionArrays {
public static void main(String[] args) {
    
    // Los arrays son un conjunto de datos del mismo tipo
    // A los que podemos acceder por posicion
    // La primera es la 0
    // La ultima es la longitud menos 1
    int [] numeros = {1, 4, -6, 10};

    // Acceder a un elemento por posicion:
    System.out.println("El primero es " + numeros[0]);
    //.length nos dice cuantos elementos hay
    System.out.println("La longitud es " +numeros.length); 
    System.out.println("El ultimo es " + numeros[numeros.length - 1]);



}
}
