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
    private String informacion;
    private String letras;
    private int residuo;
    private int calculoDNI;

    //    Constructores
    public Persona() {

    }

    public Persona(String nombre, String edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, String edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0;
        altura = 0;
    }

    //    Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //    Metodos
    public int calcularIMC(double peso, double altura) {
        imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return pesoIdeal;
        } else if (20 <= imc && imc <= 25) {
            return bajoPeso;
        }
        return sobrePeso;
    }

    public void comprobacionDePeso(double peso, double altura) {
        switch (calcularIMC(peso, altura)) {
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

    public boolean esMayorDeEdad() {
        if (Integer.parseInt(edad) >= 18) {
            return true;
        }
        return false;
    }

    public void comprobacionMayorDeEdad() {
        boolean b = esMayorDeEdad();
        if (b) {
            System.out.println("Es mayor de edad");
        } else if (!(b)) {
            System.out.println("No es mayor de edad");
        }
    }

    public void comprobarSexo(char sexo) {
        switch (sexo) {
            case 'H':
                break;
            case 'M':
                break;
            default:
                sexo = sexoDefecto;
                break;
        }
    }

    public String toString() {
        informacion = "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "DNI: " + dni + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + "\n" +
                "Altura: " + altura + "\n" +
                "imc: " + imc;
        return informacion;
    }

    public String generaDNI() {
        calculoDNI = (int) Math.round(Math.random() * 90000000);
        letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        residuo = calculoDNI % 23;
        dni = String.valueOf(calculoDNI) + letras.charAt(residuo);
        return dni;
    }

}
