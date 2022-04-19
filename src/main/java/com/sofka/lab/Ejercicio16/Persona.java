package com.sofka.lab.Ejercicio16;

public class Persona {
    //    Atributos
    private String nombre;
    private String edad;
    private String dni;
    private char sexo;
    private final char sexoDefecto = 'H';
    private double peso;
    private double altura;
    private double imc;
    private final int pesoIdeal = -1;
    private final int bajoPeso = 0;
    private final int sobrePeso = 1;

    //    Constructores
    public Persona(String dni) {
        nombre = "";
        edad = "";
        this.dni = dni;
        sexo = sexoDefecto;
        peso = 0;
        altura = 0;
    }

    public void persona(String nombre, String edad, char sexo, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        peso = 0;
        altura = 0;
    }

    public void persona(String nombre, String edad, char sexo, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        imc = peso/Math.pow(altura,2);
        if (imc<20){
           return pesoIdeal;
        }else if (20<= imc && imc <= 25){
            return bajoPeso;
        }
        return sobrePeso;
    }

    public boolean esMayorDeEdad(){
        if (Integer.parseInt(edad)>=18){
            return true;
        }
        return false;
    }

//    public void comprobarSexo(){
//        if (sexo=='H' || sexo='M'){
//
//        }
//    }



}
