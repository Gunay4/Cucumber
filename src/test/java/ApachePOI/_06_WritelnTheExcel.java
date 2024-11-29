package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WritelnTheExcel {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int enSonSatir = sheet.getPhysicalNumberOfRows(); // en son var olan satır no su
        Row yeniSatir = sheet.createRow(enSonSatir); // en son da olan boş satır için yeni satır oluşturdu
        Cell yeniHucre = yeniSatir.createCell(0);// yeni satırda hücre oluşturdu

        yeniHucre.setCellValue("Merhaba Dünya");
        inputStream.close(); //okuma modunu kapat

        //dosyayı kaydet
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream); //workbook u yaz,kaydet
        workbook.close();// hafıza boşalt
        fileOutputStream.close(); // yazma modunu kapat

        System.out.println("işlem tamamlandı");

    }
}
