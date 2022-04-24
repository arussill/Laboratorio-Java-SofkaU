package com.sofka.lab.Ejercicio17;

public class Datos {

    protected Electrodomesticos[] listaElectrodomesticos = new Electrodomesticos[10];

    public Datos() {
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
    }

}
