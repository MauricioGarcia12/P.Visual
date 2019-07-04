
package ejercicio4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;


public class SumaArreglo {

    public static void main(String[] args) {
       int cant1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del arreglo"));
       int array[]= new int [cant1];
       
       for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
        }
       
       int posicionInicial=Integer.parseInt(JOptionPane.showInputDialog("Digite la posición inicial"));
       int posicionFinal=Integer.parseInt(JOptionPane.showInputDialog("Digite la posición final"));
       int suma=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a sumar"));
       int resto=posicionFinal-posicionInicial;
       for(int i=posicionInicial ;i<=posicionFinal;i++){
           array[i]=array[i]+suma;
       }
       JOptionPane.showMessageDialog(null,Arrays.toString(array));
       Arrays.sort(array);
       JOptionPane.showMessageDialog(null,array[cant1-1]);
       
    }
    
}
