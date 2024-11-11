import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Escritura {
    public static void main(String[] args) {
       /*
       //Ejercicio 5
       Path path= Paths.get("libro.txt");
        Libro libro= new Libro("Don Quijote", "Miguel de Cervantes");
        try{Files.write(path,Arrays.asList("Titulo: " + libro.getName(),"Autor: " + libro.getAutor()));

            System.out.println("Las líneas se han guardado correctamente en " + path );
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar las líneas.");
            e.printStackTrace();
        }*/

        /*
        //Ejercicio 6
        Path path= Paths.get("libro.txt");
        try {
            List<String> lineas= Files.readAllLines(path);
            lineas.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        /*
        //Ejercicio 7
        Scanner scanner = new Scanner(System.in);

        try (FileWriter escritor = new FileWriter("libros.txt", true)) {
            String opcion;

            do {
                System.out.print("Ingrese el título del libro: ");
                String titulo = scanner.nextLine();

                System.out.print("Ingrese el autor del libro: ");
                String autor = scanner.nextLine();

                escritor.write("Título: " + titulo + ", Autor: " + autor + "\n");

                System.out.print("¿Desea ingresar otro libro? (s/n): ");
                opcion = scanner.nextLine();

            } while (opcion.equalsIgnoreCase("s"));

            System.out.println("Los libros han sido guardados en libros.txt.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
        scanner.close();*/

/*
                int sumaTotal = 0;

                try (DataInputStream dis = new DataInputStream(new FileInputStream("numeros.bin"))) {
                    // Leer números del archivo hasta que no haya más datos
                    while (dis.available() > 0) {
                        int numero = dis.readInt();  // Leer un número entero
                        System.out.println("Número leído: " + numero);
                        sumaTotal += numero;  // Sumar el número leído
                    }
                    System.out.println("Suma total de los números: " + sumaTotal);
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al leer el archivo.");
                    e.printStackTrace();
                }*/
        /*
        //Eje4 mover
        File carpeta= new File("archivos");

        carpeta.mkdir();
        Path origen = Paths.get("documentos.txt"); // Reemplaza con tu ruta
        Path destino = Paths.get("archivos\\documentos_final.txt");
        try {
            Files.move(origen, destino);
            System.out.println("Fichero movido correctamente a " + destino.toString());
        } catch (IOException e) {
            System.out.println("Ocurrió un error al mover el fichero.");
            e.printStackTrace();
        }*/

        /*
        //Eje 5 copiar
        Path origen = Paths.get("C:\\Users\\Castillo\\Documents\\Scanned Documents"); // Reemplaza con tu ruta
        Path destino = Paths.get("destino");

        try {
            Files.move(origen, destino);
            System.out.println("Fichero movido correctamente a " + destino.toString());
        } catch (IOException e) {
            System.out.println("Ocurrió un error al mover el fichero.");
            e.printStackTrace();
        }
        */
        /*
        //Ejercicio 7: Mover Todos los Ficheros. Escribe un programa que mueva
        // todos los ficheros de un directorio descargas a un directorio documentos.
        // Asegúrate de que el directorio documentos existe o créalo si no.


            File carpetaDocumentos = new File("documentos");
            carpetaDocumentos.mkdir();
            File carpetaDescargas = new File("descargas");
            File[] ListaArchivos = carpetaDescargas.listFiles();
            if (ListaArchivos != null) {
                for (File archivo : ListaArchivos) {
                    if (archivo.isFile()) {
                        Path origen = archivo.toPath();
                        Path destino = new File(carpetaDocumentos,archivo.getName()).toPath();

                        try {
                            Files.move(origen,destino, StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Movido " + archivo.getName());
                        }catch (IOException e){
                            System.out.println("Error al movido " + archivo.getName());
                            e.printStackTrace();
                        }

                    }

                }
            }
            else {
                System.out.println("No se encontro el archivo");
            }*/

        //Ejercicio 8
        Path origen;




            }
        }





class Libro{
    private String name, autor;
    public Libro(String name, String autor){
        this.autor=autor;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getAutor(){
        return autor;
    }
}
