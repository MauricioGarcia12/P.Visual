
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class ArregloBinario {

 
    public static void main(String[] args) {
       int[]a= new int[7];
       int[]b= new int[7];
        ArrayList<Integer> c = new ArrayList<Integer>(14);
       JOptionPane.showMessageDialog(null,"Llenado del primer arreglo");
       for(int i=0;i<a.length;i++){
           a[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite un 1 o 0: "));
           c.add(a[i]);
       }
       JOptionPane.showMessageDialog(null,"Llenado del segundo arreglo");
       for(int i=0;i<b.length;i++){
           b[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite un 1 o 0: "));
           c.add(b[i]);
       }
       Collections.sort(c);
        JOptionPane.showMessageDialog(null,"Arreglo ordenado: "+c.toString());
       
    }
    
}
