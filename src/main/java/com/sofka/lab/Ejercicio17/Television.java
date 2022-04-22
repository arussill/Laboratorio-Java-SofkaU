package com.sofka.lab.Ejercicio17;

public class Television extends Electrodomesticos{

    //    Atributos

    private int resolucion;
    private boolean sintonizadorTDT;
    private final int resolucioDefecto = 20;
    private final boolean sintonizadorTDTDefecto = false;

//    Constructores

    public Television (){
        super();
        this.resolucion = resolucioDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }

    public Television (int precioBase, double peso){
        super(precioBase, peso);
        this.resolucion = resolucioDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }

    public Television(int resolucion, boolean sintonizadorTDT){
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
        if ((resolucion >= 40) && (sintonizadorTDT)){
            total = (int) (precioBase*0.3)+50;
        }else if (resolucion >= 40){
            total = (int)((precioBase*0.3));
        }else if (sintonizadorTDT){
            total = 50;
        }
        return (total + super.precioFinal());
    }
}

