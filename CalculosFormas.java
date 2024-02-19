public interface CalculosFormas {
    double PI = 3.1416; // Constante para el valor de PI
    
    double calcularArea();
    double calcularPerimetro();
}

// Clase Circulo implementando CalculosFormas
public class Circulo implements CalculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}

// Clase Rectangulo implementando CalculosFormas
public class Rectangulo implements CalculosFormas {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
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
}

