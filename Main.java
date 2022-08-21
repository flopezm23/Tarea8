import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome="";
        String consola="";
        int jugadores=0;

        Scanner capta = new Scanner(System.in);


        System.out.println("Cuantos juegos deseas ingresar?");
        int cantidad = capta.nextInt();
        Consola [] carpeta= new Consola[cantidad];

        for (int i=0;i<cantidad;i++){
        capta.nextLine();//para cortar el salto en la ejecucion
        System.out.println("Ingresa el nombre del juego "+(i+1));
        nome=capta.nextLine();
        //carpeta[i].setJuego(nome);
        System.out.println("Ingresa el nombre de la consola "+(i+1));
        consola= capta.nextLine();
        //carpeta[i].setJuego(consola);
        System.out.println("Ingresa la cantidad de jugadores posibles del juego"+(i+1));
        jugadores= capta.nextInt();
        //carpeta[i].setJugadores(jugadores);

        Consola p=new Consola(nome,consola,jugadores);
        carpeta[i]=p;

        //carpeta[i].toString();

        }//fin del for

        for (int j=0;j<cantidad;j++) {
            //carpeta[j].toString(carpeta[j].getNombre(),carpeta[j].getJuego(),carpeta[j].getJugadores());
            carpeta[j].toString();
        }




    }
}