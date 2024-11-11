import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres líneas de texto
        System.out.print("Ingresa la primera línea de texto: ");
        String linea1 = scanner.nextLine();
        System.out.print("Ingresa la segunda línea de texto: ");
        String linea2 = scanner.nextLine();
        System.out.print("Ingresa la tercera línea de texto: ");
        String linea3 = scanner.nextLine();

        // Guardar las líneas en un fichero llamado 'lineas.txt'
        try (FileWriter escritor = new FileWriter("lineas.txt")) {
            escritor.write(linea1 + "\n");
            escritor.write(linea2 + "\n");
            escritor.write(linea3 + "\n");
            System.out.println("Las líneas se han guardado correctamente en 'lineas.txt'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar las líneas.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
