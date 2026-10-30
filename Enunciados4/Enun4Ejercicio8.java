package Enunciados4;

import java.util.Scanner;

public class Enun4Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exp, copiaExp, potencia = 1;

        System.out.println("Dime base");
        base = sc.nextInt();
        System.out.println("dime exponente");
        exp = sc.nextInt();
        copiaExp = exp;
        while (exp > 0) {
            potencia *= base; // potencia = potencia*base
            exp--; // -1
            System.out.println(base + "elevado " + copiaExp + "es igual a" + potencia);
        }
    }
}
