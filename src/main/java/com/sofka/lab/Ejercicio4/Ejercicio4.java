package com.sofka.lab.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Double iva = 0.21;// IVA = 21%
        Double producto;
        Double precioFinal;

        System.out.println("Ingrese el precio del porducto: ");
        producto = Double.parseDouble(leer.next());
        precioFinal = producto + (producto * iva);
        System.out.println("El valor del producto con impuesto es de: " + precioFinal);
    }
}
