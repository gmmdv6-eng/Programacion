public class Ejercicio4 {
    public static void main(String[] args) {
        String[][] codigos = {
                { "PRUEBA080", "OTRA079", "HOLA072" },
                { "CASA065", "DAM080", "JAVA074" },
                { "CODIGO067", "TEST084", "EXAMEN069" }
        };
        int contador = 0;
        String patron = "[A-Z]+[0-9]{3}";
        // bucle q recorre el array fila x columna
        // Ojo si no escribo dentro de los 2 for no lo encuentra
        for (int i = 0; i < codigos.length; i++) {
            for (int j = 0; j < codigos[i].length; j++) {

                // 1. Comprobar que la longitud sea impar.
                if (codigos[i][j].length() % 2 != 0) {
                    // es impar
                } else {
                    // es par
                }

                // 2. Comprobar que cumple la expresión regular.
                System.out.println(codigos[i][j].matches(patron));
                // Imprime true en los que sean verificados por la expresion regular
                // Mas que nada es para saber si se cumple o no la expresion a modo prueba o error

                // 3. Obtener el valor Unicode de la primera letra.
                int valorUnicode = codigos[i][j].charAt(0);

                // 4. Obtener los últimos tres números.
                String ultimosNumeros = codigos[i][j].substring(codigos[i][j].length() - 3);
                int numero = Integer.parseInt(ultimosNumeros);

                // 5. Comparar ambos valores.
                if (valorUnicode == numero) {
                    // coinciden
                }

                // 6. Si todo se cumple, aumentar contador.
                if (codigos[i][j].length() % 2 != 0 && codigos[i][j].matches(patron) && valorUnicode == numero ) {
                    contador++;
                }
            }
        }
        System.out.println(contador);
    }
}
