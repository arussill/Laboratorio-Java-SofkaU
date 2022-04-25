package com.sofka.lab.Ejercicio18;


public class Videojuego implements Entregable {

//    Atributos
    protected String titulo;
    protected Integer horasEstimadas;
    protected Boolean entregado;
    protected String genero;
    protected String compania;
    protected String estado;
    protected static Integer mayorHorasEstimadas = 0;

//    Constructores

    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
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

    public Integer getHorasEstimadas() {
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

    public void setHorasEstimadas(Integer horasEstimadas) {
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
                "titulo='" + titulo + '\n' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\n' +
                ", compania='" + compania + '\n' +
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
            estado = "Estado: Juego entregado";
        }
        if (!(entregado)) {
            estado = "Estado: Juego devuelto";
        }
        return estado;
    }

    @Override
    public Integer compareTo(Object a) {

        if (mayorHorasEstimadas < (Integer) a){
            mayorHorasEstimadas = (Integer) a;
        }

        return mayorHorasEstimadas;
    }
}
