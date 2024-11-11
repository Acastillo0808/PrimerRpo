import java.util.Random;

class Corredor extends Thread {
    private String nombre;
    private int distanciaRecorrida = 0;
    private static final int META = 100;

    public Corredor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (distanciaRecorrida < META) {
            int avance = random.nextInt(5) + 1;  // Avanza entre 1 y 5 metros
            distanciaRecorrida += avance;
            System.out.println(nombre + " ha recorrido " + distanciaRecorrida + " metros");

            try {
                Thread.sleep(500);  // Simula el esfuerzo con una pausa de 0.5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("¡" + nombre + " ha terminado la carrera!");
    }
}

public class Carrera {
    public static void main(String[] args) {
        int numeroCorredores = 5;  // Número de corredores en la carrera
        Corredor[] corredores = new Corredor[numeroCorredores];

        for (int i = 0; i < numeroCorredores; i++) {
            corredores[i] = new Corredor("Corredor " + (i + 1));
            corredores[i].start();
        }

        for (int i = 0; i < numeroCorredores; i++) {
            try {
                corredores[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos los corredores han terminado la carrera.");
    }
}