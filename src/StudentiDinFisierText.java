import java.io.*;
import java.util.List;

public class StudentiDinFisierText implements ExportStrategy {
    private final String numeFisier;

    public StudentiDinFisierText(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    @Override
    public void executa(List<Student> studenti) {
        try (BufferedReader reader = new BufferedReader(new FileReader(numeFisier))) {
            String linie;
            System.out.println("=== Studenti cititi din " + numeFisier + " ===");
            while ((linie = reader.readLine()) != null) {
                System.out.println(linie);
            }
        } catch (IOException e) {
            System.out.println("Eroare la citire: " + e.getMessage());
        }
    }
}
