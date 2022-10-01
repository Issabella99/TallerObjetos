public class Circulo {
    // El area es Pi por radio al cuadrado

    private double radio;
    private final double PI = 3.1416;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return PI*(Math.pow(radio,2));
    }

    public double calcularPerimetro(){
        return 2*PI*radio;
    }
}
