package SureshIT;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Personal\\example.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println("Cell value: " + cell.getStringCellValue());
        workbook.close();
        fis.close();
    }
}
