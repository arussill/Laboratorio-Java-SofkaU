package com.sofka.lab.Ejercicio17;

public class Lavadora extends Electrodomesticos {

//    Atributos

    private Double carga;
    private final Double cargaDefecto = 5.0;

//    Constructores

    public Lavadora() {
        super();
        this.carga = cargaDefecto;
    }

    public Lavadora(int precioBase, double peso) {
        super(precioBase, peso);
        super.precioBase = precioBase;
        super.peso = peso;
        this.carga = cargaDefecto;
    }

    public Lavadora(double carga) {
        super();
        this.carga = carga;
    }

//    Getters

    public double getCarga() {
        return carga;
    }

//    Metodos

    @Override
    public int precioFinal() {
        if (carga >= 30) {
            total = 50;
        }
        return (total + super.precioFinal());

    }
}
