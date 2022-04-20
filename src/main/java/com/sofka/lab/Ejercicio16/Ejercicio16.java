package com.sofka.lab.Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
//        Instancias
//        Persona 1
//        EntradaDatos datos1 = new EntradaDatos();
//        Persona persona1 = new Persona(datos1.nombre, datos1.edad, datos1.sexo, datos1.peso, datos1.altura);
//        persona1.comprobacionDePeso(datos1.peso, datos1.altura);
//        persona1.comprobacionMayorDeEdad();
//        System.out.println(persona1);

////        Persona 2
//        EntradaDatos datos2 = new EntradaDatos();
//        Persona persona2 = new Persona(datos2.nombre, datos2.edad, datos2.sexo);
//        persona2.comprobacionDePeso(datos2.peso, datos2.altura);
//        persona2.comprobacionMayorDeEdad();
//        System.out.println(persona2);

////        Persona 3
        Persona persona3 = new Persona();
        EntradaDatos datos3 = new EntradaDatos();
        persona3.setNombre(datos3.nombre);
        persona3.setEdad(datos3.edad);
        persona3.setSexo(datos3.sexo);
        persona3.setPeso(datos3.peso);
        persona3.setAltura(datos3.altura);
        persona3.comprobacionDePeso(datos3.peso, datos3.altura);
        persona3.comprobacionMayorDeEdad();
        System.out.println(persona3);

    }
}
