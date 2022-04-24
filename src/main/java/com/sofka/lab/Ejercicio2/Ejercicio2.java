package com.sofka.lab.Ejercicio2;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Integer var1;
        Integer var2;

        System.out.println("Ingrese el valor de la variable 1");
        var1 = leer.nextInt();
        System.out.println("Ingrese el valor de la variable 2");
        var2 = leer.nextInt();

        if (Objects.equals(var1, var2)) {
            System.out.println("Las dos variables son iguales");
        }
        if (var1 > var2) {
            System.out.println("La variable 1 es mayor que la variable 2");
        }
        if (var1 < var2) {
            System.out.println("La variable 2 es mayor a la variable 1");
        }
    }
}
