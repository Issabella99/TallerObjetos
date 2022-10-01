public class Paralelogramo {
    private int base;
    private int altura;
    private int lado;

    public Paralelogramo(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double calcularArea() {
        return (base * altura);
    }

    public int calcularPerimetro() {
        return 2*(base+lado);
    }
}
