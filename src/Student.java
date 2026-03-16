import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;

    Student(int x, String s, String t, String m) {
        numarMatricol = x;
        prenume = s;
        nume = t;
        formatieDeStudiu = m;
    }

    public String toString() {
        return "numarmatricol:" + numarMatricol + " prenume:" + prenume + " nume:" + nume + " formatieDeStudiu:" + formatieDeStudiu;
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
