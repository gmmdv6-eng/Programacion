package Enunciados11;

public class Enun11Ejercicio7 {
    public static void main(String[] args) {
        String[] matriz = { "algo, papa ,chapa" };
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = matriz[i].replaceAll("[aA]", "");
            System.out.println(matriz[i]);
        }
    }
}
