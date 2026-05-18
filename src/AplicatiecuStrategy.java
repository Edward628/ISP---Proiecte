import java.util.ArrayList;
import java.util.*;

public class AplicatiecuStrategy {
    public static void main(String[] args) {

        List<Student> studenti = Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Student(1029,"Bianca","Popescu","TI131/1,", 10),
                new Student(1029,"Maria","Pana","TI131/2,", 4.10),
                new Student(1029,"Gabriela","Mohanu","TI131/2,", 7.33),
                new Student(1029,"Marius","Nasta","TI131/2,", 3.20),
                new Student(1029,"Marius","Nasta","TI131/1,", 5.12),
                new Student(1029,"Andrei","Dobrescu","TI131/2,", 2.22)
        );
        ExportStrategy strategie;

        // a) Afisare in consola
        strategie = new Studentiinconsola();
        strategie.executa(studenti);
        System.out.println();
        // b) Export in txt
        strategie = new StudentiinFisierTxt("studenti.txt");
        strategie.executa(studenti);
        System.out.println();
        // c) Export in xlsx
        strategie = new StudentiInFisierXlsx("studenti.xlsx");
        strategie.executa(studenti);
        System.out.println();
        // d) Citire din txt
        strategie = new StudentiDinFisierText("studenti.txt");
        strategie.executa(studenti);
        System.out.println();
        // e) Citire din xlsx
        strategie = new StudentiDinFisierXlsx("studenti.xlsx");
        strategie.executa(studenti);

    }
}
