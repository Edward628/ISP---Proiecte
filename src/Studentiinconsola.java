import java.util.List;

public class Studentiinconsola implements ExportStrategy {
    @Override
    public void executa(List<Student> studenti) {
        System.out.println("=== Lista studenti ===");
        studenti.forEach(System.out::println);
    }

}
