
package visual;

import java.util.Scanner;


public class TestExamen {

    public static void main(String[] args) {
        CostoMesa costoMesa= new CostoMesa();
        
        Scanner entrada= new Scanner(System.in);
        double base,altura,valor;
        System.out.println("Digite la base: ");
        base=entrada.nextDouble();
        System.out.println("Digite la altura: ");
        altura=entrada.nextDouble();
        System.out.println("Digite el valor: ");
        valor=entrada.nextDouble();
        
        Double CM=costoMesa.costo(altura, base, valor);
        Double A=costoMesa.area(base, altura);
        System.out.println("Su costo de la mesa es: "+CM+"$");
        System.out.println("El area de su mesa es de: "+A+"cm^2");
        
        
    }
    
}
