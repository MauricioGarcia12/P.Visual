package finalTercerParcial;
import javax.swing.JOptionPane;

class Final {

    /*
     Retornamos el posible maximo de la suma de los tres 
     */
    public static int suma(int[] pila1, int[] pila2, int[] pila3, int numero1,
            int numero2,
            int numero3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;

        //Ciclos para el manejo de la tres pilas
        for (int i = 0; i < numero1; i++) {
            sum1 += pila1[i];
        }

        for (int i = 0; i < numero2; i++) {
            sum2 += pila2[i];
        }

        for (int i = 0; i < numero3; i++) {
            sum3 += pila3[i];
        }

        int top1 = 0, top2 = 0, top3 = 0;
        int respu = 0;

        do {

            if (top1 == numero1 || top2 == numero2 || top3 == numero3) {
                return 0;
            }

            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= pila1[top1++];
            } else if (sum2 >= sum3 && sum2 >= sum3) {
                sum2 -= pila2[top2++];
            } else if (sum3 >= sum2 && sum3 >= sum1) {
                sum3 -= pila3[top3++];
            }
        } while (true);
    }

    public static void main(String[] args) {
        //Llenado de las pilas para efectuar la operación
        int tamaño1 =
        Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila 1"));
        int tamaño2 = 
        Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila 2"));
        int tamaño3 = 
       Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la pila 3"));
        int[] pila = new int[tamaño1];
        int[] pila2 = new int[tamaño2];
        int[] pila3 = new int[tamaño3];
        //Llenado de las pilas 
        for (int i = 0; i < pila.length; i++) {
            pila[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor "
                    + (i + 1) + " de la pila 1: "));
        }
        for (int i = 0; i < pila2.length; i++) {
            pila2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor " + 
                    (i + 1) + " de la pila 2: "));
        }
        for (int i = 0; i < pila3.length; i++) {
            pila3[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor " + 
                    (i + 1) + " de la pila 3: "));
        }

        int numeroUno = pila.length;
        int numeroDos = pila2.length;
        int numeroTres = pila3.length;

        JOptionPane.showMessageDialog(null, "El resultado de las tres pilas es: " + 
                suma(pila, pila2,
                pila3, numeroUno, numeroDos, numeroTres));

    }
}
