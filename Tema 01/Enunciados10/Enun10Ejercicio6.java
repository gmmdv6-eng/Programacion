package Enunciados10;

import java.util.Scanner;

public class Enun10Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contadorVocales = 0;
        int contadorDigitos = 0;
        System.out.println("Dime una palabra");
        cadena = sc.nextLine();
        // cadena.length() nos dice cuántos caracteres tiene la palabra.
        // j va recorriendo las posiciones.
        // char c guarda el carácter de cada posición.
        for (int j = 0; j < cadena.length(); j++) {
            char c = cadena.charAt(j);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contadorVocales++;
            }
            if (c >= '0' && c <= '9') {
                contadorDigitos++;
            }
        }
        System.out.println("Tiene "+ contadorVocales +" vocales");
        System.out.println("Tiene "+ contadorDigitos +" digitos");
    }
}
