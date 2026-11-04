package Apuntes;

public class ExpresionesRegulares {
  public static void main(String[] args) {
        String cadena1 = "Prueba";
        String correo = "prueba@prueba.com";
        String movil = "678678678";
        String nombre = "María";
        String cadena2 = "2134-34-123";

        if (cadena1.contains("ueb")) {
            System.out.println("Subcadena contenida");
        } else {
            System.out.println("Subcadena NO contenida");
        }

        // + es mínimo 1 y máximo infinito
        // . es especial, porque siginifica "cualquier símbolo"
        // Para referirnos literalmente al "." hay que poner \\.
        if (correo.matches("[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+")) {
            System.out.println("El correo está bien");
        } else {
            System.out.println("El correo está mal");
        }

        //<6/7><0-9>*5
        // {número exacto de veces}
        // {min, max}
        if (movil.matches("[67][0-9]{5}")) {
            System.out.println("Móvil bien");
        } else {
            System.out.println("Móvil mal");
        }

        // * es mínimo 0 y máximo infinito
        if (nombre.matches("[A-Z][a-z]*")) {
            System.out.println("Nombre bien");
        }

        // \\p{L} cualquier letra de cualquier alfabeto
        if (nombre.matches("[\\p{L}]+")) {
            System.out.println("Nombre bien");
        }

        String[] partes = cadena2.split("-");

        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
        // "2134-34-123" -> {"2134, "34", "123"}
    }
}
