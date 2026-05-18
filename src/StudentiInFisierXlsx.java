
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.List;
public class StudentiInFisierXlsx implements ExportStrategy {
    private final String numeFisier;

    public StudentiInFisierXlsx(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    @Override
    public void executa(List<Student> studenti) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Studenti");

        // Header
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("NrMatricol");
        header.createCell(1).setCellValue("Prenume");
        header.createCell(2).setCellValue("Nume");
        header.createCell(3).setCellValue("Grupa");
        header.createCell(4).setCellValue("Nota");

        // Date studenti
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
            System.out.println("Exportat in: " + new java.io.File(numeFisier).getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Eroare la scriere: " + e.getMessage());
        }
    }
}
