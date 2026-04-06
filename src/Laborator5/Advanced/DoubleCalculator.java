package Laborator5.Advanced;

public class DoubleCalculator extends ACalculator {
    @Override
    public void init(Object value) {
        state = (Double) value;
    }

    public DoubleCalculator add(double value) {
        state = (Double) state + value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        state = (Double) state - value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        state = (Double) state * value;
        return this;
    }

}
