import java.io.*;
import java.util.List;

public class StudentiinFisierTxt implements ExportStrategy {
    private final String numeFisier;

    public StudentiinFisierTxt(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    @Override
    public void executa(List<Student> studenti) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier))) {
            for (Student s : studenti) {
                writer.write(s.toString());
                writer.newLine();
            }
            // Afiseaza calea EXACTA unde s-a creat fisierul
            System.out.println("Exportat in: " + new java.io.File(numeFisier).getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Eroare la scriere: " + e.getMessage());
        }
    }
}