package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Soru_2 extends JDBCParent {
    public static void main(String[] args) throws SQLException {

        DBConnectionOpen();

        ResultSet sonuc= statement.executeQuery("select * from city");

        while (sonuc.next())
            System.out.println(sonuc.getString("city"));

        DBConnectionClose();
    }
}
