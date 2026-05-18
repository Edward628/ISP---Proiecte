import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.List;

public class StudentiDinFisierXlsx implements ExportStrategy {
    private final String numeFisier;

    public StudentiDinFisierXlsx(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    @Override
    public void executa(List<Student> studenti) {
        try (FileInputStream fis = new FileInputStream(numeFisier);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            System.out.println("=== Studenti cititi din " + numeFisier + " ===");

            // i=1 pentru ca sarim peste header (randul 0)
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                System.out.println(
                        (int) row.getCell(0).getNumericCellValue() + " | " +
                                row.getCell(1).getStringCellValue() + " | " +
                                row.getCell(2).getStringCellValue() + " | " +
                                row.getCell(3).getStringCellValue() + " | " +
                                row.getCell(4).getNumericCellValue()
                );
            }
        } catch (IOException e) {
            System.out.println("Eroare la citire: " + e.getMessage());
        }
    }
}
