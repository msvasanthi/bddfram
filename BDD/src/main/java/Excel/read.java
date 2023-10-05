package Excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class read {
    public static String Excel(int row, int column) throws IOException {
        String testData = null;
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vasan\\IdeaProjects\\BDD\\src\\main\\resources\\Test.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);


        testData = String.valueOf(sheet.getRow(row).getCell(column));
        return testData;

    }
}