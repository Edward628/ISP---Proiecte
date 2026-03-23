import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

void main() throws IOException {

    String in = Files.readString(Path.of("src/in.txt"));

    System.out.println("Input:\n" + in + "\n");

    // punem liniile intr-un array (folosim split dupa \n)
    String[] lines = in.split("\n");

    // a) adaugam \n la fiecare linie
    System.out.println("=== a) ===");
    String resultA = "";
    for (String line : lines) {
        resultA += line + "\n";
    }
    System.out.print(resultA);

    // b) adaugam \n dupa fiecare punct
    System.out.println("\n=== b) ===");
    String resultB = in.replace(".", ".\n");
    System.out.println(resultB);

    // c) scriem in out.txt
    String finalResult = "=== a) ===\n" + resultA +
            "\n=== b) ===\n" + resultB;

    Files.writeString(Path.of("src/out.txt"), finalResult);
}