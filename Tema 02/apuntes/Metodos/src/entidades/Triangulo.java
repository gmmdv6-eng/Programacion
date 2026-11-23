package entidades;

public class Triangulo {
    public double lado1;
    public double lado2;
    public double lado3;
    public double  alturaLado1;
    
    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3, double alturaLado1) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.alturaLado1 = alturaLado1;
    }
    
    // Estructura de cualquier metodo
    // Modificador tipo de retorno identificador parentesis {
    // ......
    //}

    public double calculaPerimetro () {
        return lado1 + lado2 +lado3;
    }
    
    public double calcularArea(){
        return lado1 * alturaLado1 /2;
    }

    public void mostrarResumen (){
        System.out.println("Lado 1: " + lado1
            + "\nLado 2: " + lado2
            + "\nLado 3: " + lado3
            + "\nAltura (lado 1)" +alturaLado1
            + "\nPerimetro: " + calculaPerimetro()
            + "\nArea: " + calcularArea()
        );
    }

    public boolean esMAyorQue (Triangulo otro){
        return calcularArea() > otro.calcularArea();
    }
}
