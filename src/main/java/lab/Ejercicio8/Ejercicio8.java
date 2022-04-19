package lab.Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String diaSemana;
        System.out.println("Ingrese un numero para escoger el día de la semana \n" +
                "1. Lunes \n" +
                "2. Martes \n" +
                "3. Miercoles \n" +
                "4. Jueves \n" +
                "5. Viernes \n" +
                "6. Sabado \n" +
                "7. Domingo");
        diaSemana = leer.nextLine();
        switch (diaSemana) {
            case "1":
                System.out.println("Día Laboral");
                break;
            case "2":
                System.out.println("Día Laboral");
                break;
            case "3":
                System.out.println("Día Laboral");
                break;
            case "4":
                System.out.println("Día Laboral");
                break;
            case "5":
                System.out.println("Día Laboral");
                break;
            case "6":
                System.out.println("Día no Laboral");
                break;
            case "7":
                System.out.println("Día no Laboral");
                break;
        }
    }
}
