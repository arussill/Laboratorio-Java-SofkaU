package lab.Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primera palabra: ");
        String palabra1 = leer.nextLine();
        System.out.println("Ingrese segunda palabra: ");
        String palabra2 = leer.nextLine();
        int longitud = palabra1.length();

        condicion(palabra1, palabra2, longitud);

    }

    private static void condicion(String palabra1, String palabra2, int longitud) {
        if (!(palabra1.equals(palabra2))) {
            condicion1(palabra1, palabra2, longitud);
        }
        System.out.println("Las 2 palabras son iguales");
    }

    private static void condicion1(String palabra1, String palabra2, int longitud) {
        if (longitud == palabra2.length()) {
            System.out.println("Las 2 palabras son diferentes." + "\nPalabras: " + palabra1 + "|" + palabra2);
            condicion2(palabra1, palabra2, longitud);
        }
        System.out.println("Las palabras no son de la misma longitud no se pueden comparar, no son iguales.");
    }

    private static void condicion2(String palabra1, String palabra2, int longitud) {
        for (int i = 0; i < longitud; i++) {
            if (palabra1.charAt(i) != palabra2.charAt(i)) {
                System.out.println("Letras diferentes: " + palabra1.charAt(i) + "|" + palabra2.charAt(i) + " (Indice:" + i + ")");
            }
        }
    }
}
