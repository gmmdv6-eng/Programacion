
package soluciones_enunciados_10;

import java.util.Scanner;

public class Enun10Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabraSecreta = "casa";
        String letrasIntentadas = "";
        String letra;
        String palabra;
        String progreso;

        int intentos = 0;
        int errores = 0;
        int i;

        boolean salir = false;
        boolean acertada;

        System.out.println("¡Empieza el juego!");

        // Mientras queden intentos y no salir se "false", hacer bucle...
        while (intentos < 10 && !salir) {
            System.out.print("\nIntroduce una letra: ");
            letra = teclado.nextLine();

            if (letra.equals("!")) {
                // Elige terminar los intentos de forma voluntaria
                salir = true;
            } else if (letra.length() == 1) {
                // Control de errores por si pulso ENTER sin meter
                // nada o metio más de 1 letra.

                if (!letrasIntentadas.contains(letra)) {
                    letrasIntentadas += letra;
                    intentos++;

                    acertada = false;
                    progreso = "";

                    // Bucle que crea la cadena que se muestra con '_' (huecos) y letras acertadas
                    // "progreso" se encarga de guardar estos huecos y letras
                    for (i = 0; i < palabraSecreta.length(); i++) {

                        // "letra" es String, así que con "charAt(0)"
                        // obtenemos el único "char" que tiene
                        if (palabraSecreta.charAt(i) == letra.charAt(0)) {
                            progreso += letra;
                            acertada = true;
                        } else if (letrasIntentadas.contains("" + palabraSecreta.charAt(i))) {
                            progreso += palabraSecreta.charAt(i);
                        } else {
                            progreso += "_";
                        }

                    }

                    if (!acertada) {
                        errores++;
                    }

                    System.out.println("\n" + progreso);

                    // Dibujo progresivo del ahorcado
                    System.out.println("  +---+");

                    switch (errores) {
                        case 0:
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            break;

                        case 1:
                            System.out.println("  |   O");
                            System.out.println("  |");
                            System.out.println("  |");
                            break;

                        case 2:
                            System.out.println("  |   O");
                            System.out.println("  |   |");
                            System.out.println("  |");
                            break;

                        case 3:
                            System.out.println("  |   O");
                            System.out.println("  |   |");
                            System.out.println("  |   |");
                            break;

                        case 4:
                            System.out.println("  |   O");
                            System.out.println("  |  /|");
                            System.out.println("  |   |");
                            break;

                        case 5:
                            System.out.println("  |   O");
                            System.out.println("  |  /|\\");
                            System.out.println("  |   |");
                            break;

                        case 6:
                            System.out.println("  |   O");
                            System.out.println("  |  /|\\");
                            System.out.println("  |  /|");
                            break;

                        case 7:
                            System.out.println("  |   O");
                            System.out.println("  |  /|\\");
                            System.out.println("  |  / \\");
                            break;

                        case 8:
                            System.out.println("  |   O");
                            System.out.println("  |  /|\\");
                            System.out.println("  | _/ \\");
                            break;

                        case 9:
                            System.out.println("  |   O");
                            System.out.println("  |  /|\\");
                            System.out.println("  | _/ \\_");
                            break;

                        case 10:
                            System.out.println("  |   X");
                            System.out.println("  |  /|\\");
                            System.out.println("  | _/ \\_");
                            break;
                    }

                    System.out.println("  |");
                    System.out.println("__|__");

                    System.out.println("\nIntentos utilizados: " + intentos + "/10");
                    System.out.println("Errores: " + errores + "/10");
                    System.out.println("Letras intentadas: " + letrasIntentadas);

                    if (errores == 10) {
                        System.out.println("\n¡Se ha completado el ahorcado!");
                        salir = true;
                    }

                } else {
                    System.out.println("Ya has introducido esa letra.");
                }

            } else {
                System.out.println("Introduce una sola letra o ! para terminar.");
            }

        }

        System.out.println("\nDe acuerdo. ¿Cuál es la palabra?");
        System.out.print("Tu respuesta: ");
        palabra = teclado.nextLine();

        if (palabra.equals(palabraSecreta)) {
            System.out.println("\n¡CORRECTO! ¡HAS GANADO!");
        } else {
            System.out.println("\n¡HAS PERDIDO!");
            System.out.println("La palabra era: " + palabraSecreta);
        }

        teclado.close();
    }

}
