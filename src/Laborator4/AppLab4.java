package Laborator4;


import java.util.HashMap;
import java.util.Map;

public class AppLab4 {
    static void main() {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);

        System.out.println("Vârste inițiale: " + varste);

        varste.put("Vlad", 19);
        varste.put("Iulia", 19);

        System.out.println("Vârste după actualizare: " + varste);

        Map<String, String> adrese = Map.of(
                "Ioan", "Sibiu", "Maria", "Bucuresti", "Victor", "Cluj",
                "Simina", "Alba-Iulia", "Marius", "Medias", "Mihai", "Cisnadie", "Daniela", "Sibiu"
        );
        HashMap<String, Tanar> tineri = new HashMap<>();

        for (String nume : varste.keySet()) {
            int varsta = varste.get(nume);
            String adresa = adrese.getOrDefault(nume, "Necunoscută");
            tineri.put(nume, new Tanar(nume, varsta, adresa));
        }
        System.out.println("\n--- Conținut instanță Tineri ---");
        for (String cheie : tineri.keySet()) {
            System.out.println(cheie + " -> " + tineri.get(cheie));
        }
    }
}
