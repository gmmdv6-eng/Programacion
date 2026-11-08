public class Ejercicio8 {
    public static void main(String[] args) {
        String[][] matriculas = {
                { "1234ABC", "5678BCD", "9012XYZ" },
                { "2345DEF", "6789GHI", "3456JKL" },
                { "7890MNO", "4567PQR", "0123STU" }
        };
        String patron = "[0-9]{4}[A-Z]{3}";
        int contadorValidas = 0;
        for (int i = 0; i < matriculas.length; i++) {
            for (int j = 0; j < matriculas[i].length; j++) {
                // para recorrer el array
                String palabra = matriculas[i][j];
                for (int k = 0; k < palabra.length(); k++) {
                    char letra;
                    // para recorrer las letras
                    // de las palabras del array
                    letra = palabra.charAt(k);
                }
                // palabra.length() obtiene la longitud del String.
                // palabra.length() - 1 obtiene la posición del último carácter.
                // charAt(...) obtiene ese carácter.
                // - 65 resta 65 a su valor Unicode.
                int valorUnicode = palabra.charAt(palabra.length() - 1) - 65;
                char primerCaracter = palabra.charAt(0);
                int primerNumero = Integer.parseInt(String.valueOf(primerCaracter));

                if (palabra.matches(patron) && primerNumero == valorUnicode) {
                    contadorValidas++;
                }

            }
        }
        System.out.println("Hay " + contadorValidas + " matriculas validas");
    }
}
