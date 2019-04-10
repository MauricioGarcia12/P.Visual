
package visual;


public  class CostoMesa extends AreaRectangulo{
    private double valor;

    public CostoMesa() {
        super();
    }

    public CostoMesa(double valor, double base, double altura) {
        super(base, altura);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "CostoMesa{" + "valor=" + valor + '}';
    }
    public double costo(double altura, double base,double valor){
        double costo=(altura*base)*valor;
        return costo;
    }

    
    
    
    
}
