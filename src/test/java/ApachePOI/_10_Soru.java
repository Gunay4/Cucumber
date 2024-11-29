package ApachePOI;

/*
   Main den bir metod çağırmak suretiyle, path i ve sheetName i verilen excelden
   istenilen sütun kadar veriyi okuyup bir List e atınız.
   Mainde Listi yazdırınız.
   Bu soruda kaynak Excel için : ApacheExcel2.xlsx  in 2.sheet ini kullanabilirsiniz.
 */

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _10_Soru {
    public static void main(String[] args) {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        String sheetName = "testCitizen";
        int istenenColonSayisi = 1;


         ArrayList<ArrayList<String>> gelenData=getData(path, sheetName, istenenColonSayisi);


         for (ArrayList<String> satir:gelenData) {
             for (String hucre : satir)
                 System.out.print(hucre + " ");

             System.out.println();
         }
    }

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
}
