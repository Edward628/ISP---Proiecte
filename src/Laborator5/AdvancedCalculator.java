package Laborator5;

public class AdvancedCalculator extends IntCalculator {
    public AdvancedCalculator(int initialValue) {
        super(initialValue); // apel constructor parinte
    }
    @Override
    public AdvancedCalculator add(int value) {
        super.add(value); // folosește logica din IntCalculator
        return this;      // dar returnează AdvancedCalculator
    }

    @Override
    public AdvancedCalculator subtract(int value) {
        super.subtract(value);
        return this;
    }

    @Override
    public AdvancedCalculator multiply(int value) {
        super.multiply(value);
        return this;
    }

    public AdvancedCalculator divide(int value) {
        if (value == 0) {
            throw new ArithmeticException("Nu poti imparti la 0");
        }
        this.state /= value;
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        this.state = (int) Math.pow(this.state, exponent);
        return this;
    }

    public AdvancedCalculator root(int n) {
        if (n <= 0) {
            throw new ArithmeticException("Radical invalid");
        }
        this.state = (int) Math.pow(this.state, 1.0 / n);
        return this;
    }
}
