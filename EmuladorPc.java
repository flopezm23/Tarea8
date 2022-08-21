public class EmuladorPc extends  Consola{
        String memoriaRam;

        public EmuladorPc(String memoriaRam) {
                this.memoriaRam = memoriaRam;
        }

        public EmuladorPc(String nombre, String juego, int jugadores, String memoriaRam) {
                super(nombre, juego, jugadores);
                this.memoriaRam = memoriaRam;
        }

        @Override //el override indica que este metodo esta siendo sobre escrito
        public String toString() {
                return "EmuladorPc{" +
                        "memoriaRam='" + memoriaRam + '\'' +
                        ", nombre='" + nombre + '\'' +
                        ", juego='" + juego + '\'' +
                        '}';
        }

}
