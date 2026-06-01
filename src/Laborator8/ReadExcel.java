package Laborator8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcel {

    public static void main(String[] args) {
        citesteFisier();
        scrieRezultat();
        scrieRezultatCuFormula();
    }

    // 8.5.1 - citire fisier
    public static void citesteFisier() {
        String caleaFisierului = "laborator8_input.xlsx";

        try (FileInputStream fis = new FileInputStream(new File(caleaFisierului));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;

                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            double valoare = cell.getNumericCellValue();
                            if (valoare == (long) valoare) {
                                System.out.print((long) valoare + "\t");
                            } else {
                                System.out.print(valoare + "\t");
                            }
                            break;
                        default:
                            System.out.print("N/A\t");
                            break;
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Eroare la citire: " + e.getMessage());
        }
    }

    // 8.5.2 - copiere + coloana medie calculata in Java
    public static void scrieRezultat() {
        String fisierIntrare = "laborator8_input.xlsx";
        String fisierIesire  = "laborator8_output2.xlsx";

        try (FileInputStream fis = new FileInputStream(new File(fisierIntrare));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {

                if (row.getRowNum() == 0) {
                    int ultimaColoana = row.getLastCellNum();
                    row.createCell(ultimaColoana).setCellValue("Medie");
                    continue;
                }

                double nota1 = row.getCell(3).getNumericCellValue();
                double nota2 = row.getCell(4).getNumericCellValue();
                double nota3 = row.getCell(5).getNumericCellValue();
                double medie = (nota1 + nota2 + nota3) / 3;

                medie = Math.round(medie * 100.0) / 100.0;

                int ultimaColoana = row.getLastCellNum();
                row.createCell(ultimaColoana).setCellValue(medie);
            }

            try (FileOutputStream fos = new FileOutputStream(fisierIesire)) {
                workbook.write(fos);
                System.out.println("8.5.2 - Fisier generat: " + new File(fisierIesire).getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }

    // 8.5.3 - copiere + coloana medie cu formula Excel
    public static void scrieRezultatCuFormula() {
        String fisierIntrare = "laborator8_input.xlsx";
        String fisierIesire  = "laborator8_output3.xlsx";

        try (FileInputStream fis = new FileInputStream(new File(fisierIntrare));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {

                if (row.getRowNum() == 0) {
                    int ultimaColoana = row.getLastCellNum();
                    row.createCell(ultimaColoana).setCellValue("Medie");
                    continue;
                }

                int rowExcel = row.getRowNum() + 1;
                String formula = "AVERAGE(D" + rowExcel + ":F" + rowExcel + ")";

                int ultimaColoana = row.getLastCellNum();
                row.createCell(ultimaColoana).setCellFormula(formula);
            }

            try (FileOutputStream fos = new FileOutputStream(fisierIesire)) {
                workbook.write(fos);
                System.out.println("8.5.3 - Fisier generat: " + new File(fisierIesire).getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}