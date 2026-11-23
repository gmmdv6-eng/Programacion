package main;

import entidades.Triangulo;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(3, 4, 5, 4);
        Triangulo t2 = new Triangulo(5, 12, 13, 12);
        double perimetroT1 = t1.calculaPerimetro();
        double perimetroT2 = t1.calculaPerimetro();

        t1.mostrarResumen();
        System.out.println("-------");
        t2.mostrarResumen();
        System.out.println("-------");
        System.out.println("¿T1 es mayor que T2?: " + t1.esMAyorQue(t2));
        System.out.println("¿T2 es mayor que T1?: " + t2.esMAyorQue(t1));

    }
}
