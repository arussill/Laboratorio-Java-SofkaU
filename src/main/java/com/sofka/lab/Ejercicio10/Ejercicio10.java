package com.sofka.lab.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        frase = frase.replaceAll(" ", "");
        System.out.println(frase);
    }
}
