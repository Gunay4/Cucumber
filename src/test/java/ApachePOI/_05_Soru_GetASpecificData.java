package ApachePOI;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */


public class _05_Soru_GetASpecificData {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        Scanner read = new Scanner(System.in);

        System.out.print("Aranacak Kelimeyi giriniz :");
        String arananKelime = read.nextLine();

        ExceldenGetir(arananKelime, path);


    }

    public static void ExceldenGetir(String arananKelime, String path) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(arananKelime))

                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    System.out.print(sheet.getRow(i).getCell(j) + " ");
                }

        }

    }

}
