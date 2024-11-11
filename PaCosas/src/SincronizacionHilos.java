class Contador {
    private int cuenta = 0;

    public synchronized void incrementar() {
        cuenta++;
    }

    public int getCuenta() {
        return cuenta;
    }
}

class HiloContador extends Thread {
    private final Contador contador;

    public HiloContador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador.incrementar();
        }
    }
}


public class SincronizacionHilos {
    public static void main(String[] args) {
        Contador contadorCompartido = new Contador();

        Thread hilo1 = new Thread(new HiloContador(contadorCompartido));
        Thread hilo2 = new Thread(new HiloContador(contadorCompartido));
        Thread hilo3 = new Thread(new HiloContador(contadorCompartido));

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Valor final del contador: " + contadorCompartido.getCuenta());
    }
}
