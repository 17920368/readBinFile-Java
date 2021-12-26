package ejercicio6;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        Archivo obja = new Archivo();
        String nomArchivo = "";
        int opc = 0;
        String[] options2 = {"Si", "No"};
        opc = JOptionPane.showOptionDialog(null, "¿DESEA LEER UN ARCHIVO?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
        switch (opc) {
            case 0:
                 JOptionPane.showMessageDialog(null, "NOTA: LOS ARCHIVOS PARA LEER TENDRAN QUE ESTAR EN LA CARPETA DEL PROYECTO. GRACIAS ","",JOptionPane.INFORMATION_MESSAGE);
                boolean bandera2;
                do {
                    bandera2 = true;
                    try {
                        nomArchivo = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL ARCHIVO \nEJEMPLO: archivo.bin ", "INGRESE DATO", JOptionPane.INFORMATION_MESSAGE);
                        bandera2 = obja.Lectura(nomArchivo);
                    } catch (HeadlessException e) {
                        bandera2 = false;
                    }

                } while (bandera2 != true);

                break;
            case 1:
                JOptionPane.showMessageDialog(null, "SALIENDO DEL SISTEMA ...", "ADIOS", JOptionPane.CLOSED_OPTION);
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "OPCION NO DISPONIBLE ...", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }

        JOptionPane.showMessageDialog(null, "LECTURA DEL ARCHIVO: "+nomArchivo+"\n"+ obja.getCadena_mostrar(),"",JOptionPane.INFORMATION_MESSAGE);
    }

}
