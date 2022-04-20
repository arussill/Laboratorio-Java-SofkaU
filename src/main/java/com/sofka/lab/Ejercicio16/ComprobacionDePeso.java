package com.sofka.lab.Ejercicio16;

public class ComprobacionDePeso extends Persona {
    public ComprobacionDePeso() {
        switch (calcularIMC()){
            case 0:
                System.out.println("Esta por debajo de su peso ideal");
                break;
            case 1:
                System.out.println("Tiene sobrepeso");
                break;
            default:
                System.out.println("Peso ideal");
                break;
        }
    }
}
