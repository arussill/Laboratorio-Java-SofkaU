package com.sofka.lab.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Integer numero;

        do {
            System.out.println("Ingrese un número: ");
            numero = leer.nextInt();
        } while (numero < 0);

    }
}
