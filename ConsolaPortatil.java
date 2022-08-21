public class ConsolaPortatil extends Consola{

    String bateria;

    public ConsolaPortatil(String bateria) { //este constructor es una sobrecarga del método
        this.bateria = bateria;
    }

    public ConsolaPortatil(String nombre, String juego, int jugadores, String bateria) {
        super(nombre, juego, jugadores);
        this.bateria = bateria;
    }


    public String toString() {  //este toString tambien es una sobre carga por que en la clase Padre ya existe este metodo
        return "ConsolaPortatil{" +
                "bateria='" + bateria +    //aqui es el mismo método que se utiliza en la clase padre, pero se ejecuta de una forma diferente, por lo tanto se esta sobre escribiendo.
                ", nombre='" + nombre +
                ", juego='" + juego +
                '}';
    }
}
