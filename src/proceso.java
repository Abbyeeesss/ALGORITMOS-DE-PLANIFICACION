import java.util.*;
public class proceso {
    String nombre;
    int tiempoLlegada;
    int rafagaCPU;
    int tiempoEspera;
    int tiempoRetorno;

    public proceso(String nombre, int tiempoLlegada, int rafagaCPU) {
        this.nombre = nombre;
        this.tiempoLlegada = tiempoLlegada;
        this.rafagaCPU = rafagaCPU;
        this.tiempoEspera = 0;
        this.tiempoRetorno = 0;
    }
}
