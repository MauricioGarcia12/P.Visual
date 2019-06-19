package Examen2Taller;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TPV2doParcial {

    public static void main(String[] args) {
        File archivo = new File("ArchivoVisual.txt");
        File Archivo2 = new File("ConteoArchivos.txt");
        String text = JOptionPane.showInputDialog("Escriba su palabra:");
        String numeroPalabras = "";
        int conteo = 0;
        StringTokenizer tokens = new StringTokenizer(text);
        String[] palabrasArray = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : palabrasArray) {

            if (map.containsKey(word)) {
                conteo = map.get(word);
                map.put(word, conteo + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> var : map.entrySet()) {
            // System.out.println(var.getKey() + " : " + var.getValue());
            numeroPalabras = numeroPalabras + var.getKey() + " : " + var.getValue().toString() + "\n";
        }
        String concat = "Conteo palabras: " + tokens.countTokens();
        numeroPalabras = numeroPalabras + concat;
        System.out.println(numeroPalabras);

        try {
            FileWriter writer = new FileWriter(Archivo2);
            BufferedWriter bw = new BufferedWriter(writer);
            {
                bw.write(numeroPalabras+" ");
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(TPV2doParcial.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileWriter writer = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(writer);
            {
                bw.write(text);
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(TPV2doParcial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
