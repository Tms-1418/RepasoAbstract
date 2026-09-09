public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String tipo){
        this.radio = radio;
        super(tipo);
    }

    public double area(){
        return Math.PI * this.radio * this.radio;
    }
}
