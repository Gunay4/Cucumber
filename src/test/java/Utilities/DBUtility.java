package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

    private static Connection connection;
    public static Statement statement;

    public static List<List<String>> getListData(String sorgu)
    {
        DBConnectionOpen();

        List<List<String>> tablo = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {

                List<String> satir = new ArrayList<>();
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




    public static void DBConnectionOpen() {
        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DBConnectionClose() {
        try {
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
