package com.sofka.lab.Ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {

        Electrodomesticos [] listaElectrodomesticos = new Electrodomesticos [10];

        listaElectrodomesticos [0] = new Lavadora();
        listaElectrodomesticos [4] = new Lavadora(2);
        listaElectrodomesticos [2] = new Lavadora(3);
        listaElectrodomesticos [1] = new Lavadora(100, 1);
        listaElectrodomesticos [3] = new Lavadora(200, 2);
        listaElectrodomesticos [5] = new Television();
        listaElectrodomesticos [6] = new Television(100, 1);
        listaElectrodomesticos [7] = new Television(200, 2);
        listaElectrodomesticos [8] = new Television(40, false);
        listaElectrodomesticos [9] = new Television(40, true);

        for (int i = 0; i < listaElectrodomesticos.length; i++){
            listaElectrodomesticos[i].precioFinal();
        }
    }
}
