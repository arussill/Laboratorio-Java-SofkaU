package com.sofka.lab.Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Desea saber fecha y hora? (s/n):  ");
        String respuesta = leer.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime dateTimeNow = LocalDateTime.now();
            System.out.println("La fecha y hora actual es: " + formato.format(dateTimeNow));
        }

    }
}
