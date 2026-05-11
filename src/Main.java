import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentiCuNote = Arrays.asList(
                new Student(1025, "Andrei",   "Popa",      "ISM141/2",  8.70),
                new Student(1024, "Ioan",     "Mihalcea",  "ISM141/1",  10),
                new Student(1026, "Anamaria", "Prodan",    "TI131/1",   8.90),
                new Student(1029, "Bianca",   "Popescu",   "TI131/1",   10),
                new Student(1029, "Maria",    "Pana",      "TI131/2",   4.10),
                new Student(1029, "Gabriela", "Mohanu",    "TI131/2",   7.33),
                new Student(1029, "Marius",   "Nasta",     "TI131/2",   3.20),
                new Student(1029, "Marius",   "Nasta",     "TI131/1",   5.12),
                new Student(1029, "Andrei",   "Dobrescu",  "TI131/2",   2.22)
        );

        // a) Studenți cu nota 10
        System.out.println("=== a) Nota 10 ===");
        studentiCuNote.stream()
                .filter(s -> s.getNota() == 10)
                .forEach(System.out::println);

        // b) Studenți cu nota sub 5
        System.out.println("=== b) Nota sub 5 ===");
        studentiCuNote.stream()
                .filter(s -> s.getNota() < 5)
                .forEach(System.out::println);

        // c) Nota < 4 devine 4
        System.out.println("=== c) Lista corectată ===");
        List<Student> listaCorectata = studentiCuNote.stream()
                .map(s -> s.getNota() < 4
                        ? new Student(s.getNumarMatricol(), s.getPrenume(),
                        s.getNume(), s.getFormatieDeStudiu(), 4.0)
                        : s)
                .collect(Collectors.toList());
        listaCorectata.forEach(System.out::println);

        // d) Suma notelor
        double suma = studentiCuNote.stream()
                .mapToDouble(Student::getNota)
                .reduce(0.0, Double::sum);
        System.out.println("=== d) Suma: " + suma);

        // e) Media notelor
        double media = suma / studentiCuNote.size();
        System.out.println("=== e) Media: " + media);
    }
}


