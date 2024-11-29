package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class _11_Soru extends JDBCParent {
// Kendisine gönderilen bir select sorgusunun sonucunu ArrayList olarak döndüren
    // metodu yazınız. Mainde Listi yazrırarak sonucu kontrol ediniz.

    public static void main(String[] args)  {
        String sorgu = ("select * from language");

        List<ArrayList<String>> gelenData = getListData(sorgu);

        for (ArrayList<String> satir : gelenData) {
            for (String hucre : satir)
                System.out.print(hucre + "\t");

            System.out.println();
        }
    }

    public static List<ArrayList<String>> getListData(String sorgu)
    {
        DBConnectionOpen();

        List<ArrayList<String>> tablo = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {

                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {// bu bölüm satırdaki kolonları yazdırır
                    satir.add(rs.getString(i));

                    tablo.add(satir);
                }
            }
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        DBConnectionClose();
        return tablo;
    }

}
