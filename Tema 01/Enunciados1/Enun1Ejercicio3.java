import java.util.Scanner;

public class Enun1Ejercicio3 {
    public static void main(String[] args) {

        int jugador1, jugador2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador 1, introuce un numero 1 para piedra 2 para papel 3 para tijera");
        jugador1 = sc.nextInt();
        System.out.println("Jugador 2, introuce un numero 1 para piedra 2 para papel 3 para tijera");
        jugador2 = sc.nextInt();

        if (jugador1 == jugador2) {
            System.out.println("Empate");
        } else if ((jugador1 == 1 && jugador2 == 3) || (jugador1 == 2 && jugador2 == 1)
                || (jugador1 == 3 && jugador2 == 2)) {
            System.out.println("Jugador 1 gana");
        } else {
            System.out.println("Jugador 2 gana");

        }
    }
}