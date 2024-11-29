package _JDBC;

import java.sql.*;

public class _01_Giris {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        //1- bağlantı bilgilerini girdik DB server bağlandık
        Connection baglanti = DriverManager.getConnection(url, username,password );

        //2- sorgu ekranını açtık
        Statement sorguEkrani= baglanti.createStatement();

        //3- Sorgu ekranına sorguyu yazdım ve çalıştırdım
        ResultSet sonucTablosu = sorguEkrani.executeQuery("select * from customer");


        //4- Altta sonnuçlar gözüküyordu programda, burada next ile her bir satıra ulaşıp alıyorum
        sonucTablosu.next();
        String ad=sonucTablosu.getString("first_name");
        String soyad=sonucTablosu.getString("last_name");
        System.out.println("1.Satır ad ve soyad= "+ad+" "+soyad);


        sonucTablosu.next();
        ad=sonucTablosu.getString("first_name");
        soyad=sonucTablosu.getString("last_name");
        System.out.println("2.Satır ad ve soyad= "+ad+" "+soyad);

        baglanti.close();
    }
}
