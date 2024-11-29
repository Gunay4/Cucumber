package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtility {

    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int columnCount) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        Sheet sheet=null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet(sheetName);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i <sheet.getPhysicalNumberOfRows() ; i++) {

            ArrayList<String> satir=new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                satir.add(sheet.getRow(i).getCell(j).toString());

            }
            tablo.add(satir);
        }
        return tablo;
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
