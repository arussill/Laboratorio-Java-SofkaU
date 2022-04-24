package com.sofka.lab.Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Integer respuesta;
        String menu = "****** GESTION CINEMATOGRAFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR\n" +
                "_____________________________________________\n";
        do {
            System.out.println(menu + "Ingrese el numero de alguna de las opciones anteriores: ");
            respuesta = leer.nextInt();
            if (respuesta < 1 || respuesta > 8) {
                System.out.println("Opcion Incorrecta");
            }
        } while (respuesta != 8);
        System.out.println("salio del menu");
    }


}


