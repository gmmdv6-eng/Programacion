public class Ejercicio10 {
    public static void main(String[] args) {
        String[][] codigos = {
                { "A12345", "B23456", "C34567" },
                { "D45678", "E56789", "F67890" },
                { "G78901", "H89012", "I90123" }
        };
        String patron = "[A-Z]{1}[0-9]{5}";
        int contadorCoincidencia = 0;
        for (int i = 0; i < codigos.length; i++) {
            for (int j = 0; j < codigos[i].length; j++) {
                String palabra = codigos[i][j];
                int valorUnicodePrimeraLetra = palabra.charAt(0) - 64;

                int ultimoNumero = Integer.parseInt(String.valueOf(palabra.charAt(palabra.length() - 1)));

                if (palabra.matches(patron) && ultimoNumero == valorUnicodePrimeraLetra) {
                    contadorCoincidencia++;
                }
            }
        }
        System.out.println(contadorCoincidencia);
    }
}
