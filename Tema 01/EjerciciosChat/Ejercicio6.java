public class Ejercicio6 {
    public static void main(String[] args) {
        String[][] matriz = {
                { "2$$&", "02$4$0&", "00$$22&&", "8&$" },
                { "10$$82&", "02", "4$0$0&", "246$$&" }
        };
        String patron = "[02468\\$&]{3,10}";
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Recorre palabara a palabra
                String cadena = matriz[i][j];
                int contadorDolar = 0;
                int contadorAndpersands = 0;
                // recorre letra a letra
                for (int k = 0; k < cadena.length(); k++) {
                    char letra = cadena.charAt(k);
                    if (letra == '$') {
                        contadorDolar++;
                    }else if (letra == '&') {
                        contadorAndpersands++;
                    }
                }
                // aqui verifico las condiciones del enunciado y sumo contador
                if (cadena.matches(patron) && contadorDolar > contadorAndpersands) {
                    contador++;
                }
            }
        }
        System.out.println(contador);
    }
}
