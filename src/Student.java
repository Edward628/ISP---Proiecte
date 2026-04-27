import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public  class Student {
    private final int numarMatricol;
    private final String prenume;
    private final String nume;
    private final String formatieDeStudiu;
    private final double nota;


    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu, double nota) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;
    }

    public Student withFormatieDeStudiu(String nouaFormatie) {
        return new Student(this.numarMatricol, this.prenume, this.nume, nouaFormatie, this.nota);
    }

    public int getNumarMatricol() { return numarMatricol; }
    public String getPrenume() { return prenume; }
    public String getNume() { return nume; }
    public String getFormatieDeStudiu() { return formatieDeStudiu; }
    public double getNota() { return nota; }

    public String getCheie() {
        return prenume + "|" + nume + "|" + formatieDeStudiu;
    }

    public static boolean existaStudent(List<Student> lista, Student s) {
        for (Student st : lista) {

            if (st.getPrenume().equals(s.getPrenume()) &&
                    st.getNume().equals(s.getNume()) &&
                    st.getFormatieDeStudiu().equals(s.getFormatieDeStudiu())) {
                return true;
            }
        }
        return false;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numarMatricol == student.numarMatricol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMatricol);
    }

    @Override
    public String toString() {
        return "NrMatricol: " + numarMatricol +
                " | Prenume: " + prenume +
                " | Nume: " + nume +
                " | Grupa: " + formatieDeStudiu +
                " | Nota: " + nota;
    }
}
