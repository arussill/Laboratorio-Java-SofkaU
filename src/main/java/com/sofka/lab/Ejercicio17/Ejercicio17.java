package com.sofka.lab.Ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {

        Electrodomesticos[] listaElectrodomesticos = new Electrodomesticos[10];
        int totalDeLavadoras = 0;
        int totalDeTelevisores = 0;
        int totalDeElectrodomesticos = 0;
        int subtotalDeElectrodomesticos = 0;

//        Instancias
        listaElectrodomesticos[0] = new Lavadora();
        listaElectrodomesticos[1] = new Lavadora(20);
        listaElectrodomesticos[2] = new Lavadora(30);
        listaElectrodomesticos[3] = new Lavadora(100, 50);
        listaElectrodomesticos[4] = new Electrodomesticos(200, 20);
        listaElectrodomesticos[5] = new Electrodomesticos();
        listaElectrodomesticos[6] = new Television(100, 10);
        listaElectrodomesticos[7] = new Television(200, 60);
        listaElectrodomesticos[8] = new Television(40, false);
        listaElectrodomesticos[9] = new Television(40, true);

        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                totalDeLavadoras += listaElectrodomesticos[i].precioFinal();
            } else if (listaElectrodomesticos[i] instanceof Television) {
                totalDeTelevisores += listaElectrodomesticos[i].precioFinal();
            } else {
                totalDeElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
        }

//        Resultados
        subtotalDeElectrodomesticos = totalDeLavadoras + totalDeTelevisores;
        System.out.println("El total para lavadoras es de: " + totalDeLavadoras + "\n" +
                "El total para televisores es de: " + totalDeTelevisores + "\n" +
                "El total de electrodomesticos es de: " + (totalDeElectrodomesticos + subtotalDeElectrodomesticos));
    }
}
