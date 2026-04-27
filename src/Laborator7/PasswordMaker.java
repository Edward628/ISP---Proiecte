package Laborator7;

public class PasswordMaker {

    private static final PasswordMaker instance;
    private static int accessCounter = 0; // Acesta va număra apelurile

    private static final int MAGIC_NUMBER = 3;
    private static final String MAGIC_STRING;

    static {
        StringRandomizer srand = new StringRandomizer();
        MAGIC_STRING = srand.randomString(20);
        instance = new PasswordMaker();
    }

    private PasswordMaker() {
    }

    public static PasswordMaker getInstance() {
        accessCounter++; // Incrementăm contorul aici
        return instance;
    }

    // Aceasta este metoda care trebuie să se numească EXACT așa pentru Main
    public static int getCallingCounts() {
        return accessCounter;
    }

    public String getPassword() {
        java.util.Random r = new java.util.Random();
        String ln = "" + 5;
        StringRandomizer srand = new StringRandomizer();
        return srand.randomString(MAGIC_NUMBER) + srand.randomString(10, MAGIC_STRING) + ln;
    }
}

