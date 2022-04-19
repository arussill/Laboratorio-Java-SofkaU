package lab.Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Ingrese una frase adicional: ");
        String frase = leer.nextLine();
        texto = texto.replace("a","e") +" "+ frase;
        System.out.println(texto);
    }
}
