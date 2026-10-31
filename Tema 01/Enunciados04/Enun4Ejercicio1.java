package Enunciados4;
import java.util.Scanner;

public class Enun4Ejercicio1 {
    public static void main(String[] args) {
        int num;
        int contador = 1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un numero");
        num=sc.nextInt();
        
        while (contador <= num) {
         
            System.out.println(contador);
            contador++;
        }
    }
}


