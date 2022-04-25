package com.sofka.lab.Ejercicio18;

public class DatosVideoJuegos {
    protected Videojuego[] videojuegos = new Videojuego[5];
    public DatosVideoJuegos(){
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Assassin's Creed", 12);
        videojuegos[2] = new Videojuego("Mortal kombat", 3);
        videojuegos[3] = new Videojuego("FREEFIRE", 8);
        videojuegos[4] = new Videojuego("FORTNITE", 5, "Battle royale game", "Epic Games");
    }

}
