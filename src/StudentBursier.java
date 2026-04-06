import java.util.Objects;

public class StudentBursier extends Student {
    double cuantumBursa;

    public StudentBursier(int numarMatricol, String prenume, String nume,
                          String formatieDeStudiu, double nota, double cuantumBursa) {
        super(numarMatricol, prenume, nume, formatieDeStudiu);
        this.nota = nota;
        this.cuantumBursa = cuantumBursa;
    }


    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        StudentBursier that = (StudentBursier) o;
        return Double.compare(that.cuantumBursa, cuantumBursa) == 0;
    }


    public int hashCode() {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }

    // toString
    public String toString() {
        return super.toString() + " | CuantumBursa: " + cuantumBursa;
    }

}
