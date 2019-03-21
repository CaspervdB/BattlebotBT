package btconn.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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

    public void inserQuery(String sql, int id, String cmd) throws Exception
    {//String.format(sql, 9981, 'w'))
        stmt.execute(String.format(sql, id, cmd));
    }


    public ArrayList<UserCommand> executeQueryus(String sql) throws Exception
    {
        ArrayList<UserCommand> userCommands = new ArrayList<UserCommand>();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next())
        {
            UserCommand userCommand = new UserCommand(Integer.parseInt(rs.getString("ID")),
                                                Integer.parseInt(rs.getString("user_id")),
                                                rs.getString("cmd_id"));
            userCommands.add(userCommand);
        }
        return userCommands;
    }

    public void delete(int cmdId) throws Exception
    {
        stmt.execute(String.format("DELETE FROM `user_cmd` WHERE `id` = %d", cmdId));
    }
}
