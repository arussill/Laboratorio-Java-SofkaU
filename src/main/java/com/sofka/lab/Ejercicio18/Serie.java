package com.sofka.lab.Ejercicio18;

public class Serie implements Entregable {

    //    Atributos
    protected String titulo;
    protected Integer numeroDeTemporada;
    protected Boolean entregado;
    protected String genero;
    protected String creador;
    protected String estado;

    //    Constructores
    public Serie() {
        this.titulo = "";
        this.numeroDeTemporada = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporada = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroDeTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporada = numeroDeTemporada;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    //    Getters
    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroDeTemporada() {
        return numeroDeTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

//    Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporada(Integer numeroDeTemporada) {
        this.numeroDeTemporada = numeroDeTemporada;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

//    Metodos

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporada=" + numeroDeTemporada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
            estado = "Estado: Serie entregada";
        }
        if (!(entregado)) {
            estado = "Estado: Serie devuelta";
        }
        return estado;
    }

    @Override
    public void compareTo(Object a) {

    }
}


