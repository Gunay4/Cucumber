package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs= statement.executeQuery("select * from language");

        rs.next(); // 1 adım ileri git git, sıradakinr git
        System.out.println("1.Satır "+rs.getString(2)); // 2 index değil kolan sırası:English

        rs.next(); // 1 adım ileri git git, sıradakinr git
        System.out.println("2.Satır "+rs.getString("name")); // Italian

        rs.previous();
        System.out.println("1.Satır"+rs.getString(2)); // English

        DBConnectionClose();

    }
}
