public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String tipo) {
        this.base = base;
        this.altura = altura;
        super(tipo);
    }    

    @Override 
    public double area(){
        return base*altura/2;
    }
}
