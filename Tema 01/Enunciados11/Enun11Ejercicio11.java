import java.util.Scanner;

public class Enun11Ejercicio11 {
    /*
    EJERCICIO 11
------------
Haz un programa que, dado un array de letras ("char", pero solo letras "a-z" o "A-Z") ordenado de menor a mayor 
(orden alfabético, cuidado con mayúsculas y minúsculas), pida al usuario un valor y diga en qué posición se encuentra (o si no está en el array). 
Para ello, implementa el "algoritmo de búsqueda binaria", que consiste en:
    1. Mirar el elemento de la mitad.
    2. Si es el elemento buscado: encontrado.
    3. Si no, entonces repetir desde el paso uno pero en la mitad inferior o en la superior, dependiendo de si es mayor o menor.
    */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char letra;
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m',
                         'n','o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("Ingrese una letra a buscar: ");
        letra = sc.next().charAt(0);

        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                System.out.println("La letra " + letra + " se encuentra en la posición: " + i);
                break;
            } else if (i == letras.length) {
                System.out.println("La letra " + letra + " no se encuentra en el array.");
                continue;
            }
        }
    }
}
