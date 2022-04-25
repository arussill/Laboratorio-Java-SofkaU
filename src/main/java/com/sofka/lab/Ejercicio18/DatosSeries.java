package com.sofka.lab.Ejercicio18;

public class DatosSeries {
    protected Serie[] series = new Serie[5];
    public DatosSeries (){
        series[0] = new Serie();
        series[1] = new Serie();
        series[3] = new Serie("The Simpson ", "Matt Groening");
        series[2] = new Serie("Friends", "David Crane y Marta Kauffman");
        series[4] = new Serie("Euphoria ", 2, "Drama", "Sam Levinson");
    }


}
