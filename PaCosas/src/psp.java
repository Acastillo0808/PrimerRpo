import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class psp {
    public static void main(String[] args) throws IOException{
        try{
            ProcessBuilder pb= new ProcessBuilder("cmd","/c","findstr", "ejemplito");
            pb.redirectInput(new File("entrada.txt"));
            pb.redirectOutput(new File("salida.txt"));
            pb.redirectError(new File("error.txt"));
            Process p = pb.start();

            int exitVal= p.waitFor();
            System.out.println("El proceso termino con valor: " + exitVal);
        } catch (InterruptedException e) {
e.printStackTrace();        }
    }
}
