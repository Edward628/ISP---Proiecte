package Laborator5.Advanced;

public class Lab5Adv {
    public static void main(String[] args) {

        // Integer
        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10);

        int intResult = (Integer) intCalc
                .add(5)
                .subtract(3)
                .multiply(2)
                .result();

        System.out.println("Rezultat int: " + intResult);

        // Double
        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(10.0);

        double doubleResult = (Double) doubleCalc
                .add(5)
                .subtract(3.3)
                .multiply(2.2)
                .result();

        System.out.println("Rezultat double: " + doubleResult);
    }
}
