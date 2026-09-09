public class Rombo extends Figura {
    private double alto;
    private double ancho;

    public Rombo(double alto, double ancho, String tipo){
        this.alto = alto;
        this.ancho = ancho;
        super(tipo);
    }

    public double area(){
        return (this.alto * this.ancho)/2;
    }

}
