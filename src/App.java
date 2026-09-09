public class App {
    public static void main(String[] args) {
        Figura triangulo = new Triangulo(3,4, "Triángulo");
        Figura cuadrado = new Cuadrado(5, 3, "Cuadrado");
        Figura circulo = new Circulo(4, "Circulo");
        Figura rombo = new Rombo(2, 3, "Rombo");

        System.out.println("Áreas");
        System.out.println(triangulo.getTipo() + ": " + triangulo.area());
        System.out.println(cuadrado.getTipo() + ": " + cuadrado.area());
        System.out.println(circulo.getTipo() + ": " + circulo.area());
        System.out.println(rombo.getTipo() + ": " + rombo.area());
    }

}
