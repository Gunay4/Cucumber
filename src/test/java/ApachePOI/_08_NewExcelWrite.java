package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        // Ortada bir excel olmadığına göre
        // Workbook u ve Sheet i hafızada oluştumam lazım

        XSSFWorkbook workbook=new XSSFWorkbook(); // hafızadaki workbook
        XSSFSheet sheet= workbook.createSheet("Sayfa1");

        Row row= sheet.createRow(0);
        Cell cell= row.createCell(0);
        cell.setCellValue("Merhaba Dünyalı");

        String path="src/test/java/ApachePOI/resource/YeniExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("İşlem Tamamlandı");
    }
}
