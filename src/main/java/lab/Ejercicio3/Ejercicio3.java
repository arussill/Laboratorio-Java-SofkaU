package lab.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double areaCirculo;
        double radio;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        radio = Double.parseDouble(leer.next());
        areaCirculo = Math.round(Math.PI * Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + areaCirculo);
    }
}
