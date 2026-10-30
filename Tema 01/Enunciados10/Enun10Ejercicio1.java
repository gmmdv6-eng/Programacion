package Enunciados10;

import java.util.Scanner;

public class Enun10Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.println("Dime una palabra o texto");
        texto = sc.nextLine();

        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'
                    && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                resultado += c;
            }
        }
        System.out.println("Sin vocales: " + resultado);
    }
}
