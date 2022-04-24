package com.sofka.lab.Ejercicio18;


import java.time.LocalTime;

public class Videojuego implements Entregable {

//    Atributos
    protected String titulo;
    protected LocalTime horasEstimadas;
    protected Boolean entregado;
    protected String genero;
    protected String compania;
    protected String estado;

//    Constructores

    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = LocalTime.of(10, 0, 0);
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, LocalTime horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, LocalTime horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

//    Getters
    public String getTitulo() {
        return titulo;
    }

    public LocalTime getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }


//    Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(LocalTime horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public String isEntregado() {
        if (entregado) {
            estado = "Estado: Entregado";
        }
        if (!(entregado)) {
            estado = "Estado: No Entregado";
        }
        return estado;
    }

    @Override
    public void compareTo(Object a) {

    }
}
