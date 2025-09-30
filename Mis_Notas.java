/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mis_notas;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ferch
 */
public class Mis_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    escribirNotas(); // Primero escribimos las notas
        leerNotas();     // Luego las leemos
    }

    // Método que escribe tres líneas en el archivo mis_notas.txt
    public static void escribirNotas() {
        try (FileWriter archivo = new FileWriter("mis_notas.txt");
             PrintWriter escritor = new PrintWriter(archivo)) {
  //         notas personales
            escritor.println("La medida del amor es amar sin medida.");
            escritor.println("La vida te pondra obstaculos, pero el limite lo pones tu.");
            escritor.println("La simplicidad llevada al extremo se convierte en elegancia.");

            System.out.println("✔ Archivo escrito correctamente.");

        } catch (IOException e) {
            System.out.println("❌ Error al escribir el archivo: " + e.getMessage());
        }
    }
    public static void leerNotas() {
        try (BufferedReader lector = new BufferedReader(new FileReader("mis_notas.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println("Nota: " + linea);
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
    

