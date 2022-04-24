package com.sofka.lab.Ejercicio1;

import java.util.Objects;

public class Ejercicio1 {

    public static void main(String[] args) {

        Integer var1 = 1;
        Integer var2 = 19;

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
