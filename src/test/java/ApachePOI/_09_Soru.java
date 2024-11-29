package ApachePOI;

// YeniExcel2.xlsx adında bir yeni excele merhaba Dünya 1 şeklinde yazı yazınız.
// Daha sonra program her yeniden çalıştırıldığında altına Merhaba Dünya 2...3
// şeklinde eklesin. Yani dosya yok ise oluşturup yazsın, daha sonra hep altına eklesin.

// File dosya=new File(path)
// if ( dosya.exists() )    dosya var ise

// Merhaba Dünya 1
// Merhaba Dünya 2
// Merhaba Dünya 3
// ...

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class _09_Soru {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/resource/Merhaba.xlsx";
        File dosya = new File(path);


        if (!dosya.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sheet1");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Merhaba Dünya 1");
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Dosya Oluşturuldu");
        }
        else {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet= workbook.getSheetAt(0);
            int enSonSatir= sheet.getPhysicalNumberOfRows();
            Row yeniSatir= sheet.createRow(enSonSatir);
            Cell yeniHucre= yeniSatir.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya "+(enSonSatir+1));
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Dosyaya Eklendi");
        }


    }
}

