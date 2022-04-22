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
    protected int aumento = 0;
    protected int total = 0;
    protected int aumentoTamano = 0;

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
                aumento = (100 + aumentoPorTamano(peso));
                break;
            case 'B':
                aumento = (80 + aumentoPorTamano(peso));
                break;
            case 'C':
                aumento = (60 + aumentoPorTamano(peso));
                break;
            case 'D':
                aumento = (50 + aumentoPorTamano(peso));
                break;
            case 'E':
                aumento = (30 + aumentoPorTamano(peso));
                break;
            case 'F':
                aumento = (10 + aumentoPorTamano(peso));
                break;
        }
        return (aumento + precioBase);
    }

    public int aumentoPorTamano(double peso) {
        if ((peso > 0) && (peso <= 19)) {
            aumentoTamano = 10;
        } else if ((peso >= 20) && (peso <= 49)) {
            aumentoTamano = 50;
        } else if ((peso >= 50) && (peso <= 79)) {
            aumentoTamano = 80;
        } else if ((peso >= 80)) {
            aumentoTamano = 100;
        }
        return aumentoTamano;
    }

}
