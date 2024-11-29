package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0); // ilk sayfa

        //1.Yol
        //zoo.leng kaç satırım var
        int rowCount= sheet.getPhysicalNumberOfRows();//satır sayısı
        System.out.println("rowCount = " + rowCount);

        for (int i = 0; i < rowCount; i++) {
            Row row= sheet.getRow(i); // satırı aldım
            int cellCount=row.getPhysicalNumberOfCells(); //satırdaki hücre sayisi, zoo[i] length

            for (int j = 0; j < cellCount; j++) {
                System.out.print(row.getCell(j)+" ");
            }

            System.out.println();
        }

        //2.Yol
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {  //zoo.length

            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {  //zoo[i].length
                System.out.print(sheet.getRow(i).getCell(j)+" "); //zoo[i][j]
            }

            System.out.println();
        }
    }
}
