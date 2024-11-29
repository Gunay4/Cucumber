package ApachePOI;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/*
   Main den bir metod çağırmak suretiyle, henüz oluşturulmamış
   path i verilen excel için, program her çalıştıkça içine "test passed"
   yazısını ekleyen metodu yazınız.
   Yani dosya yoksa oluştur ilk satıra yaz, sonra dosya oluşacağı için
   dosya varsa en son satırın altına yaz.


 */

public class _11_Soru {
    public static void main(String[] args) {
        String path="src/test/java/ApachePOI/resource/TestSonuclari3.xlsx";

        String testName="Test Name";
        String testSonuc="Test Passed";

        writeToExcel(path, testName, testSonuc); //excel create
        writeToExcel(path, testName, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testName, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testName, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, testName, testSonuc); //dosya artık var ekleyecek
    }

    public static void writeToExcel(String path, String testName, String testResult){
        File dosya=new File(path);
        try {
            if (!dosya.exists()) { // dosya yok ise
                XSSFWorkbook workbook = new XSSFWorkbook(); //yeni oluştur
                XSSFSheet sheet = workbook.createSheet("Sayfa1");
                Row yeniSatir = sheet.createRow(0);

                Cell yeniHucre = yeniSatir.createCell(0);
                yeniHucre.setCellValue(testName);  //değeri ver

                yeniHucre = yeniSatir.createCell(1);
                yeniHucre.setCellValue(testResult);  //değeri ver

                FileOutputStream outputStream = new FileOutputStream(path);  //kaydet
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
                System.out.println("Dosya oluşturuldu");
            } else {  //dosya var ise
                FileInputStream inputStream = new FileInputStream(path);  //var olanı oku
                Workbook workbook = WorkbookFactory.create(inputStream);
                Sheet sheet = workbook.getSheetAt(0);
                int enSonSatir = sheet.getPhysicalNumberOfRows();

                Row yeniSatir = sheet.createRow(enSonSatir);
                Cell yeniHucre = yeniSatir.createCell(0);
                yeniHucre.setCellValue(testName);  //değeri ver

                yeniHucre = yeniSatir.createCell(1);
                yeniHucre.setCellValue(testResult);  //değeri ver

                FileOutputStream outputStream = new FileOutputStream(path);  //kaydet
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
                System.out.println("Dosyaya Eklendi");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}


