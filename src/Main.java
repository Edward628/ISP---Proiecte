import java.io.*;
import java.util.*;

public class Main {
    public static double gasesteNota(String prenume, String nume, Map<String, Student> studenti) {
        Student s = studenti.get(prenume + "|" + nume);
        if (s != null) {
            return  s.nota;
        } else {
            return 0.0f;
        }
    }
    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/studenti.txt"));
            String linie;


            while ((linie = br.readLine()) != null) {
                String[] v = linie.split(",");

                int nr = Integer.parseInt(v[0]);
                Student s = new Student(nr, v[1], v[2], v[3]);

                map.put(nr, s);
            }
            br.close();


            BufferedReader br2 = new BufferedReader(new FileReader("src/note_anon.txt"));

            while ((linie = br2.readLine()) != null) {
                String[] v = linie.split(",");

                int nr = Integer.parseInt(v[0]);
                double nota = Double.parseDouble(v[1]);

                if (map.containsKey(nr)) {
                    map.get(nr).setNota(nota);
                }
            }
            br2.close();


            for (Student s : map.values()) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        Map<String, Student> tineri = new HashMap<>();

        // Adăugăm câțiva studenți cu note
        Student bianca = new Student(1029, "Bianca", "Popescu", "TI131/1");
        bianca.setNota(9.1);
        Student ioan = new Student(1030, "Ioan", "Popa", "ISM141/2");
        ioan.setNota(8.5);

        // cheia map: "prenume|nume"
        tineri.put(bianca.prenume + "|" + bianca.nume, bianca);
        tineri.put(ioan.prenume + "|" + ioan.nume, ioan);

        // Apelăm metoda statica gasesteNota
        double notaM = gasesteNota("Bianca", "Popescu", tineri);
        double notaN = gasesteNota("Ioan", "Popescu", tineri); // student inexistent

        System.out.println("Nota Bianca Popescu: " + notaM);
        System.out.println("Nota Ioan Popescu: " + notaN);


    }
}


