
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class Final2 {

    public static int a[];
    public static int valor;

    public void ordenar() {
        int i;
        for (i = 0; i < valor - 1; i++) {
            for (int j = 0; j < valor - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print((i) + "  ");
            JOptionPane.showMessageDialog(null, "Sus Queres son: ");
            JOptionPane.showMessageDialog(null,Arrays.toString(a));
        }
        JOptionPane.showMessageDialog(null,"Numero te permutaciones: "+ i);
        JOptionPane.showMessageDialog(null,"El primer  elemento es: " + a[0]+"\n"
        +"El último es: "+a[valor-1]);
        
    }

    public static void main(String[] args) {
        Final2 ob1= new Final2();
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
        valor = tamaño;
        a = new int[tamaño];

        for (int i = 0; i < valor; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el elemento " 
                    + (i + 1) + " del arreglo"));
        }
        JOptionPane.showMessageDialog(null, "Su arreglo principal es: ");
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
        ob1.ordenar();
    }
}
