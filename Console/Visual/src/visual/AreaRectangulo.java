
package visual;


public   class AreaRectangulo {
    
    private double base;
    private double altura;

    public AreaRectangulo() {
    }

    public AreaRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "AreaRectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    public double area(double a, double b){
        double area=a*b;
        return area;
    }
   
    
    
    
    
}
