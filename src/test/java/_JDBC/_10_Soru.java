package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _10_Soru extends JDBCParent {

    // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
    // aynı mysql sonuç ekranında olduğu gibi
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();


        int kolonSayisi = rsmd.getColumnCount();
        for (int i = 1; i <= kolonSayisi ; i++) { // baslıkları yaz
            System.out.print(rsmd.getColumnName(i) + "\t");
        }

        System.out.println(); // baslıklardan sonra 1 satır atla

        while (rs.next()) {

            for (int i = 1; i <=kolonSayisi ; i++) { // bu bölüm satırdaki kolonları yazdırır
                System.out.print(rs.getString(i)+"\t");
            }

            System.out.println();

        }


        DBConnectionClose();

    }
}
