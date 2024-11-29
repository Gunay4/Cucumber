package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowgetTypei extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs=statement.executeQuery("select city from city");

        rs.last();
        System.out.println("Son satır = "+rs.getString(1)); // son satır
        int kacinciSatirdayim=rs.getRow();
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

        rs.first();
        System.out.println("İlk satır = "+rs.getString(1)); // son satır
        kacinciSatirdayim=rs.getRow(); // sorgunun sonuncuda dönen kayıt sayısı;
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

        DBConnectionClose();
    }
}
