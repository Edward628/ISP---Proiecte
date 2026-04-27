import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Creăm lista de studenți (imutabili)
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student(1, "Popescu", "Ion", "Grupa101", 9.5));
        studenti.add(new Student(2, "Ionescu", "Ana", "Grupa101", 10.0));
        studenti.add(new Student(3, "Marin", "Vasile", "Grupa101", 8.0));
        studenti.add(new Student(4, "Radu", "Elena", "Grupa101", 9.0));
        studenti.add(new Student(5, "Dinu", "Dan", "Grupa101", 7.5));

        System.out.println("--- Lista initiala ---");
        studenti.forEach(System.out::println);


        System.out.println("\n--- Dupa impartirea in 2 formatii ---");
        imparteSiAfiseaza(studenti);
    }


    public static void imparteSiAfiseaza(List<Student> lista) {
        int dimensiuneGrupa1 = (lista.size() + 1) / 2;

        List<Student> grupa1 = lista.subList(0, dimensiuneGrupa1);
        List<Student> grupa2 = lista.subList(dimensiuneGrupa1, lista.size());

        System.out.println("Formatia 1 (" + grupa1.size() + " studenti):");
        grupa1.forEach(s -> System.out.println("  " + s));

        System.out.println("Formatia 2 (" + grupa2.size() + " studenti):");
        grupa2.forEach(s -> System.out.println("  " + s));
    }
}


