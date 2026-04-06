package Laborator5.Advanced;

public class NewIntCalculator extends ACalculator {
    @Override
    public void init(Object value) {
        state = (Integer) value;
    }

    public NewIntCalculator add(int value) {
        state = (Integer) state + value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        state = (Integer) state - value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        state = (Integer) state * value;
        return this;
    }

}
