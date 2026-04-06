package Laborator5;

public class IntCalculator {
    protected int state;

    // constructor
    public IntCalculator(int initialValue) {
        this.state = initialValue;
    }

    // adunare
    public IntCalculator add(int value) {
        this.state += value;
        return this;
    }

    // scadere
    public IntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    // inmultire
    public IntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }

    // returneaza rezultatul
    public int result() {
        return this.state;
    }

    // resetare
    public IntCalculator clear() {
        this.state = 0;
        return this;
    }
}

