package com.sofka.lab.Ejercicio17;

//SubClase de Electrodomesticos
public class Lavadora extends Electrodomesticos {

//    Atributos

    private double carga;
    private final double cargaDefecto = 5;

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
            aumento = 50 + super.precioFinal();
        }
        return aumento;

    }
}
