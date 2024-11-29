package _JDBC;

import java.sql.*;

// city tablosundaki tüm satırlardaki şehir isimlerini next ile yazdırınız
public class _02_Soru {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";


        Connection baglanti = DriverManager.getConnection(url, username, password);
        Statement sorguEkrani = baglanti.createStatement();
        ResultSet sonucTablosu = sorguEkrani.executeQuery("select * from customer");

        while (sonucTablosu.next()) {
            String ad = sonucTablosu.getString("first_name");
            String soyad = sonucTablosu.getString("last_name");
            System.out.println("Ad ve soyad= " + ad + " " + soyad);
        }
    }
}
