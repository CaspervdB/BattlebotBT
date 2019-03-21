package btconn.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;

public class ConnectionDB {

    private String connString;
    private Connection conn;
    private Statement stmt;
    public ConnectionDB() throws Exception
    {
        connString= "jdbc:mysql://localhost/arduino?user=root&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        conn =  DriverManager.getConnection(connString);
        stmt = conn.createStatement();
    }

    public void executeQuery(String sql) throws Exception
    {
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next())
        {
            System.out.println("Respomse: " + rs.getString("username") + " " + rs.getString("pass"));
        }
    }

}
