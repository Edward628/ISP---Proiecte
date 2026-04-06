import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;
    double nota;

    Student(int x, String s, String t, String m) {
        numarMatricol = x;
        prenume = s;
        nume = t;
        formatieDeStudiu = m;
    }
    public void setNota(double nota)
    { this.nota = nota;

    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numarMatricol == student.numarMatricol;
    }


    public int hashCode() {
        return Objects.hash(numarMatricol);
    }


    public String toString() {
        return "NrMatricol: " + numarMatricol +
                " | Prenume: " + prenume +
                " | Nume: " + nume +
                " | Grupa: " + formatieDeStudiu +
                " | Nota: " + nota;
    }
    public static boolean existaStudent(List<Student> lista, Student s) {
        for (Student st : lista) {
            if (st.prenume.equals(s.prenume) &&
                    st.nume.equals(s.nume) &&
                    st.formatieDeStudiu.equals(s.formatieDeStudiu)) {
                return true;
            }
        }
        return false;
    }
    public String getCheie() {

        return prenume + "|" + nume + "|" + formatieDeStudiu;

    }
}
