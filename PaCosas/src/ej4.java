import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej4 {
    public static void main(String[] args){
        String nombre_archivo= "lineas.txt";
        int contador= 0;

        try(BufferedReader br= new BufferedReader(new FileReader(nombre_archivo))) {
            while (br.readLine() != null) {
                contador++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        // Imprimir el resultado
        System.out.println("El archivo tiene " + contador + " líneas.");
    }
}