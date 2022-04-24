package com.sofka.lab.Ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {
        Datos datos = new Datos();
        Integer totalDeLavadoras = 0;
        Integer totalDeTelevisores = 0;
        Integer totalDeElectrodomesticos = 0;
        Integer subtotalDeElectrodomesticos = 0;

        for (int i = 0; i < datos.listaElectrodomesticos.length; i++) {
            if (datos.listaElectrodomesticos[i] instanceof Lavadora) {
                totalDeLavadoras += datos.listaElectrodomesticos[i].precioFinal();
            }
            if (datos.listaElectrodomesticos[i] instanceof Television) {
                totalDeTelevisores += datos.listaElectrodomesticos[i].precioFinal();
            }
            totalDeElectrodomesticos += datos.listaElectrodomesticos[i].precioFinal();

        }
//        Resultados
        System.out.println("El total para lavadoras es de: " + totalDeLavadoras + "\n" +
                "El total para televisores es de: " + totalDeTelevisores + "\n" +
                "El total de electrodomesticos es de: " + (totalDeElectrodomesticos));
    }
}
