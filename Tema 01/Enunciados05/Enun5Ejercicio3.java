package Enunciados5;

import java.util.Scanner;

public class Enun5Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, copiaNum, cifras = 0, sumaPotencias =0;
        System.out.println("Dime un numero");
        num = sc.nextInt();
        copiaNum = num; // se guarda una copia
        sc.close();

        while (copiaNum != 0) {
            cifras++;
            copiaNum /= 10; // copianum valdra copianum /10
        }

        copiaNum = num; // rescato el valor original

        while (copiaNum != 0) {
            //calculo una potencia

            int digito = copiaNum %10;
            int potencia = (int) Math.pow(digito, cifras);


            // acumula una potencia nueva
            sumaPotencias += potencia;

            copiaNum /=10; //Acorta copianumm
        }
         
        if (sumaPotencias == num){
            System.out.println(num + " es narcisista");
        }else{
            System.out.println(num + " no es narcisista");
        }
    }

}

