
package tercerparcial;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class ArregloRotado {

   
    public static void main(String[] args) {

       int tamañoArreglo=Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
       int numeroRotaciones=Integer.parseInt(JOptionPane.showInputDialog("Digite el número de rotaciones"));
       int[] numeros= new int[tamañoArreglo];
       
       for(int i=0;i<tamañoArreglo;i++){
           numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite los valores"));
       }
       JOptionPane.showMessageDialog(null,"Su arreglo es");
       for(int i=0;i<tamañoArreglo;i++){
        JOptionPane.showMessageDialog(null,Arrays.toString(numeros));
       }
       
       
        int temp = numeros[0];
        for(int i=0;i<numeros.length;i++){
            numeros[i] = numeros[i+1];
        }
        numeros[numeros.length-1] = temp;
       
        for(int i=0;i<numeros.length;i++){
           JOptionPane.showMessageDialog(null, numeros);
        }
       

        
        
        
        
        
        
    }
    
}
