/*package si;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner(System.in);
            System.out.println("Introduzca un nombre: ");
            String nombre= sc.nextLine();
            // Ruta del fichero binario que contiene el nombre en formato binario
            Path rutaArchivo = Paths.get("nombre.bin");

            byte[] datosNombre= nombre.getBytes();

            // Convertir los bytes a una cadena de texto (nombre)
            String nombreLeido = new String(datosLeidos);

            // Mostrar el nombre leído desde el archivo binario
            System.out.println("Nombre leído desde el archivo: " + nombreLeido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/