package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ekrandaki gibi bir Excel Çarpım tablosunu
 * varolan boş bir excel dosyasına
 * 1 den 10 kadar çarpımlar için yapınız.
 * (ipucu önce sadece 1 leri yapınız sonra
 * diğerlerini)
 */
//        1 x 1 = 1
//        1 x 2 = 2
//        1 x 3 = 3
//        1 x 4 = 4
//        1 x 5 = 5
//        1 x 6 = 6
//        1 x 7 = 7
//        1 x 8 = 8
//        1 x 9 = 9
//        1 x 10 = 10
public class _07_Soru1 {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/Carpim.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int enSonSatir =0;  // sheet.getPhysicalNumberOfRows(); //kaldığın satırdan devam et

        for (int i = 1; i <= 10; i++) {
          Row yeniSatir=sheet.createRow(enSonSatir++);
           Cell hucre1= yeniSatir.createCell(0);  hucre1.setCellValue(1);
           Cell hucre2= yeniSatir.createCell(1);  hucre2.setCellValue("x");
           Cell hucre3= yeniSatir.createCell(2);  hucre3.setCellValue(i);
           Cell hucre4= yeniSatir.createCell(3);  hucre4.setCellValue("=");
           Cell hucre5= yeniSatir.createCell(4);  hucre5.setCellValue(i*1);

        }


        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();

        System.out.println("İşlem Tamamlandı");
    }
}
