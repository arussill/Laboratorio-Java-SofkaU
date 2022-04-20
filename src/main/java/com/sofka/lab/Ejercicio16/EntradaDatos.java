package com.sofka.lab.Ejercicio16;

import java.util.Scanner;

public class EntradaDatos {
    //    Entrada de datos
    private Scanner leer = new Scanner(System.in);
    String nombre;
    String edad;
    char sexo;
    double peso;
    double altura;

    public EntradaDatos() {
        System.out.println("Ingrese nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese edad: ");
        edad = leer.nextLine();
        System.out.println("Ingrese sexo, H para hombre y M para mujer: ");
        sexo = leer.nextLine().charAt(0);
        System.out.println("Ingrese peso en Kg: ");
        peso = Double.parseDouble(leer.nextLine());
        System.out.println("Ingrese altura en m: ");
        altura = Double.parseDouble(leer.nextLine());
    }
}
