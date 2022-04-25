package com.sofka.lab.Ejercicio18;

public class Ejercicio18 {
    public static void main(String[] args) {
        Integer contadorSeries = 0;
        Integer contadorVidejuegos = 0;
        Integer mayorHorasEstimadas = 0;
        Integer serieConMayorTemporadas = 0;
        String nombreJuego = "";
        String nombreSerie = "";
        DatosSeries s = new DatosSeries();
        DatosVideoJuegos vj = new DatosVideoJuegos();
//        Entrega
        s.series[3].entregar();
        s.series[4].entregar();
        vj.videojuegos[3].entregar();
        System.out.println(s.series[3].isEntregado() + "\n"
                + s.series[4].isEntregado() + "\n"
                + vj.videojuegos[3].isEntregado());
        System.out.println("////////////////////////////////////////////");
//        Cuenta y Compara
        for (Serie serie : s.series) {
            if (serie.entregado) {
                contadorSeries += 1;
                serie.devolver();
            }
            serieConMayorTemporadas = serie.compareTo(serie.getNumeroDeTemporada());
            if (serie.getNumeroDeTemporada() == serieConMayorTemporadas) {
                nombreSerie = serie.getTitulo();
            }
        }
        for (Videojuego videojuego : vj.videojuegos) {
            if (videojuego.entregado) {
                contadorVidejuegos += 1;
                videojuego.devolver();
            }
            mayorHorasEstimadas = videojuego.compareTo(videojuego.getHorasEstimadas());
            if (videojuego.horasEstimadas == mayorHorasEstimadas) {
                nombreJuego = videojuego.getTitulo();
            }
        }
//     Respuestas
        System.out.println("Series devueltos: " + contadorSeries + "\n" +
                "Video Juegos devueltos: " + contadorVidejuegos);
        System.out.println(s.series[3].isEntregado() + "\n"
                + s.series[4].isEntregado() + "\n"
                + vj.videojuegos[3].isEntregado());
        System.out.println("////////////////////////////////////////////");
        System.out.println("El juego con mayor horas estimadas es: " + nombreJuego + " con " + mayorHorasEstimadas + " horas");
        System.out.println("La Serie con mayor temporadas es: " + nombreSerie + " con " + serieConMayorTemporadas + " temporadas");
        System.out.println("////////////////////////////////////////////");
        for (int i = 0; i < 5; i++){
            System.out.println(s.series[i].toString() + "\n");
            System.out.println(vj.videojuegos[i].toString());
        }
    }
}
