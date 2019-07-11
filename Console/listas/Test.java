
package listas;

import javax.swing.JOptionPane;


public class Test {

   
    public static void main(String[] args) {
        Lista list = new Lista();
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
        for(int i=0;i<cant;i++){
            list.insert(Integer.parseInt(JOptionPane.showInputDialog("Digite elemento: ")));
        }
        list.show();
    }
    
}
