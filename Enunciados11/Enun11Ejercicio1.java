package Enunciados11;

public class Enun11Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = { 6, 8, 55, 70 };
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento nº " + i + " = " + numeros[i]);
            suma += numeros[i];
        }
        double media = (double) suma / numeros.length;
        System.out.printf("El resultado de la media es: %.2f\n", media);
    }
}
