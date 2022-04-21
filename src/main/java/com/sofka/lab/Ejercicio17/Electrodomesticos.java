package com.sofka.lab.Ejercicio17;

public class Electrodomesticos {

//    Atributos

    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    protected final int precioBaseDefecto = 100;
    protected final String colorDefecto = "blanco";
    protected final char consumoEnergeticoDefecto = 'F';
    protected final double pesoDefecto = 5;
    protected char letras [] = ['A', 'B', 'C', 'D', 'E', 'F'];
    protected String colores [] = ["blanco", "negro", "rojo", "azul", "gris"];

//    Constructores

    public Electrodomesticos (){
        this.precioBase = precioBaseDefecto;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.peso = pesoDefecto;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    public Electrodomesticos (int precioBase, double peso){
        this.precioBase = precioBase;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    public Electrodomesticos (int precioBase, String color, char consumoEnergetico, double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

//    Getters

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

//    Metodos

    public char comprobarConsumoEnergetico (char letra){
        for (char elemento: letras) {
            if (elemento!=letra){
                consumoEnergetico = consumoEnergeticoDefecto;
            }
        }
        return consumoEnergetico;
    }

    public String comprobarColor(String color){
        for (String elemento: colores){
            if (elemento.equalsIgnoreCase(color)){
                this.color = colorDefecto;
            }
        }
        return this.color;
    }

//    public int precioFinal(char letra){
//        switch (letra)
//    }

}
