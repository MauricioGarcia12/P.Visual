package tercerparcial;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArregloRotado {

    public static void main(String[] args) {

        int tamañoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
        int numeroRotaciones = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de rotaciones"));
        double temp;
        ArrayList<Double> numeros = new ArrayList<Double>(tamañoArreglo);

        for (double i = 0; i < tamañoArreglo; i++) {
            numeros.add(Double.parseDouble(JOptionPane.showInputDialog("Digite un valor:")));
        }
        JOptionPane.showMessageDialog(null, "Lista: " + numeros.toString());

//        Orden hacia la izquierda
        for (int i = 0; i < numeroRotaciones; i++) {
            temp = numeros.get(0);//Obtiene primer dato de la lista siempre
            numeros.remove(0); //remueve ese dato de la lista
            numeros.add(temp);//ingresa 1 al final del arraylist lo coloca al final de la lista

        }
        JOptionPane.showMessageDialog(null, "Lista rotada " + numeros.toString());

    }

}
