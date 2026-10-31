import java.util.Scanner;

public class Enun1Ejercicio2 {
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los cm del primer lado");
        lado1 = sc.nextInt();
        System.out.println("Dime los cm del segundo lado");
        lado2 = sc.nextInt();
        System.out.println("Dime los cm del tercer lado");
        lado3 = sc.nextInt();
        int altura = lado1;
        int base = lado2;
        int perimetro = lado1 +lado2 +lado3;
        int area = (base * altura) / 2;
        System.out.println("El perimetro del triangulo es: " + perimetro + " cm");
        System.out.println("El area del triangulo es: " + area + " cm");
        
    }
}
