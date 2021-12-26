package ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Archivo {

    String cadena_mostrar;

    public Archivo() {
        cadena_mostrar = "";
    }

    public boolean Lectura(String nomArchivo) {
        boolean bandera;
        FileReader fr;
        BufferedReader br;
        do {
            bandera = true;
            try {
                bandera = true;
                fr = new FileReader(nomArchivo);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                       cadena_mostrar += linea + "\n";
                }
                fr.close();
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "ERROR NO EXISTE EL ARCHIVO", "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = false;
                return false;
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (bandera != true);
        return bandera;
    }

    public String getCadena_mostrar() {
        return cadena_mostrar;
    }

}
