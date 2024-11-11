import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ej9 {
    public static void main(String[] args) {
        int suma = 0;

        // Leer los números desde el archivo binario
        try (DataInputStream entrada = new DataInputStream(new FileInputStream("numeros.bin"))) {
            System.out.println("Números leídos del archivo:");

            // Leer los números hasta que se alcance el final del archivo
            while (entrada.available() > 0) {
                int numero = entrada.readInt();  // Leer cada número entero
                System.out.print(numero + " ");  // Imprimir el número
                suma += numero;  // Sumar el número
            }

            System.out.println("\nSuma total de los números: " + suma);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
