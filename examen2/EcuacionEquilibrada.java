package examen2;

import java.util.Stack;
import javax.swing.JOptionPane;

public class EcuacionEquilibrada {

    private static String cadena;
    private Stack<Character> array = new Stack<Character>();

    public EcuacionEquilibrada(String cadena) {
        this.cadena = cadena;
    }

    public static boolean ordenar(String str) {
    Stack<Character> stack = new Stack<Character>();

    char caracter;
    for(int i=0; i < str.length(); i++) {
        caracter = str.charAt(i);

        if(caracter == '{')
            return false;

        if(caracter == '(')
            stack.push(caracter);

        if(caracter == '{') {
            stack.push(caracter);
            if(caracter == '}')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '{')
                    stack.pop();
        }
        else if(caracter == ')')
            if(stack.empty())
                return false;
            else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
}

    public static void main(String[] args) {        
     cadena = JOptionPane.showInputDialog("Digite una cadena");
    System.out.println(ordenar(cadena)); 
}

}
