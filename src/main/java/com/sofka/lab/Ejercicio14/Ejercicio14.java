package com.sofka.lab.Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
        for (int i = numero; numero <= 1000; i++){
            System.out.println(numero);
            numero += 2;
        }
    }
}
