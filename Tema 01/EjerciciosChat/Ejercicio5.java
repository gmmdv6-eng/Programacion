public class Ejercicio5 {
    public static void main(String[] args) {
        String[][] matriz = {
                { "JAVA123", "DAM456", "CODIGO789" },
                { "TEST234", "PROGRAM123", "HOLA567" },
                { "EXAMEN321", "CLASE246", "PRUEBA135" }
        };
        String patron = "[A-Z]+[0-9]{3}";
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Importante definir cadena
                String cadena = matriz[i][j];

                // 1 La cadena debe tener una longitud impar.

                if (cadena.length() % 2 != 0) {
                    // es impar
                } else {
                    // es par
                }

                // 2 Debe comenzar por una o más
                // letras mayúsculas y terminar
                // con exactamente tres números.

                if (matriz[i][j].matches(patron)) {
                    // es valido
                }

                // 3 El valor Unicode de la primera letra
                // debe ser igual al número formado por
                // los últimos tres dígitos.

                char primeraLetra = cadena.charAt(0);

                String ultimos3 = matriz[i][j].substring(matriz[i][j].length() - 3);
                int numeros = Integer.parseInt(ultimos3);

                if (cadena.length() % 2 != 0 && cadena.matches(patron) && primeraLetra == numeros) {
                    contador++;
                }

            }
        }
        System.out.println(contador);
    }
}
