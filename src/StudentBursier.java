import java.util.Objects;


public  class StudentBursier extends Student {


    private final double bursa;


    public StudentBursier(int numarMatricol, String prenume, String nume, String formatieDeStudiu, double nota, double bursa) {

        super(numarMatricol, prenume, nume, formatieDeStudiu, nota);
        this.bursa = bursa;
    }

    public double getBursa() {
        return bursa;
    }


    public StudentBursier withBursa(double bursaNoua) {
        return new StudentBursier(getNumarMatricol(), getPrenume(), getNume(), getFormatieDeStudiu(), getNota(), bursaNoua);
    }

    // Optional: Override la toString pentru a afișa și bursa
    @Override
    public String toString() {
        return super.toString() + " | Bursa: " + bursa;
    }
}