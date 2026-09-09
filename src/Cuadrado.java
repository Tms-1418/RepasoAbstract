public class Cuadrado extends Figura{
    private double base;
    private double altura;
    
    public Cuadrado(double base, double altura, String tipo) {
        this.base = base;
        this.altura = altura;
        super(tipo);
    }    

    @Override 
    public double area(){
        return base*altura;
    }

}
