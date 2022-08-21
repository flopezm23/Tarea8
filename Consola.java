import jdk.swing.interop.SwingInterOpUtils;

public class Consola {
    String nombre;
    String juego;
    int jugadores;

    public Consola(){
        this.nombre="";
        this.juego="";
        this.jugadores=0;
    }

    public Consola(String nombre, String juego, int jugadores) {
        this.nombre = nombre;
        this.juego = juego;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public String getJuego() {
        return juego;
    }

    public int getJugadores() {
        return jugadores;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }



    public String toString() {
        System.out.println(getNombre()+" Juego: "+getJuego()+" Numero de jugadores "+getJugadores());

        return null;
    }

}
