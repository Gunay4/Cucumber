package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_AbsRel extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs=statement.executeQuery("select * from film");

        rs.absolute(10); // direk 10. satıra gider
        System.out.println("10.Satır= "+rs.getString("title"));

        rs.absolute(5); // direk 5. satıra gider
        System.out.println("5.Satır= "+rs.getString("title"));

        rs.relative(5); // bulunduğun yerden 5.satıra gider : 10.satıra gider
        System.out.println("10.Satır= "+rs.getString("title"));

        DBConnectionClose();
    }
}
