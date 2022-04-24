package com.sofka.lab.Ejercicio17;

public class Television extends Electrodomesticos {

    //    Atributos

    private Boolean sintonizadorTDT;
    private final Boolean sintonizadorTDTDefecto = false;
    private final Integer resolucioDefecto = 20;
    private Integer resolucion;

//    Constructores

    public Television() {
        super();
        this.resolucion = resolucioDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }

    public Television(int precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = resolucioDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }

    public Television(int resolucion, boolean sintonizadorTDT) {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

//    Getters

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public int precioFinal() {
        if ((resolucion >= 40) && (sintonizadorTDT)) {
            total = (int) (precioBase * 0.3) + 50;
        }
        if (resolucion >= 40) {
            total = (int) ((precioBase * 0.3));
        }
        if (sintonizadorTDT) {
            total = 50;
        }
        return (total + super.precioFinal());
    }
}

