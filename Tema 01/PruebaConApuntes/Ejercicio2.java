package PruebaConApuntes;

public class Ejercicio2 {
    public static void main(String[] args) {
        String matriz[][] = {
                { "PRUEBA80", "OTRA_PRUEBA", "OTRAPRUEBA79" },
                { "ESTAMAL69", "ESTABIEN69", "$oTRAMAL70" }
        };
        String patron = "[A-Z]+[0-9]{2}";
        int contadorValidas = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String palabra = matriz[i][j];
                int valorUnicode = palabra.charAt(0);
                int posicion = valorUnicode - 64;
                char ultimoCaracter = palabra.charAt(palabra.length()-1);
                int ultimoNumero = Integer.parseInt(String.valueOf(palabra.charAt(palabra.length()-1)));

                if (palabra.length() % 2 == 0 && palabra.matches(patron) && ultimoNumero == posicion) {
                    contadorValidas++;
                }
            }
        }
        System.out.println(contadorValidas);
    }
}
