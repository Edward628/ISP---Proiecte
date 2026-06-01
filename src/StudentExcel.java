import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentExcel {

    public static void main(String[] args) {

        List<Student> studenti = Arrays.asList(
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

        // a) export in xls
        exportStudenti(studenti);

        // b) citire din xls
        List<Student> studentiCititi = citesteStudenti();
        System.out.println("\n=== Studenti cititi din fisier ===");
        studentiCititi.forEach(System.out::println);
    }

    // a) exporta lista de studenti in laborator8_students.xls
    public static void exportStudenti(List<Student> studenti) {
        String numeFisier = "laborator8_students.xls";

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Studenti");

        // header
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("NrMatricol");
        header.createCell(1).setCellValue("Prenume");
        header.createCell(2).setCellValue("Nume");
        header.createCell(3).setCellValue("Grupa");
        header.createCell(4).setCellValue("Nota");

        // date studenti
        for (int i = 0; i < studenti.size(); i++) {
            Student s = studenti.get(i);
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(s.getNumarMatricol());
            row.createCell(1).setCellValue(s.getPrenume());
            row.createCell(2).setCellValue(s.getNume());
            row.createCell(3).setCellValue(s.getFormatieDeStudiu());
            row.createCell(4).setCellValue(s.getNota());
        }

        try (FileOutputStream fos = new FileOutputStream(numeFisier)) {
            workbook.write(fos);
            workbook.close();
            System.out.println("a) Exportat in: " + new File(numeFisier).getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Eroare la export: " + e.getMessage());
        }
    }

    // b) citeste laborator8_students.xls si returneaza lista de studenti
    public static List<Student> citesteStudenti() {
        String numeFisier = "laborator8_students.xls";
        List<Student> studenti = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(numeFisier));
             Workbook workbook = new HSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;

                int nrMatricol = (int) row.getCell(0).getNumericCellValue();
                String prenume = row.getCell(1).getStringCellValue();
                String nume    = row.getCell(2).getStringCellValue();
                String grupa   = row.getCell(3).getStringCellValue();
                double nota    = row.getCell(4).getNumericCellValue();

                studenti.add(new Student(nrMatricol, prenume, nume, grupa, nota));
            }

            System.out.println("b) Cititi " + studenti.size() + " studenti din: " + numeFisier);

        } catch (IOException e) {
            System.out.println("Eroare la citire: " + e.getMessage());
        }

        return studenti;
    }
}