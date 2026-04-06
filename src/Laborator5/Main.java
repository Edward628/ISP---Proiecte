package Laborator5;

public class Main {
    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);

        int result = calculator
                .add(5)
                .subtract(3)
                .multiply(2)
                .result();

        System.out.println("a) " + result);

        System.out.println();
        AdvancedCalculator calc = new AdvancedCalculator(16);


        int resultat = calc
                .add(4)
                .divide(2)
                .power(2)
                .root(2)
                .result();

        System.out.println("b) " + resultat);
    }
}
