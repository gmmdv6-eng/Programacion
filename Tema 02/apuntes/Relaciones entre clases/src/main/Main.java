package main;

import entidades.Propietario;
import entidades.Vivienda;

// Propietarios : las personas que tienen viviendas
// viviendas que pertenecen a propietarios

public class Main {
    public static void main(String[] args) {
        Propietario prop1 = new Propietario("11111111A", "Juan", "Garcia", "630998756", null);
        Propietario[] propietariosV1 = { prop1 };

        Vivienda vivienda1 = new Vivienda("Madrid", "calle roble 4", 28910, 70.5, 3, propietariosV1);
        Vivienda[] viviendaP1 = { vivienda1 };

        prop1.viviendas = viviendaP1;

        // crear 2 propietarios y 2 vivivendas
        // son pareja y ambos son titulares

        Propietario prop2 = new Propietario("11111111A", "Juan", "Garcia", "630998756", null);
        Propietario[] propietariosV2 = {prop1,prop2 };

        Vivienda vivienda2 = new Vivienda("Madrid", "calle roble 4", 28910, 70.5, 3, propietariosV2);
        Vivienda[] viviendaP2 = { vivienda1, vivienda2 };

        prop2.viviendas = viviendaP2;
        prop1.viviendas = viviendaP2;

        viviendaP2 = prop1.viviendas;
        viviendaP2 = prop2.viviendas;

        // calcula el total de area que suma el propietario 2
        double totalAreas =0;

        for (int i = 0; i < prop2.viviendas.length; i++) {
            totalAreas += prop2.viviendas[i].area;
        }

        System.out.println("El propietario 2 acumula " + totalAreas + " m²");

        // calcula cuantas casas tiene el propietario 2 en localidad Madrid

        int totalMadrid =0;
        String patron = "Madrid";

       

        for (int i = 0; i < prop2.viviendas.length; i++) {
            if (prop2.viviendas[i].localidad.matches(patron)) {
                totalMadrid ++;
        }
        }
        System.out.println("el total de casas que el propietario 2 tiene en Madrid es de "+totalMadrid +" casas");
    
                // calcula cuantas casas tiene el propietario 1 en calle roble de  localidad Madrid
                
    
        int totalRobles =0;
        String patronRobles = "roble";

        for (int i = 0; i < prop1.viviendas.length; i++) {
            if (prop1.viviendas[i].localidad.matches(patron) && prop1.viviendas[i].direccion.contains(patronRobles)) {
                totalRobles ++;
            }
        }
        System.out.println("El total de casas que el propietario 1 tiene en la calle roble de la localidad madrid es de " +totalRobles+ " casas");
    
    
    
    }
}
