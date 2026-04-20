import java.util.ArrayList;
import java.util.List;

public class AplicatieCuBursa {
    public static void main(String[] args) {
        AplicatieCuBursa instanta = new AplicatieCuBursa();
        List<StudentBursier> lista = instanta.genereaza();

        System.out.println("--- Lista Generata ---");
        for (StudentBursier s : lista) System.out.println(s);

        System.out.println("--------------------------------------------------");

        List<StudentBursier> sortata = instanta.sorteaza(lista);

        System.out.println("--- Lista Sortata ---");
        for (StudentBursier s : sortata) System.out.println(s);
    }

    public List<StudentBursier> genereaza() {
        List<StudentBursier> lista = new ArrayList<>();
        lista.add(new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 8.70, 725.50));
        lista.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80, 801.10));
        lista.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10, 780.80));
        lista.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 8.90, 745.50));
        lista.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10, 100.00));
        return lista;
    }

    public List<StudentBursier> sorteaza(List<StudentBursier> lst) {
        List<StudentBursier> lista = new ArrayList<>(lst);
        int n = lista.size();


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                StudentBursier s1 = lista.get(j);
                StudentBursier s2 = lista.get(j + 1);


                if (!vineInaintea(s1, s2)) {
                    lista.set(j, s2);
                    lista.set(j + 1, s1);
                }
            }
        }
        return lista;
    }

    private boolean vineInaintea(StudentBursier s1, StudentBursier s2) {

        if (!s1.formatieDeStudiu.equals(s2.formatieDeStudiu))
            return s1.formatieDeStudiu.compareTo(s2.formatieDeStudiu) < 0;


        if (!s1.nume.equals(s2.nume))
            return s1.nume.compareTo(s2.nume) < 0;


        if (!s1.prenume.equals(s2.prenume))
            return s1.prenume.compareTo(s2.prenume) < 0;


        if (s1.nota != s2.nota)
            return s1.nota > s2.nota;


        return s1.cuantumBursa > s2.cuantumBursa;
    }
}
