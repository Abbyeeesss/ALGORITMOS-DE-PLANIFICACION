import java.util.*;
public class FIFO {
    public static void main(String[] args) {

        String[] trabajos = {"A", "B", "C", "D", "E"};
        int[] rafagaCPU = {3, 1, 3, 4, 2};
        int[] tiempoLlegada = {2, 4, 0, 1, 3};
        int[] tiempoRetorno = {7, 12, 0, 3, 10};
        int[] tiempoEspera = new int[trabajos.length];

        for (int i = 0; i < trabajos.length; i++) {
            tiempoEspera[i] = tiempoRetorno[i] - tiempoLlegada[i];
        }

        double tiempoMedioEspera = 0;
        for (int i = 0; i < trabajos.length; i++) {
            tiempoMedioEspera += tiempoEspera[i];
        }
        tiempoMedioEspera /= trabajos.length;

        double tiempoMedioRetorno = 0;
        for (int i = 0; i < trabajos.length; i++) {
            tiempoMedioRetorno += tiempoRetorno[i];
        }
        tiempoMedioRetorno /= trabajos.length;

        System.out.println("Trabajo\t\tTiempo de Llegada\tRáfaga CPU\tTiempo de Espera\tTiempo de Retorno");
        for (int i = 0; i < trabajos.length; i++) {
            System.out.println(trabajos[i] + "\t\t\t\t\t" + tiempoLlegada[i] + "\t\t\t\t" + rafagaCPU[i] + "\t\t\t\t" + tiempoEspera[i] + "\t\t\t\t" + tiempoRetorno[i]);
        }
        System.out.println("Tiempo Medio de Espera: " + tiempoMedioEspera);
        System.out.println("Tiempo Medio de Retorno: " + tiempoMedioRetorno);
    }
}