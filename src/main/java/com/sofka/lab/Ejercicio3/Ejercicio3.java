package com.sofka.lab.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Double areaCirculo;
        Double radio;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        radio = Double.parseDouble(leer.next());
        areaCirculo = Double.valueOf(Math.round(Math.PI * Math.pow(radio, 2)));
        System.out.println("El area del circulo es: " + areaCirculo);
    }
}
