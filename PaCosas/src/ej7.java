import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ej7 {
    public static void main(String[] args) {
        // Crear un array de 10 números enteros aleatorios
        int[] numeros = new int[10];
        Random random = new Random();

        // Llenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;  // Genera números entre 1 y 100
        }

        // Escribir los números en un archivo binario
        try (DataOutputStream salida = new DataOutputStream(new FileOutputStream("numeros.bin"))) {
            for (int numero : numeros) {
                salida.writeInt(numero);  // Escribir cada número como un entero en el archivo
            }
            System.out.println("Los números han sido guardados en numeros.bin");
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}

//Ejercicio 7: Guardar Datos Numéricos. Crea un programa que genere un array de números
// enteros (por ejemplo, 10 números aleatorios) y lo escriba en un fichero binario
//  llamado numeros.bin.

