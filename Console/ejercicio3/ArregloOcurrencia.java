package ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArregloOcurrencia {

    public static void main(String[] args) {
        String[] array;
        int conteo=0;
        String[] array2;
        int conteo2=0;
         String numeroPalabras = "";
         String numeroPalabras2 = "";
        int cant1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del primer arreglo"));
        int cant2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del segundo arreglo"));

        array= new String[cant1];
        array2= new String[cant2];
        JOptionPane.showMessageDialog(null,"Llenado primer arreglo");
        for(int i=0;i<array.length;i++){
            array[i]=JOptionPane.showInputDialog("Digite una cadena");
        }
        JOptionPane.showMessageDialog(null,"Llenado segundo arreglo");
        for(int i=0;i<array2.length;i++){
            array2[i]=JOptionPane.showInputDialog("Digite una cadena");
        }
        String elegir=JOptionPane.showInputDialog("Cadena a buscar");
        StringTokenizer tokens = new StringTokenizer(elegir);
        
        
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : array) {

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
        System.out.println("Veces que aparece en el arreglo 1 "+numeroPalabras);
        
        
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String word : array2) {

            if (map2.containsKey(word)) {
                conteo2 = map2.get(word);
                map2.put(word, conteo2 + 1);
            } else {
                map2.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> var : map2.entrySet()) {
            // System.out.println(var.getKey() + " : " + var.getValue());
            numeroPalabras2 = numeroPalabras2 + var.getKey() + " : " + var.getValue().toString() + "\n";
        }
        System.out.println("\nVeces que aparece en el arreglo 2 "+numeroPalabras2);
    }

}
