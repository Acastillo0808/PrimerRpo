import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class prueba {
    public static void main(String[] args) {
        Path path = Paths.get("fichero.txt"); // Reemplaza con tu ruta

        try {
            // Leer todas las líneas del fichero
            List<String> lineas = Files.readAllLines(path);
            // Files.readString(path); para una sola línea
            lineas.forEach(System.out::println); // Imprimir cada línea
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero.");
            e.printStackTrace();
        }
    }
}//Crea un programa que pida al usuario que ingrese tres líneas
// de texto y las escriba en un fichero de texto llamado lineas.txt,
// asegurándote de que cada línea se guarde en una línea separada del
// fichero.