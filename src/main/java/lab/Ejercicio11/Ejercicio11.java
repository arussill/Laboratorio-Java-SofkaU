package lab.Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine().toLowerCase();
        int longitud = frase.length();
        int contador = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.contains("a") || frase.equalsIgnoreCase("e") || frase.equalsIgnoreCase("i")
                    || frase.equalsIgnoreCase("o") || frase.equalsIgnoreCase("u")) {
                contador++;
            }
        }
        System.out.println("La longitud de la frase ingresada es de " + longitud + " y tiene " + contador + " vocales");

    }
}
