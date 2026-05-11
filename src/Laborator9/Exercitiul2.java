package Laborator9;
import java.util.*;
import java.util.stream.*;

public class Exercitiul2 {
    public static void main(String[] args) {

        String text = "Acesta este un program scris in java pentru expresii lambda";
        List<String> cuvinte = Arrays.asList(text.split(" "));

        // a) Filtrare cuvinte cu lungime >= 5
        List<String> filtrate = cuvinte.stream()
                .filter(c -> c.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("Cuvinte cu lungime >= 5: " + filtrate);
        System.out.println("Număr de cuvinte: " + filtrate.size());

        // b) Sortare alfabetică
        List<String> sortate = filtrate.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Listă sortată: " + sortate);

        // c) Element care începe cu 'p'
        Optional<String> cuPe = sortate.stream()
                .filter(c -> c.startsWith("p"))
                .findFirst();

        cuPe.ifPresent(c -> System.out.println("Element cu 'p': " + c));
    }
}
