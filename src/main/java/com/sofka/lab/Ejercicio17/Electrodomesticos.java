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
    protected char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
    protected String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
    protected int aumento;

//    Constructores

    public Electrodomesticos() {
        this.precioBase = precioBaseDefecto;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.peso = pesoDefecto;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    public Electrodomesticos(int precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
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

    private char comprobarConsumoEnergetico(char letra) {
        for (char elemento : letras) {
            if (elemento != letra) {
                consumoEnergetico = consumoEnergeticoDefecto;
            }
        }
        return consumoEnergetico;
    }

    private String comprobarColor(String color) {
        for (String elemento : colores) {
            if (elemento.equalsIgnoreCase(color)) {
                this.color = colorDefecto;
            }
        }
        return this.color;
    }

    public int precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                aumento = 100;
                aumentoPorTamaño();
                break;
            case 'B':
                aumento = 80 + aumentoPorTamaño();
                break;
            case 'C':
                aumento = 60 + aumentoPorTamaño();
                break;
            case 'D':
                aumento = 50 + aumentoPorTamaño();
                break;
            case 'E':
                aumento = 30 + aumentoPorTamaño();
                break;
            case 'F':
                aumento = 10 + aumentoPorTamaño();
                break;
        }
        return (aumento + precioBase);
    }

    protected int aumentoPorTamaño() {
        if ((0 <= peso) && (peso >= 19)) {
            aumento += 10;
        } else if ((20 <= peso) && (peso >= 49)) {
            aumento += 50;
        } else if ((50 <= peso) && (peso >= 79)) {
            aumento += 80;
        } else if ((peso >= 80)) {
            aumento += 100;
        }
        return aumento;
    }

}
